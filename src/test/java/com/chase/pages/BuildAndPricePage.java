package com.chase.pages;


import com.chase.pageproperties.BuildAndPricePageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BuildAndPricePage extends CommonFunctions {
    By PriceValueLocator = By.xpath(BuildAndPricePageProperty.PriceValue);

    private String carPrice="";

    private WebDriver driver;

    public BuildAndPricePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void getCarPrice(){
        wait_implicit_till_window_load();
        carPrice = getAnyTextFromWebPage(PriceValueLocator);
    }

    public void compareCarPrice(){
        Assert.assertTrue(compareAnyText(carPrice, vehiclePriceValueFromNewCarSearchResultsPage));
    }
}
