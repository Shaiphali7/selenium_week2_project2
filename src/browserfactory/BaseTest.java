package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser() {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser()
    {
        driver.quit();
    }



}
