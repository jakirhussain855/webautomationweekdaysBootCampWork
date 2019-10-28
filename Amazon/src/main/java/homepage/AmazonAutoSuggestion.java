package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonAutoSuggestion extends CommonAPI {


    public void AmazonSuggestion() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> findElements = driver.findElements((By.xpath("//div[@id='srch_sggst']/div")));
        System.out.println("Size is" + findElements.size());
        for (WebElement a : findElements) {
            System.out.println(a.getText());
        }

    }
}

//    public List<WebElement> getAllElementFromList(String locator) {
//        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
//        // System.out.println(elementList.size());
//        return driver.findElements(By.xpath(locator));
//    }

