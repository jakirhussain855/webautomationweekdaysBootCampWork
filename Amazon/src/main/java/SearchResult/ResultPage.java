package SearchResult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class ResultPage extends CommonAPI {

    @FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")
    WebElement Validateing ;
    public void AmazonSignIn(){

        Assert.assertEquals(Validateing.isDisplayed(),true);
    }
    public void validateSearchPageDisplayed() {
        WebElement element = getElement("//*[@id='s-refinements']");
        Assert.assertEquals(element.isDisplayed(), true, "element isn't displayed");
        TestLogger.log("search result panel is displayed : " + element.isDisplayed());
    }
    public void validateSearchItemClassIsWorking(){


    }
}
