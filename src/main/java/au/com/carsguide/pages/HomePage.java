package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buyNsell;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCar;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealer;






    public void mouseHoverOnBuynSell() {
        mouseHoverToElement(buyNsell);
        log.info("Mouse hovering on Buy+Sell : " +buyNsell.toString());
    }

    public void clickOnSearchCar() {

        clickOnElement(searchCar);
        log.info("Clicking on search car : " +searchCar.toString());
    }

    public void clickOnUsedonHomePage() {

        clickOnElement(used);
        log.info("Clicking on  : " +used.toString());
    }

    public void clickonFindDealer() {

        clickOnElement(findDealer);
        log.info("Clicking on  : " +findDealer.toString());
    }


}
