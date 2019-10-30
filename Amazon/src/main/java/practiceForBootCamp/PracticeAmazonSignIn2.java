package practiceForBootCamp;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PracticeAmazonSignIn2 extends CommonAPI {

    AmazonPractice1 amazonPractice1;

   @FindBy(xpath = "//input[@id='ap_email']")
    WebElement SignIn;
   @FindBy(xpath = "//input[@id='continue']")
   WebElement ContinueClick;
   @FindBy(xpath = "//input[@id='ap_password']")
   WebElement PassWordTpe;

   public void SigninIsDisplayed(){
       Assert.assertEquals(SignIn.isDisplayed(),true,"NOT DISPLAYED");
   }
   //public void SigninIsEnable(){
   public void SigninIsEnable(String email){
       //SignIn.sendKeys("Boss@gmail.com");
       SignIn.sendKeys(email);
   }
   public  void SigninClickeble(){
       SignIn.click();
   }
   public  void SignInClickToContinue(){
       ContinueClick.click();

   }
   public  void SignInPassword(){
       PassWordTpe.sendKeys("abc12");
       PassWordTpe.click();
   }


    public void SignInValid(){

        amazonPractice1= PageFactory.initElements(driver,AmazonPractice1.class);
        amazonPractice1.AmazonPageClickOnValid();

    }



}
