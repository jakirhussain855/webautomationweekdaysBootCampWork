package AmazonQuickValid;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class AmazonPractice1 extends CommonAPI {
    @FindBy(xpath = "//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Whole Foods')]")
    WebElement WholeFood;
    @FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
    WebElement BestSellers;
    @FindBy(xpath = "//a[contains(text(),'Gift Ideas')]")
    WebElement GiftIdeas;
    @FindBy(xpath = "//a[contains(text(),'New Releases')]")
    WebElement NewReleases;
    @FindBy(xpath = "//a[@id='nav-orders']")
    WebElement ReturnOrders;

SoftAssert softAssert=new SoftAssert();
    public void AmazonPageDisplayValid() {

        sleepFor(3);
        softAssert.assertEquals(WholeFood.isDisplayed(), true, "NOT DISPLAYED");
       softAssert.assertEquals(BestSellers.isDisplayed(), true, "NOT DISPLAYED");
        softAssert.assertEquals(GiftIdeas.isDisplayed(), true, "NOT DISPLAYED");
        softAssert.assertEquals(NewReleases.isDisplayed(), true, "NOT DISPLAYED");
        softAssert.assertEquals(ReturnOrders.isDisplayed(), true, "NOT DISPLAYED");
       softAssert.assertAll();
//                Assert.assertEquals(WholeFood.isDisplayed(), true, "NOT DISPLAYED");Assert.assertEquals(BestSellers.isDisplayed(), true, "NOT DISPLAYED");
//        Assert.assertEquals(GiftIdeas.isDisplayed(), true, "NOT DISPLAYED");
//        Assert.assertEquals(NewReleases.isDisplayed(), true, "NOT DISPLAYED");
//        Assert.assertEquals(ReturnOrders.isDisplayed(), true, "NOT DISPLAYED");
//        //WholeFood.click();

    }
    public void AmazonPageClickOnValid(){
        WholeFood.click();
        System.out.println("Here you go");
        BestSellers.click();
        System.out.println("Here you go");
        GiftIdeas.click();
        System.out.println("Here you go");
        NewReleases.click();
        System.out.println("Here you go");
        ReturnOrders.click();
        System.out.println("Here you go");

    }
    public void AmazonPageBarsEnable(){
        WholeFood.getText();
        BestSellers.getText();
        GiftIdeas.getText();
        NewReleases.getText();
        ReturnOrders.getText();
    }
}
