package com.chase.pages;


import com.chase.pageproperties.NewCarSearchResultsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewCarSearchResultsPage extends CommonFunctions {

    By TotalResultsListLocator = By.xpath(NewCarSearchResultsPageProperty.TotalResultsList);
    By FirstCarLinkLocator = By.xpath(NewCarSearchResultsPageProperty.FirstCarLink);
    By CarLinkDetailsLocator = By.xpath(NewCarSearchResultsPageProperty.CarLinkDetails);
    By ShowMessageLocator = By.xpath(NewCarSearchResultsPageProperty.ShowMessage);
    By BMWTextLocator = By.xpath(NewCarSearchResultsPageProperty.BMWText);
    By BMWLogoLocator = By.xpath(NewCarSearchResultsPageProperty.BMWLogo);



    private WebDriver driver;

    public NewCarSearchResultsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

//    public void getTotalCarResultsCount(){
//        getTotalResultsCount(TotalResultsListLocator);
//    }

    public void verifyThePropertiesOnThePage(){
        String actualShowMessage = getAnyTextFromWebPage(ShowMessageLocator);
//        System.out.println(" %%%%%%%%%%%%%%5 "+actualShowMessage);
        String actualBMWText = getAnyTextFromWebPage(BMWTextLocator);
//        System.out.println(" %%%%%%%%%%%%%%5 "+actualBMWText);
        String actualBMWLogo = getValueOfAttribute(BMWLogoLocator,"src");
//        System.out.println(" %%%%%%%%%%%%%%5 "+actualBMWLogo);

        String expectedShowMessage = "Showing 24 new BMW models. Select a model for pricing details.";
        String expectedBMWText = "BMW Models";
        String expectedBMWLogo= "https://static.tcimg.net/vehicles/logo/192x192_full_color/828d494572d571c5/BMW.png";

        Assert.assertTrue(compareAnyText(actualShowMessage,expectedShowMessage));
        Assert.assertTrue(compareAnyText(actualBMWText,expectedBMWText));
        Assert.assertTrue(compareAnyText(actualBMWLogo,expectedBMWLogo));

    }

    public void clickOnFirstCarLink(){
        int resultsCount = getTotalResultsCount(TotalResultsListLocator);
        if(resultsCount > 0){
            System.out.println("Results count is > 0");
            click(FirstCarLinkLocator);
        }else{
            System.out.println("Results count is < 0");
        }
    }

    public void getDetailsOfCarLink(){
        String carImage = getValueOfAttribute(CarLinkDetailsLocator,"src");
        System.out.println(carImage);
        String carAlt =getValueOfAttribute(CarLinkDetailsLocator,"alt");
        System.out.println(carAlt);
    }


//    public void clickOnLogoutButton() throws InterruptedException {
//        wait_implicit_till_window_load();
//        Thread.sleep(5000);
//        click(MyAccountDropDownLocator);
//        click(LogoutButtonLocator);
//    }
//
//    public void verifyLoginPageURL(String expectedLogoutPageURL){
//        String actualLogoutPageURL = driver.getCurrentUrl();
//        Assert.assertTrue(compareAnyText(actualLogoutPageURL,expectedLogoutPageURL));
//    }
//
//    public void verifyUsernamePasswordAndSigninElements(){
//        isElementPresentOnWebPage(UserNameBoxLocator,"Username box", "Vuture portal login Page");
//        isElementPresentOnWebPage(PasswordBoxLocator,"Password box", "Vuture portal login Page");
//        isElementPresentOnWebPage(SignButtonLocator,"Signin button", "Vuture portal login Page");
//        isElementPresentOnWebPage(LoginPageRequestTextLocator,"Required text", "Vuture portal login Page");
//    }

}
