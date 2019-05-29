package com.chase.stepdefinition;


import com.chase.pages.NewCarSearchResultsPage;
import com.chase.pages.UsedCarSearchResultsPage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class UsedCarSearchResultsStepDefinition {
    private WebDriver driver;
    private UsedCarSearchResultsPage usedCarSearchResultsPageObject;
    private TestBase testBase;

    public UsedCarSearchResultsStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I can see a new page with used car results$")
    public void verifyUsedCarResultsPage() throws InterruptedException {
        driver = testBase.getDriver();
        usedCarSearchResultsPageObject = new UsedCarSearchResultsPage(driver);
        usedCarSearchResultsPageObject.verifyThePropertiesOnThePage();
    }

    @And("^I get the details of used \"([^\"]*)\"$")
    public void getTheCarDetails(int requiredLinkNumber) throws InterruptedException {
        usedCarSearchResultsPageObject.getCarDetails(requiredLinkNumber);
    }

    @And("^I click on the used \"([^\"]*)\"$")
    public void clickOnCarLink(int requiredLinkNumber) throws InterruptedException {
        usedCarSearchResultsPageObject.clickOnFirstCarLink(requiredLinkNumber);
    }




}
