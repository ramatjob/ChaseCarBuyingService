package com.chase.pages;


import com.chase.pageproperties.HomePageProperty;
import com.chase.testdata.HomePageTestData;
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
    By ChaseSymbolLocator = By.xpath(HomePageProperty.ChaseSymbol);
    By RightSideTitle1Locator = By.xpath(HomePageProperty.RightSideTitle1);
    By RightSideTitle2Locator = By.xpath(HomePageProperty.RightSideTitle2);
    By CarBuyingHomeMenuLocator = By.xpath(HomePageProperty.CarBuyingHomeMenu);
    By NewCarSearchMenuLocator = By.xpath(HomePageProperty.NewCarSearchMenu);
    By UsedCarSearchMenuLocator = By.xpath(HomePageProperty.UsedCarSearchMenu);
    By MoneySaveTitleLocator = By.xpath(HomePageProperty.MoneySaveTitle);
    By NewCarSearchTitleLocator = By.xpath(HomePageProperty.NewCarSearchTitle);
    By UsedCarSearchTitleLocator = By.xpath(HomePageProperty.UsedCarSearchTitle);




    private WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyLeftSideTitle() throws InterruptedException {
        isElementPresentOnWebPage(ChaseSymbolLocator,"Chase symbol"," present on the chase portal home screen");
        isElementPresentOnWebPage(RightSideTitle1Locator,"Right side Title1"," present on the chase portal home screen");
        isElementPresentOnWebPage(RightSideTitle2Locator,"Right side Title2"," present on the chase portal home screen");
        isElementPresentOnWebPage(CarBuyingHomeMenuLocator,"Car Buying Home Menu"," present on the chase portal home screen");
        isElementPresentOnWebPage(NewCarSearchMenuLocator,"New Car Search Menu"," present on the chase portal home screen");
        isElementPresentOnWebPage(UsedCarSearchMenuLocator,"Used Car Search Menu"," present on the chase portal home screen");
        isElementPresentOnWebPage(MoneySaveTitleLocator,"Money Save Title"," present on the chase portal home screen");
        isElementPresentOnWebPage(NewCarSearchTitleLocator,"NewCar Search Title"," present on the chase portal home screen");
        isElementPresentOnWebPage(UsedCarSearchTitleLocator,"Used Car Search Title"," present on the chase portal home screen");
        isElementPresentOnWebPage(LeftSideTitleLocator,"Left Side Title"," present on the chase portal home screen");
        isElementPresentOnWebPage(NewCarSelectMakeDropdownLocator,"New Car Select Make Dropdown"," present on the chase portal home screen");
        isElementPresentOnWebPage(NewCarZipcodeBoxLocator,"New Car Zipcode Box"," present on the chase portal home screen");
        isElementPresentOnWebPage(ShopNewCarsButtonLocator,"Shop New Cars Button"," present on the chase portal home screen");
        isElementPresentOnWebPage(UsedCarSelectMakeDropdownLocator,"Used Car Select Make Dropdown"," present on the chase portal home screen");
        isElementPresentOnWebPage(UsedCarZipcodeBoxLocator,"Used Car Zipcode Box"," present on the chase portal home screen");
        isElementPresentOnWebPage(ShopUsedCarsButtonLocator,"Shop Used Cars Button"," present on the chase portal home screen");
        isElementPresentOnWebPage(AutoLoansMenuLocator,"Auto Loans Menu"," present on the chase portal home screen");

        String actualLeftSideTitle = getAnyTextFromWebPage(LeftSideTitleLocator);
        Assert.assertTrue(compareAnyText(actualLeftSideTitle, HomePageTestData.LeftSideTitle));
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

}
