import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();

    }
}
