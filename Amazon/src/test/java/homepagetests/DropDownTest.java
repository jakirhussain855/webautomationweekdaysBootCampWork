package homepagetests;

import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest extends HomePage {


    //@Test
    public void validateResultPage() {
        //resultPage.whatever();
    }

    @Test(enabled = true)
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        //homework -- print all the values of the dropdown (Not XPATH)
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }

    }
}
