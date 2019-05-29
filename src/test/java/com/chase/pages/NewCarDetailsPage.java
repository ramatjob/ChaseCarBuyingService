package com.chase.pages;

import com.chase.pageproperties.NewCarDetailsPagePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewCarDetailsPage extends CommonFunctions {
    By CarDetailsLocator = By.xpath(NewCarDetailsPagePageProperty.CarDetails);
    By CustomerPrcingButtonLocator = By.xpath(NewCarDetailsPagePageProperty.CustomerPrcingButton);
    By CarDetailsHeaderLocator = By.xpath(NewCarDetailsPagePageProperty.CarDetailsHeader);
    By CarImageLocator = By.xpath(NewCarDetailsPagePageProperty.CarImage);
    By MSRPValueLocator = By.xpath(NewCarDetailsPagePageProperty.MSRPValue);
    By MarketAverageValueLocator = By.xpath(NewCarDetailsPagePageProperty.MarketAverageValue);
    By CustomerPricingLinkLocator = By.xpath(NewCarDetailsPagePageProperty.CustomerPricingLink);
    By BuildAndPriceButtonLocator = By.xpath(NewCarDetailsPagePageProperty.BuildAndPriceButton);

    private String carImage="";
    private String carModel="";

    private WebDriver driver;

    public NewCarDetailsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarDetails() throws InterruptedException {
        carImage = getValueOfAttribute(CarDetailsLocator,"src");
        carModel = getValueOfAttribute(CarDetailsLocator,"alt");
    }

    public void compareCarImageAndModel(){
        String[] imageArray = actualVehicleImageFromNewCarSearchResultsPage.split("/");
        Assert.assertTrue(containsAnyText(imageArray[imageArray.length-1], carImage ));
        Assert.assertTrue(containsAnyText(carModel, actualVehicleModelFromNewCarSearchResultsPage));
    }

    public void verifyThePageProperties() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(CustomerPrcingButtonLocator,"Customer Pricing button ","On Car Search Detail screen");
        isElementPresentOnWebPage(CarDetailsHeaderLocator,"Car Details Header ","On Car Search Detail screen");
        isElementPresentOnWebPage(CarImageLocator,"Car Image ","On Car Search Detail screen");
        isElementPresentOnWebPage(MSRPValueLocator,"MSRP Value ","On Car Search Detail screen");
        isElementPresentOnWebPage(MarketAverageValueLocator,"Market Average Value ","On Car Search Detail screen");
        isElementPresentOnWebPage(CustomerPricingLinkLocator,"Customer Pricing Link ","On Car Search Detail screen");
        isElementPresentOnWebPage(BuildAndPriceButtonLocator,"Build And Price Button ","On Car Search Detail screen");

    }

    public void clickOnBuildAndPriceButton(){
        click(BuildAndPriceButtonLocator);
    }


}
