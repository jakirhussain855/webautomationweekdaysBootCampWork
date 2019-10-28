package homepagetests;

import base.CommonAPI;
import homepage.SignUpAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpTest extends CommonAPI {
    SignUpAmazon signUpAmazon = PageFactory.initElements(driver, SignUpAmazon.class);

    @Test
    public void SignUp() {
        SignUpAmazon signUpAmazon = PageFactory.initElements(driver, SignUpAmazon.class);
        signUpAmazon.ClickOnStartHere();
        signUpAmazon.Write();
        sleepFor(5);
    }


//      SignIN();
//     signUpAmazon.ClickOnCreateAmazonAccount();


}



