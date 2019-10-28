package homepagetests;

import homepage.DealOfTheDay;
import homepage.LogInAmazon;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DealOfTheDayUsingIframeTest extends DealOfTheDay {
    // LogInAmazon logInAmazon; DealOfTheDay

    @Test
    public void ScrollDown() {

        LogInAmazon logInAmazon = PageFactory.initElements(driver, LogInAmazon.class);
        DealOfTheDay dealOfTheDay = PageFactory.initElements(driver, DealOfTheDay.class);
        AmazonItemSelectBYDropDown();
        sleepFor(1);
        SearchItemAfterUsingDropDown();
        sleepFor(1);
        SelecMensClothingtItem();
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

}
