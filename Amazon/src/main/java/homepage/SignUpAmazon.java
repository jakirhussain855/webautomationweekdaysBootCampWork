package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpAmazon extends CommonAPI {
    //div[@class='nav-signin-tooltip-footer']//a[@class='nav-a'][contains(text(),'Start here.')]
    //  @FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
    @FindBy(xpath = "//div[@class='nav-signin-tooltip-footer']//a[@class='nav-a'][contains(text(),'Start here.')]")
    public static WebElement startHERE;
    @FindBy(xpath = "//input[@id='ap_customer_name']")
    public static WebElement WriteYourName;
    @FindBy(xpath = "//input[@id='ap_email']")
    public static WebElement WriteYourEmail;
    @FindBy(xpath = "//input[@id='ap_password']")
    public static WebElement WriteYourPassword;
    @FindBy(xpath = "//input[@id='ap_password_check']")
    public static WebElement ReEnterYourPassword;
    @FindBy(xpath = "//input[@id='continue']")
    public static WebElement ClIckOnCreate;

    public void ClickOnStartHere() {
        startHERE.click();
        //sleepFor(10);
    }

    public void Write() {
        WriteYourName.sendKeys("Jakir");
        WriteYourEmail.sendKeys("hussain100@yahoocom");
        WriteYourPassword.sendKeys("QWP1");
        ReEnterYourPassword.sendKeys("abcdef");
        ClIckOnCreate.click();
        System.out.println("****Amazon Page Doesnot let me Sign In" +
                " I tried to resolve  it with brother" +
                "**FAHIM**,he said this is Amazon Page issue" +
                "so I create this insted of log out***");
    }


//LogInAmazon logInAmazon=new LogInAmazon();
//public void SignIN(){
////    LogInAmazon logInAmazon= PageFactory.initElements(driver,LogInAmazon.class);
////
////    logInAmazon.validateSignInBar();
////    sleepFor(2);
////    // logInAmazon.validateclickon();
////    //sleepFor(5);
//
//}
//@FindBy(xpath = "//a[@id='createAccountSubmit']")
//public static     WebElement ClickONCreateAmazonAccount;
//public void ClickOnCreateAmazonAccount(){
//    ClickONCreateAmazonAccount.click();
//}
}

