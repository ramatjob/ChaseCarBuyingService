package com.chase.stepdefinition;

import com.chase.pages.NewCarSearchResultsPage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NewCarSearchResultsStepDefinition {
    private WebDriver driver;
    private NewCarSearchResultsPage newCarSearchResultsPageObject;
    private TestBase testBase;

    public NewCarSearchResultsStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I can see a new page with car results$")
    public void verifyCarResultsPage() throws InterruptedException {
        driver = testBase.getDriver();
        newCarSearchResultsPageObject = new NewCarSearchResultsPage(driver);
        newCarSearchResultsPageObject.verifyThePropertiesOnThePage();
    }

    @And("^I get the details of first car link$")
    public void getTheDetailsOfCarLink() throws InterruptedException {
        newCarSearchResultsPageObject.getDetailsOfCarLink();
    }

    @And("^I click on the first car link$")
    public void clickOnFirstCarLink() throws InterruptedException {
        newCarSearchResultsPageObject.clickOnFirstCarLink();
    }


//    @Given("^I click on logout button$")
//    public void clickOnLogoutButton() throws InterruptedException {
//        driver = testBase.getDriver();
//        logoutPageObject = new NewCarSearchResultsPage(driver);
//        logoutPageObject.clickOnLogoutButton();
//    }
//
//    @Then("^I can verify the Login page URL \"([^\"]*)\"$")
//    public void verifyLoginPageUrl(String expectedLogoutPageUrl){
//        logoutPageObject.verifyLoginPageURL(expectedLogoutPageUrl);
//    }
//
//    @Then("^I verify that the Username,Password and Signin elements are visible$")
//    public void verifyUsernamePasswordAndSigninElemnts(){
//        logoutPageObject.verifyUsernamePasswordAndSigninElements();
//    }
//
//    @And("^I close the browser$")
//    public void closeBrowser(){
//        testBase.tearDown();
//    }


}
