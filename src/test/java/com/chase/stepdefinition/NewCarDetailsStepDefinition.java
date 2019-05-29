package com.chase.stepdefinition;


import com.chase.pages.NewCarDetailsPage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NewCarDetailsStepDefinition {
    private WebDriver driver;
    private NewCarDetailsPage newCarDetailsPageObject;
    private TestBase testBase;

    public NewCarDetailsStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I can see a new page which shows the full details of selected car$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        newCarDetailsPageObject = new NewCarDetailsPage(driver);
        newCarDetailsPageObject.verifyThePageProperties();
    }

    @And("^I get the full details of car$")
    public void getTheFullDetailsOfCar() throws InterruptedException {
        newCarDetailsPageObject.getCarDetails();
    }

    @Then("^I can compare car image and model against the details of car search results$")
    public void compareCarImageAndModel() throws InterruptedException {
        newCarDetailsPageObject.compareCarImageAndModel();
    }

    @And("^I click on the Build And Price button$")
    public void clickOnBuildAndPriceButton() throws InterruptedException {
        newCarDetailsPageObject.clickOnBuildAndPriceButton();
    }

    @And("^I close the browser$")
    public void closeBrowser(){
        testBase.tearDown();
    }


}
