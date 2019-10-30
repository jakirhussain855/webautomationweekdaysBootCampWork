package AmazonQuickTest;

import AmazonQuickValid.AmazonPractice1;
import AmazonQuickValid.PracticeAmazonSignIn2;
import SearchResult.ResultPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonPracticeTest1 extends CommonAPI {
    AmazonPractice1 amazonPractice1;
    PracticeAmazonSignIn2 practiceAmazonSignIn2 = new PracticeAmazonSignIn2();
    ResultPage resultPage = new ResultPage();

    @BeforeMethod
    public void VALIDITY() {
        amazonPractice1 = PageFactory.initElements(driver, AmazonPractice1.class);
        practiceAmazonSignIn2 = PageFactory.initElements(driver, PracticeAmazonSignIn2.class);
        resultPage = PageFactory.initElements(driver, ResultPage.class);

    }

    @Test(enabled = false)
    public void AmazonPageisDisplayValidation() {
        amazonPractice1.AmazonPageDisplayValid();
        sleepFor(4);
        // amazonPractice1.AmazonPageClickOnValid();
        amazonPractice1.AmazonPageBarsEnable();

        sleepFor(4);
        amazonPractice1.AmazonPageClickOnValid();
        sleepFor(3);

    }

    @Test
    public void SignInTest() {
        practiceAmazonSignIn2.SignInValid();
        sleepFor(1);
        practiceAmazonSignIn2.SigninIsDisplayed();
        sleepFor(1);
        practiceAmazonSignIn2.SigninIsEnable("amazon@gmail.com");
        sleepFor(2);
        practiceAmazonSignIn2.SigninClickeble();
        sleepFor(2);
        practiceAmazonSignIn2.SignInClickToContinue();
        sleepFor(2);
        practiceAmazonSignIn2.SignInPassword();
        sleepFor(2);
        resultPage.AmazonSignIn();
        sleepFor(2);
        System.out.println("GOOD JOB!!");

    }
}
