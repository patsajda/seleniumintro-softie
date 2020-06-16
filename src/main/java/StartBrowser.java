import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/patryk.sajdak/IdeaProjects/webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
