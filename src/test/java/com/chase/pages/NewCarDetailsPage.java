package com.chase.pages;


import com.chase.pageproperties.HomePageProperty;
import com.chase.pageproperties.NewCarDetailsPagePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewCarDetailsPage extends CommonFunctions {
    By CarDetailsLocator = By.xpath(NewCarDetailsPagePageProperty.CarDetails);
    By VehicleImageLocator = By.xpath(NewCarDetailsPagePageProperty.VehicleImage);
    By CustomerPrcingButtonLocator = By.xpath(NewCarDetailsPagePageProperty.CustomerPrcingButton);


    private WebDriver driver;

    public NewCarDetailsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarDetails() throws InterruptedException {
        //Thread.sleep(4000);
        String carImage = getValueOfAttribute(CarDetailsLocator,"src");
        System.out.println(" 7777777777777777777777 "+carImage);
        String carModel = getValueOfAttribute(CarDetailsLocator,"alt");
        System.out.println(" 7777777777777777777777 "+carModel);

        String[] imageArray = actualVehicleImageFromNewCarSearchResultsPage.split("/");
        System.out.println(" £££££££££££££££££££££££££££££££££££££££££££ "+imageArray[imageArray.length-1]);


        Assert.assertTrue(containsAnyText(imageArray[imageArray.length-1], carImage ));
        Assert.assertTrue(containsAnyText(carModel, actualVehicleModelFromNewCarSearchResultsPage));



    }

    public void verifyThePageProperties() throws InterruptedException {
        //Thread.sleep(3000);
        //isElementPresentOnWebPage(VehicleImageLocator,"Vehicle image ","On Car Search Detail screen");
        isElementPresentOnWebPage(CustomerPrcingButtonLocator,"Customer Pricing button ","On Car Search Detail screen");

    }


}

    //https://static.tcimg.net/vehicles/primary/cf503e8dbb58a97e/2019-BMW-2_Series-white-full_color-driver_side_front_quarter.png
    //https://static.tcimg.net/vehicles/primary/e1ab18b2bacce17c/2019-BMW-2_Series-white-full_color-driver_side_front_quarter.png

