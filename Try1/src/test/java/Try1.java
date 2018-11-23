import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Try1 {
    public static void main(String[] args) {
        // write your code here

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org/download/");
    }
}
