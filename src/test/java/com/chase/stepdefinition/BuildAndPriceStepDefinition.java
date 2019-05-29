package com.chase.stepdefinition;


import com.chase.pages.BuildAndPricePage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class BuildAndPriceStepDefinition {
    private WebDriver driver;
    private BuildAndPricePage buildAndPricePageObject;
    private TestBase testBase;

    public BuildAndPriceStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @And("^I get the car price from Build And Price page$")
    public void getCarPrice() throws InterruptedException {
        driver = testBase.getDriver();
        buildAndPricePageObject = new BuildAndPricePage(driver);
        buildAndPricePageObject.getCarPrice();
    }

    @Then("^I compare the car price against the details of car search results$")
    public void compareCarPrice() throws InterruptedException {
        buildAndPricePageObject.compareCarPrice();
    }

}
