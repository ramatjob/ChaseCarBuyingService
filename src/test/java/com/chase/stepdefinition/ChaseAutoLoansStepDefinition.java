package com.chase.stepdefinition;


import com.chase.pages.ChaseAutoLoansPage;
import com.chase.pages.HomePage;
import com.chase.utility.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ChaseAutoLoansStepDefinition {

    private WebDriver driver;
    private TestBase testBase;
    private String url;
    private ChaseAutoLoansPage chaseAutoLoansPageObject;

    public ChaseAutoLoansStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I can see a new screen called Chase Auto Loans screen$")
    public void luanchChasePortalHomePage() {
        driver = testBase.getDriver();
        chaseAutoLoansPageObject = new ChaseAutoLoansPage(driver);
        chaseAutoLoansPageObject.verifyPageProperties();
    }

}
