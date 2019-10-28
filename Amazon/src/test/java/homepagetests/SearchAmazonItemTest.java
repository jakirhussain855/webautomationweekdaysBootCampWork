package homepagetests;

import homepage.SearchAmazonItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchAmazonItemTest extends SearchAmazonItems {

    @Test
    public void SearchFoCardiganSweaterTest() {

        SearchAmazonItems searchAmazonItems = PageFactory.initElements(driver, SearchAmazonItems.class);

        searchAmazonItems.SearchForCardiganSweaters();
        sleepFor(2);
        searchAmazonItems.ClickButtonForSearchingCardigan();

        sleepFor(2);


        searchAmazonItems.SelectingCardigan();
        // captureScreenshot( new ChromeDriver(),("Cardigan"));
        sleepFor(2);
    }


}
