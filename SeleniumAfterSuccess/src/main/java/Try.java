import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Try {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\JetBrains\\geckodriver-v0.22.0-win64\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.lynda.com/Selenium-tutorials/Mastering-Selenium-Testing-Tools/521207-2.html");
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.close();
    }
}