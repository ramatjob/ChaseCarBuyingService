package com.chase.pages;


import com.chase.pageproperties.UsedCarDetailsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UsedCarDetailsPage extends CommonFunctions {
    By CheckAvailabilityButtonLocator = By.xpath(UsedCarDetailsPageProperty.CheckAvailabilityButton);
    By TruPriceButtonLocator = By.xpath(UsedCarDetailsPageProperty.TruPriceButton);
    By VehicleImageLocator = By.xpath(UsedCarDetailsPageProperty.VehicleImage);
    By VehicleMileageLocator = By.xpath(UsedCarDetailsPageProperty.VehicleMileage);
    By VehiclePriceLocator = By.xpath(UsedCarDetailsPageProperty.VehiclePrice);
    By VehicleFirstHeadLineLocator = By.xpath(UsedCarDetailsPageProperty.VehicleFirstHeadLine);
    By VehicleSecondHeadLineLocator = By.xpath(UsedCarDetailsPageProperty.VehicleSecondHeadLine);


    private WebDriver driver;

    public UsedCarDetailsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarDetails() throws InterruptedException {

        String actualVehicleImage = getValueOfAttribute(VehicleImageLocator,"src");
        String actualVehicleMileage = getAnyTextFromWebPage(VehicleMileageLocator);
        String actualVehiclePrice = getAnyTextFromWebPage(VehiclePriceLocator);
        String actualVehicleFirstHeadline = getAnyTextFromWebPage(VehicleFirstHeadLineLocator);
        String actualVehicleSecondHeadline = getAnyTextFromWebPage(VehicleSecondHeadLineLocator);
        String actualVehicleModel = actualVehicleFirstHeadline+" "+actualVehicleSecondHeadline;


        Assert.assertTrue(compareAnyText(actualVehicleImage, actualImageLinkFromUsedCarSearchResultsPage));
        Assert.assertTrue(compareAnyText(actualVehicleMileage, actualVehicleMileageFromUsedCarSearchResultsPage));
        Assert.assertTrue(compareAnyText(actualVehiclePrice, actualVehiclePriceFromUsedCarSearchResultsPage));
        Assert.assertTrue(compareAnyText(actualVehicleModel, actualVehicleModelFromUsedCarSearchResultsPage));

    }

    public void verifyThePageProperties(){
        isElementPresentOnWebPage(CheckAvailabilityButtonLocator,"Check Availability button ","On Car Search Detail screen");
        isElementPresentOnWebPage(TruPriceButtonLocator,"True Price button ","On Car Search Detail screen");
    }


}
