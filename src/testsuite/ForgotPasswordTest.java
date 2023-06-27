package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    @Before
    public void setUp() {
        //Opening the browser
        openBrowser();
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //Click on 'Forgot your password'
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
    //Verify the text 'Reset Password'
        String actualResetPasswordText= driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
    String expectedResetPasswordText="Reset Password";
    //Comparing both the text
        Assert.assertEquals("Not the same heading",expectedResetPasswordText,actualResetPasswordText);
    }

    @After
    public void tearDown() {
        //Closing browser
        closeBrowser();
    }

}
