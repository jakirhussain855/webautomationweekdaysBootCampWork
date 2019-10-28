package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePagePOMandNavigateTO extends CommonAPI {
    //Option 1
    @FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
    public static WebElement BestSellers;

    //Option 2
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Best Sellers')]")
    public static WebElement shopperToolkitValue2;

    @FindBy(linkText = "Best Sellers")
    public static WebElement BestSellers1;

    public void validateShopperDisplayed() {
        Assert.assertEquals(BestSellers.isDisplayed(), true);
    }

    public void validateShopperClickAble() {
        BestSellers.click();
        Assert.assertEquals(BestSellers.isDisplayed(), true);
    }

}
