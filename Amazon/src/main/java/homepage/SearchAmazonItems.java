package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchAmazonItems extends CommonAPI {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public static WebElement SearchItem;
    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    public static WebElement clickON;
    @FindBy(xpath = "//div[@id='pdagDesktopSparkleAsinContainer1']//div[@class='imageContainer']")
    public static WebElement cardigan;

    public void SearchForCardiganSweaters() {
        SearchItem.sendKeys("cardigan for men");
        SearchItem.click();
        Assert.assertEquals(SearchItem.isDisplayed(),true);
        sleepFor(1);
    }

    public void ClickButtonForSearchingCardigan() {
        captureScreenshot(new ChromeDriver(), ("d"));
        clickON.click();
         Assert.assertEquals(clickON.isEnabled(),true,"not enable");
    }

    public void SelectingCardigan() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(5);
        cardigan.click();
        Assert.assertEquals(cardigan.isDisplayed(), true);

    }


}

