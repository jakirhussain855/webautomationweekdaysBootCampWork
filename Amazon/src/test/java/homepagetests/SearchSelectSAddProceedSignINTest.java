package homepagetests;

import homepage.DealOfTheDay;
import homepage.LogInAmazon;
import homepage.SearchSelectAddProceedSignIN;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchSelectSAddProceedSignINTest extends SearchSelectAddProceedSignIN {

    @Test(enabled = false)
    public void ScrollDown() {

        LogInAmazon logInAmazon = PageFactory.initElements(driver, LogInAmazon.class);
        DealOfTheDay dealOfTheDay = PageFactory.initElements(driver, DealOfTheDay.class);
        AmazonItemSelectBYDropDown();
        sleepFor(1);
        SearchItemAfterUsingDropDown();
        sleepFor(1);
        SelecMensClothingtItem();
        navigateBack();
        navigateForward();
        sleepFor(1);
        //PageScrollingByiframe();
        // sleepFor(2);
        SelectSweater();
        sleepFor(1);
        logInAmazon.validateEmail();
        logInAmazon.ClickOnContinueBar();
        logInAmazon.clickOnPasswordBar();
        logInAmazon.ClickOnSignInBar();
        //PageScrollingByiframe();
        sleepFor(3);


    }

    @Test
    public void Chk() {
        ScrollDown();
        navigateBack();
    }
}
