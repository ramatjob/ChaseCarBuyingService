package com.chase.pages;


import com.chase.pageproperties.ChaseAutoLoansPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ChaseAutoLoansPage extends CommonFunctions {
    By TestDriveTitleLocator = By.xpath(ChaseAutoLoansPageProperty.TestDriveTitle);

    private WebDriver driver;

    public ChaseAutoLoansPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyPageProperties(){
        isElementPresentOnWebPage(TestDriveTitleLocator, "Test drive title", " On the Chase Auto Loans screen");
        System.out.println(getAnyTextFromWebPage(TestDriveTitleLocator));
    }


}
