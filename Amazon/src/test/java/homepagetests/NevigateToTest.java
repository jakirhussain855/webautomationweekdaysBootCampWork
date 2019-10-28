package homepagetests;

import POM.HomePagePOMandNavigateTO;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NevigateToTest extends CommonAPI {
    @Test
    public void testShopperToolkit() {
        HomePagePOMandNavigateTO homePagePOM = PageFactory.initElements(driver, HomePagePOMandNavigateTO.class);
        homePagePOM.validateShopperDisplayed();

        sleepFor(4);
        homePagePOM.validateShopperClickAble();
        sleepFor(4);
        driver.navigate().back();
        sleepFor(4);
        driver.navigate().forward();
        sleepFor(4);
    }

}
