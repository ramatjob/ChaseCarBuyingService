package com.chase.pages;


import com.chase.pageproperties.NewCarDetailsPagePageProperty;
import com.chase.pageproperties.UsedCarDetailsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsedCarDetailsPage extends CommonFunctions {
    By CheckAvailabilityButtonLocator = By.xpath(UsedCarDetailsPageProperty.CheckAvailabilityButton);
    By TruPriceButtonLocator = By.xpath(UsedCarDetailsPageProperty.TruPriceButton);

    By VehicleExteriorLocator = By.xpath(UsedCarDetailsPageProperty.VehicleExterior);
    By VehicleInteriorLocator = By.xpath(UsedCarDetailsPageProperty.VehicleInterior);
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
        //Thread.sleep(4000);
//        String carImage = getValueOfAttribute(CarDetailsLocator,"src");
//        System.out.println(carImage);
//        String carAlt = getValueOfAttribute(CarDetailsLocator,"alt");
//        System.out.println(carAlt);

        String actualVehicleExterior = getAnyTextFromWebPage(VehicleExteriorLocator);
        System.out.println(" 99999999999999 "+actualVehicleExterior);
        String actualVehicleInterior = getAnyTextFromWebPage(VehicleInteriorLocator);
        System.out.println(" 99999999999999 "+actualVehicleInterior);
        String actualVehicleMileage = getAnyTextFromWebPage(VehicleMileageLocator);
        System.out.println(" 99999999999999 "+actualVehicleMileage);
        String actualVehiclePrice = getAnyTextFromWebPage(VehiclePriceLocator);
        System.out.println(" 99999999999999 "+actualVehiclePrice);
        String actualVehicleFirstHeadline = getAnyTextFromWebPage(VehicleFirstHeadLineLocator);
        System.out.println(" 99999999999999 "+actualVehicleFirstHeadline);
        String actualVehicleSecondHeadline = getAnyTextFromWebPage(VehicleSecondHeadLineLocator);
        System.out.println(" 99999999999999 "+actualVehicleSecondHeadline);

    }

    public void verifyThePageProperties(){
        isElementPresentOnWebPage(CheckAvailabilityButtonLocator,"Check Availability button ","On Car Search Detail screen");
        isElementPresentOnWebPage(TruPriceButtonLocator,"True Price button ","On Car Search Detail screen");

    }


}
