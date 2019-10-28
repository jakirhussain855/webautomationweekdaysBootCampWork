package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogInAmazon extends CommonAPI {

    @FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")

    public static WebElement clickSignInBar;
    @FindBy(xpath = "//input[@id='ap_email']")

    public static WebElement email;
    @FindBy(xpath = "//input[@id='continue']")
    public static WebElement clickContinue;
    @FindBy(xpath = "//input[@id='ap_password']")
    public static WebElement clickpassword;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    public static WebElement ClickSignIn;

    public void validateSignInBar() {

        clickSignInBar.click();
Assert.assertEquals(clickSignInBar.isEnabled(),true);

    }

    public void validateEmail() {
        email.sendKeys("jakir.hussain855@gmail.com");
        Assert.assertEquals(email.isDisplayed(), true);
        //TestLogger.log("Email Id is Typed");
    }

    public void ClickOnContinueBar() {

        clickContinue.click();

    }

    public void clickOnPasswordBar() {
        clickpassword.sendKeys("Sylhet2013");
        clickpassword.click();
    }

    public void ClickOnSignInBar() {
        ClickSignIn.click();

    }

}
