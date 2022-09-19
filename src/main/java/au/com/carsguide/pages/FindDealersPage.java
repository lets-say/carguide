package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import java.util.List;

public class FindDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());

    public FindDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement verifyDealersPage;

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> dealersname;

    public void verifyDealersNamesDisplayed(Boolean list) {
        for (WebElement name : dealersname) {
            if (list = name.isDisplayed()) {
                log.info("verify car dealers name : " + list);
                break;
            } else {
                System.out.println("Dealers name not in the list");
            }
        }
    }


    public void dealershipPageVerification() throws InterruptedException {
        Thread.sleep(2000);
        String expected = getTextFromElement(verifyDealersPage);
        String actual = "Find a Car Dealership Near You";
        AssertJUnit.assertEquals("Page not found !!", expected, actual);
    }


}
