import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.PrintWriter;
import java.net.URLEncoder;

public class AppleScrapper {

    //URL: https://www.google.com/search?q=apple
    //Selector: h3.r a

    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36";

    public static void main(String[] args) throws Exception {

        final String query = "apple";

        final Document page = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(query, "UTF-8")).userAgent(USER_AGENT).get();

        final PrintWriter out = new PrintWriter("results.txt");

        for (Element searchResult : page.select("h3.r a")) {

            final String title = searchResult.text();
            final String url = searchResult.attr("href");

            out.write(title + " -> " + url + "\n");
        }

        out.close();
    }
}
