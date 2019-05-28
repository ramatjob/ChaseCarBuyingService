package com.chase.pages;


import com.chase.pageproperties.HomePageProperty;
import com.chase.pageproperties.NewCarDetailsPagePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCarDetailsPage extends CommonFunctions {
    By CarDetailsLocator = By.xpath(NewCarDetailsPagePageProperty.CarDetails);
    By BuildAndPriceButtonLocator = By.xpath(NewCarDetailsPagePageProperty.BuildAndPriceButton);
    By CustomerPrcingButtonLocator = By.xpath(NewCarDetailsPagePageProperty.CustomerPrcingButton);


    private WebDriver driver;

    public NewCarDetailsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarDetails() throws InterruptedException {
        //Thread.sleep(4000);
        String carImage = getValueOfAttribute(CarDetailsLocator,"src");
        System.out.println(carImage);
        String carAlt = getValueOfAttribute(CarDetailsLocator,"alt");
        System.out.println(carAlt);
    }

    public void verifyThePageProperties(){
        isElementPresentOnWebPage(BuildAndPriceButtonLocator,"Build and Price button ","On Car Search Detail screen");
        isElementPresentOnWebPage(CustomerPrcingButtonLocator,"Build and Price button ","On Car Search Detail screen");

    }


}
