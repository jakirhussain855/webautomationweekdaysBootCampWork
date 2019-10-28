package homepagetests;

import base.CommonAPI;
import homepage.LogInAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInAmazonTest extends CommonAPI {
    @Test(enabled = true)
    public void TestEmailbar() {
        LogInAmazon logInAmazon = PageFactory.initElements(driver, LogInAmazon.class);


        logInAmazon.validateSignInBar();
        sleepFor(2);
        // logInAmazon.validateclickon();
        //sleepFor(5);
        logInAmazon.validateEmail();
        sleepFor(2);
        logInAmazon.ClickOnContinueBar();
        sleepFor(2);
        logInAmazon.clickOnPasswordBar();
        sleepFor(2);
        logInAmazon.ClickOnSignInBar();
        sleepFor(2);
    }

}
