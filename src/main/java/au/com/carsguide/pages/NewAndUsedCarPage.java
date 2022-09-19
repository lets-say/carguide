package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement newNused;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement searchButton;

    @CacheLookup
    @FindBy (xpath = "//h1[@class='listing-search-title']")
    WebElement resultText;

    public String getResulText(){
        String result=getTextFromElement(resultText);
        System.out.println(result);
        return result;
    }

    public void verifySearchedItem(String make){
        String expectedResult=resultText.getText();
        Boolean actualmsg=expectedResult.contains(make);
        AssertJUnit.assertTrue(actualmsg);
        log.info("verify search result : " +resultText.toString());
    }


    public void verifyNewandUsedCarPage() {
        String expected = getTextFromElement(newNused);
        String actual = "New & Used Car Search - carsguide";
        AssertJUnit.assertEquals("Page not found", expected, actual);
    }

    public void selectYourCar(String car){
        selectByValueFromDropDown(anyMake,car);
        log.info("Selecting your car  : " +anyMake.toString());
    }

    public void selectModel(String variant){
        selectByValueFromDropDown(model,variant);
        log.info("Selecting your model  : " +model.toString());
    }

    public void chooseYourLocation(String area){
        selectByValueFromDropDown(location,area);
        log.info("Selecting Location  : " +location.toString());
    }

    public void selectYourRange$(String amount){
        selectByValueFromDropDown(price,amount);
        log.info("Selecting Price  : " +price.toString());
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
        log.info("clicking on search button " +searchButton.toString());
    }


}
