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
        url = testBase.getUrl("VuturePortal");
        testBase.launchUrl(url);
        homePageObject = new HomePage(driver);
    }

    @And("^I verify the \"([^\"]*)\"$")
    public void verifyLeftSideTitle(String expectedLeftSideTitle) throws InterruptedException {
        //Thread.sleep(5000);
        homePageObject.verifyLeftSideTitle(expectedLeftSideTitle);
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
        //Thread.sleep(5000);
    }

    @And("^I click on Shop Used Cars button$")
    public void clickOnShopUsedCarsButton() throws InterruptedException {
        homePageObject.clickOnShopUsedCarsButton();
        //Thread.sleep(5000);
    }


    @And("^I select a valid used car make from Select Make drop down$")
    public void selectUsedCarMake() throws InterruptedException {
        homePageObject.selectUsedCarMake();
    }


    @And("^I enter a valid \"([^\"]*)\" for Used car$")
    public void enterValidZipcodeForUsedCar(String zipcode) throws InterruptedException {
        homePageObject.enterZipCodeForUsedCar(zipcode);
    }



//    @Given("^I click on create email campaign link$")
//    public void clickOnCreateEmailCampaignLink() throws InterruptedException {
//        driver = testBase.getDriver();
//        homePageObject = new HomePage(driver);
//        homePageObject.clickOnCreateEmailCampaignLink();
//    }
//
//    @And("^I entered a \"([^\"]*)\"$")
//    public void nameTheCampaign(String campaignName) throws InterruptedException {
//        homePageObject.enterCampaignNameintoTextBox(campaignName);
//    }
//
//    @And("^I select the first email template from \"([^\"]*)\"$")
//    public void selectEmailTemplate(String emailLayout) {
//        homePageObject.selectEmailTemplate(emailLayout);
//    }
//
//    @And("^I click on the create button$")
//    public void clickOnCreateButton() {
//        homePageObject.clickOnCreateButton();
//    }
//
//
//    @And("^I verify that the \"([^\"]*)\" are displayed at the top of the window$")
//    public void verifyTheContainerAndCampiagnNames(String expectedContainerAndCampaignName) throws InterruptedException {
//        homePageObject.verifyContainerAndCapaignName(expectedContainerAndCampaignName);
//    }
//
//    @And("^On the right hand frame, i enter an \"([^\"]*)\"$")
//    public void enterEmailName(String emailName) throws InterruptedException {
//        homePageObject.enterMailName(emailName);
//    }
//
//    @And("^I click on the invitation icon$")
//    public void clickOnInvitationIcon() {
//        homePageObject.clickOnInvitationIcon();
//    }
//
//    @And("^I click on publish email$")
//    public void clickOnPublishEmail() throws InterruptedException {
//        homePageObject.clickOnPublishEmail();
//    }
//
//    @And("^I click on publish now$")
//    public void clickOnPublishNow() throws InterruptedException {
//        homePageObject.clickOnPublishNow();
//    }
//
//    @And("^I verify that the \"([^\"]*)\" is coming as Live in the published page$")
//    public void verifyTheStatusOfEmail(String expectedEmailStatus) throws InterruptedException {
//        homePageObject.getEmailStatus(expectedEmailStatus);
//    }



}
