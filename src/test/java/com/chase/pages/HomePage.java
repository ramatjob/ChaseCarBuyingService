package com.chase.pages;


import com.chase.pageproperties.HomePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage extends CommonFunctions {
    By LeftSideTitleLocator = By.xpath(HomePageProperty.LeftSideTitle);
    By NewCarSelectMakeDropdownLocator = By.xpath(HomePageProperty.NewCarSelectMakeDropdown);
    By NewCarMakeNameLocator = By.xpath(HomePageProperty.NewCarMakeName);
    By NewCarZipcodeBoxLocator = By.xpath(HomePageProperty.NewCarZipcodeBox);
    By ShopNewCarsButtonLocator = By.xpath(HomePageProperty.ShopNewCarsButton);
    By UsedCarSelectMakeDropdownLocator = By.xpath(HomePageProperty.UsedCarSelectMakeDropdown);
    By UsedCarMakeNameLocator = By.xpath(HomePageProperty.UsedCarMakeName);
    By UsedCarZipcodeBoxLocator = By.xpath(HomePageProperty.UsedCarZipcodeBox);
    By ShopUsedCarsButtonLocator = By.xpath(HomePageProperty.ShopUsedCarsButton);
    By AutoLoansMenuLocator = By.xpath(HomePageProperty.AutoLoansMenu);



    private WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyLeftSideTitle(String expectedLeftSideTitle) throws InterruptedException {
        String actualLeftSideTitle = getAnyTextFromWebPage(LeftSideTitleLocator);
        Assert.assertTrue(compareAnyText(actualLeftSideTitle,expectedLeftSideTitle));
    }

    public void selectCarMake() throws InterruptedException {
        selectAnyVlueFromDropDown(NewCarSelectMakeDropdownLocator,NewCarMakeNameLocator);
    }

    public void enterZipCode(String zipcode) throws InterruptedException {
        enterText(NewCarZipcodeBoxLocator,zipcode);
    }

    public void clickOnShopNewCarsButton(){
        click(ShopNewCarsButtonLocator);
    }

    public void clickOnShopUsedCarsButton(){
        click(ShopUsedCarsButtonLocator);
    }

    public void selectUsedCarMake() throws InterruptedException {
        selectAnyVlueFromDropDown(UsedCarSelectMakeDropdownLocator, UsedCarMakeNameLocator);
    }

    public void enterZipCodeForUsedCar(String zipcode) throws InterruptedException {
        enterText(UsedCarZipcodeBoxLocator,zipcode);
    }

    public void clickOnAutoLoansMenu(){
        click(AutoLoansMenuLocator);

        for(String winHandle : driver.getWindowHandles()){
            System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& "+winHandle);
            driver.switchTo().window(winHandle);
        }
    }

}
