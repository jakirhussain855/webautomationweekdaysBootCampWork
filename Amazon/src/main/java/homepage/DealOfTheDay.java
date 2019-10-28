package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DealOfTheDay extends CommonAPI {

    public void PageScrollingByiframe() {
        sleepFor(1);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
        driver.switchTo().frame(1);

    }

    public void AmazonItemSelectBYDropDown() {
        WebElement element = getElement("//select[@id='searchDropdownBox']");
        Select select = new Select(element);
        select.selectByIndex(17);
        sleepFor(1);
    }

    public void SearchItemAfterUsingDropDown() {
        WebElement SearchButtonClick = getElement("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        SearchButtonClick.click();
        // Assert.assertEquals(SearchButtonClick.isDisplayed(),true);
    }

    public void SelecMensClothingtItem() {
        WebElement element = getElement("//li[@id='sobe_d_b_3_1']//div[@class='sl-sobe-carousel-sub-card-image-overlay']");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        sleepFor(1);
        element.click();
        sleepFor(1);

    }

    //    @FindBy(xpath = "//span[8]//li[1]//span[1]//div[1]//a[1]//div[1]//div[1]")
//public static WebElement SelectSweater;
//    public void SweaterSelected(){
//      SelectSweater.click();
//      //Assert.assertEquals(SelectSweater.isDisplayed(),true);
//    }
    public void SelectSweater() {
        WebElement selectSweaters = getElement("//span[8]//li[1]//span[1]//div[1]//a[1]//div[2]");

        selectSweaters.click();
        //Assert.assertEquals(selectSweaters.isDisplayed(),true);
        //Assert.assertEquals(selectSweaters.isEnabled(),true);
        System.out.println("Selected Item");
        WebElement selectPullover = getElement("//span[@class='a-size-medium a-color-base a-text-bold'][contains(text(),'Pullovers')]");
        selectPullover.click();

        WebElement selectFindItems = getElement("//span[contains(text(),'Cubcoats')]");
        selectFindItems.click();
        WebElement selectCUBSweaters = getElement("//li[@id='result_0']//img[@class='s-access-image cfMarker']");
        selectCUBSweaters.click();

        WebElement addToCart = getElement("//input[@id='add-to-cart-button']");
        addToCart.click();
        WebElement cart = getElement("//a[@id='hlb-view-cart-announce']");
        cart.click();
        WebElement proceedToCheckOut = getElement("//input[@name='proceedToRetailCheckout']");
        proceedToCheckOut.click();
        //Assert.assertEquals(proceedToCheckOut.isEnabled(),true,"no it is not not");

    }

}




