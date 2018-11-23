import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.PrintWriter;
import java.net.URLEncoder;

public class GoogleScrapper {

    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36";

    public static void main (String[] args) throws Exception
    {
        final String query = "apple";
        final Document page = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(query, "UTF-8")).userAgent(USER_AGENT).get();

        //It is a common requirement to implement URL encoding and decoding in Java while creating crawlers or downloaders.
        //Document class	Connection.get​()  Execute the request as a GET, and parse the result.

       // System.out.println(page.outerHtml()); this option is used to check whether the DOM is persed or not.
        // If problem persist USER Agent from tutorial need to follow.

        final PrintWriter out = new PrintWriter("result.text");

        for (Element searchResult : page.select("h3.r a"))
        //Elements	select​(String cssQuery)	 Find elements that match the Selector CSS query, with this element as the starting context.
        {
            final String title = searchResult.text();
            //String	text​()	Gets the combined text of this element and all its children.

            final String URL = searchResult.attr("href");
            //Element	attr​(String attributeKey, String attributeValue) Set an attribute value on this element.

            // System.out.println(title + "=>" + URL); this step is to check printed result on console
            out.write(title + "=>" + URL + "\n");
        }

        out.close();

    }
}
