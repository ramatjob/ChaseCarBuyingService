package com.chase.stepdefinition;

import com.chase.pages.HomePage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefinition {
    private WebDriver driver;
    private TestBase testBase;
    private String url;
    private HomePage homePageObject;

    public HomePageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Given("^I launch the Chase Portal home page$")
    public void luanchChasePortalHomePage() {
        driver = testBase.initializeDriver();
        url = testBase.getUrl("ChasePortal");
        testBase.launchUrl(url);
        homePageObject = new HomePage(driver);
    }

    @And("^I verify the objects on the Chase portal home page$")
    public void verifyLeftSideTitle() throws InterruptedException {
        homePageObject.verifyLeftSideTitle();
    }

    @And("^I select a valid value from Select Make drop down$")
    public void selectCarMake() throws InterruptedException {
        homePageObject.selectCarMake();
    }

    @And("^I enter a valid \"([^\"]*)\"$")
    public void enterValidZipcode(String zipcode) throws InterruptedException {
        homePageObject.enterZipCode(zipcode);
    }

    @And("^I click on Shop New Cars button$")
    public void clickOnShopNewCarsButton() throws InterruptedException {
        homePageObject.clickOnShopNewCarsButton();
    }

    @And("^I click on Shop Used Cars button$")
    public void clickOnShopUsedCarsButton() throws InterruptedException {
        homePageObject.clickOnShopUsedCarsButton();
    }


    @And("^I select a valid used car make from Select Make drop down$")
    public void selectUsedCarMake() throws InterruptedException {
        homePageObject.selectUsedCarMake();
    }


    @And("^I enter a valid \"([^\"]*)\" for Used car$")
    public void enterValidZipcodeForUsedCar(String zipcode) throws InterruptedException {
        homePageObject.enterZipCodeForUsedCar(zipcode);
    }

}
