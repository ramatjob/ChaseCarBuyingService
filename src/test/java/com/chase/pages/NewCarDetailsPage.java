package com.chase.pages;

import com.chase.pageproperties.NewCarDetailsPagePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewCarDetailsPage extends CommonFunctions {
    By CarDetailsLocator = By.xpath(NewCarDetailsPagePageProperty.CarDetails);
    By CustomerPrcingButtonLocator = By.xpath(NewCarDetailsPagePageProperty.CustomerPrcingButton);


    private WebDriver driver;

    public NewCarDetailsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarDetails() throws InterruptedException {
        String carImage = getValueOfAttribute(CarDetailsLocator,"src");
        String carModel = getValueOfAttribute(CarDetailsLocator,"alt");
        String[] imageArray = actualVehicleImageFromNewCarSearchResultsPage.split("/");

        Assert.assertTrue(containsAnyText(imageArray[imageArray.length-1], carImage ));
        Assert.assertTrue(containsAnyText(carModel, actualVehicleModelFromNewCarSearchResultsPage));
    }

    public void verifyThePageProperties() throws InterruptedException {
        isElementPresentOnWebPage(CustomerPrcingButtonLocator,"Customer Pricing button ","On Car Search Detail screen");

    }


}
