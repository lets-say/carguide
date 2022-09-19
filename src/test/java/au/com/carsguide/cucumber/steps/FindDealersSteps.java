package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.FindDealersPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FindDealersSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on 'Find a Dealer' page$")
    public void iClickOnFindADealerPage() {
        new HomePage().clickonFindDealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage()throws InterruptedException {
        new FindDealersPage().dealershipPageVerification();
    }

    @And("^I should see the dealers name \"([^\"]*)\" are displayed on page$")
    public void iShouldSeeTheDealersNameAreDisplayedOnPage(boolean display) {
        new FindDealersPage().verifyDealersNamesDisplayed(display);
    }
}
