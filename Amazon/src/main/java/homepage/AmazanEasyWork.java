package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.logging.XMLFormatter;

public class AmazanEasyWork extends CommonAPI {
@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Whole Foods')]")
WebElement WholeFood;
@FindBy(xpath = "//div[@id='contentGrid_161612']//div[contains(@class,'bxc-grid__row--light')]//div[1]//div[1]//div[1]//a[1]//img[1]")
WebElement WeeklyDeals;

public void WholeFoodVarification(){
    Assert.assertEquals(WholeFood.isEnabled(),true,"not  it is not");
WholeFood.click();
//scrollIntoView("");



}
}
