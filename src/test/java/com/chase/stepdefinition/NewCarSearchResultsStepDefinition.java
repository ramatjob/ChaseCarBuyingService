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

    @And("^I get the details of \"([^\"]*)\"$")
    public void getTheDetailsOfCarLink(int requiredLinkNumber) throws InterruptedException {
        newCarSearchResultsPageObject.getDetailsOfCarLink(requiredLinkNumber);
    }

    @And("^I click on the \"([^\"]*)\"$")
    public void clickOnFirstCarLink(int requiredLinkNumber) throws InterruptedException {
        newCarSearchResultsPageObject.clickOnFirstCarLink(requiredLinkNumber);
    }
}
