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
        //Thread.sleep(5000);
    }

    @Then("^I get the details of first used car link$")
    public void getTheCarDetails() throws InterruptedException {
        usedCarSearchResultsPageObject.getCarDetails();
        //Thread.sleep(5000);
    }




    @And("^I click on the first used car link$")
    public void clickOnCarLink() throws InterruptedException {
        //Thread.sleep(5000);
        usedCarSearchResultsPageObject.clickOnFirstCarLink();
        //Thread.sleep(5000);
    }




}
