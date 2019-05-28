package com.chase.pages;


import com.chase.pageproperties.HomePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void enterZipCode() throws InterruptedException {
        enterText(NewCarZipcodeBoxLocator,"12345");
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

    public void enterZipCodeForUsedCar() throws InterruptedException {
        enterText(UsedCarZipcodeBoxLocator,"12345");
    }



//
//    public void clickOnCreateEmailCampaignLink() throws InterruptedException {
//        wait_implicit_till_window_load();
//        isElementClickableOnWebPage(CreateEmailCampaignLinkLocator);
//        click(CreateEmailCampaignLinkLocator);
//
//    }
//
//    public void enterCampaignNameintoTextBox(String campaignName) throws InterruptedException {
//        switchToFrame("left");
//        enterText(CampaignNameBoxLocator,campaignName);
//    }
//
//    public void selectEmailTemplate(String emailLayout){
//        selectAnyValuFromDropdown(EmailLayoutDropdownLocator,emailLayout);
//    }
//
//    public void clickOnCreateButton(){
//        click(CreateButtonLocator);
//    }
//
//    public void verifyContainerAndCapaignName(String expectedContainerAndCampaignName) throws InterruptedException {
//        switchToFrame("topframe");
//        String actualContainerAndCampaignName = getAnyTextFromWebPage(ContainerAndCampaignNameLocator);
//        Assert.assertTrue(compareAnyText(actualContainerAndCampaignName,expectedContainerAndCampaignName));
//    }
//
//    public void enterMailName(String emailName) throws InterruptedException {
//        switchToFrame("right");
//        enterText(EmailNameBoxLocator,emailName);
//    }
//
//    public void clickOnInvitationIcon(){
//        click(InvitationIconLocator);
//    }
//
//    public void clickOnPublishEmail() throws InterruptedException {
//        wait_implicit_till_window_load();
//        switchToFrame("left");
//        click(PublishEmailLocator);
//    }
//
//    public void clickOnPublishNow() throws InterruptedException {
//        switchToFrame("left");
//        click(PublishNowLocator);
//    }
//
//    public void getEmailStatus(String expectedEmailStatus) throws InterruptedException {
//        switchToFrame("left");
//        String actualEmailStatus = getEmailStatus(EmailStatusLocator);
//        Assert.assertTrue(compareAnyText(actualEmailStatus,expectedEmailStatus));
//    }



}
