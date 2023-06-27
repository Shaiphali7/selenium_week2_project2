package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Before
    public void setUp() {
        //Opening the browser
        openBrowser();
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Entering the user name

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        //Entering the password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        //Click in Login button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        //verifying 'Dashboard' text is display
        String actualDashBoardText=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        String expectedDashBoardText="Dashboard";
        Assert.assertEquals("Not the same text",actualDashBoardText,expectedDashBoardText);
    }

    @After
    public void tearDown() {
        //Closing browser
        closeBrowser();
    }
}
