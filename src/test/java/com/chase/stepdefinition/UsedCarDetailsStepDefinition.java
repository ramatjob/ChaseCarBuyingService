package com.chase.stepdefinition;


import com.chase.pages.UsedCarDetailsPage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class UsedCarDetailsStepDefinition {
    private WebDriver driver;
    private UsedCarDetailsPage usedCarDetailsPageObject;
    private TestBase testBase;

    public UsedCarDetailsStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I can see a new page which shows the full details of selected used car$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        usedCarDetailsPageObject = new UsedCarDetailsPage(driver);
        usedCarDetailsPageObject.verifyThePageProperties();
    }

    @And("^I get the full details of used car$")
    public void getTheFullDetailsOfCar() throws InterruptedException {
        usedCarDetailsPageObject.getCarDetails();
    }


}
