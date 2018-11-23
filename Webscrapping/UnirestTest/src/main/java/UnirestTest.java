import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.apache.http.HttpHost;

public class UnirestTest {

    public static void main(String[] args) throws Exception
    {
        Unirest.setDefaultHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");

        Unirest.setProxy(new HttpHost("103.215.25.50",8080));   // hostname depends on free proxy provider
     /*   final HttpResponse<String> respons = Unirest.get("https://httpbin.org/get").asString();
        System.out.println(respons.getBody());
        */
     final HttpResponse<JsonNode> response = Unirest.get("https://httpbin.org/get").asJson();
        System.out.println(response.getBody().getObject().getString("origin"));
        System.out.println(response.getBody().getObject().getJSONObject("headers").getString("User-Agent"));

    }
}
