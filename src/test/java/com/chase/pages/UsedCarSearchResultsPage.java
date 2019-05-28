package com.chase.pages;


import com.chase.pageproperties.NewCarSearchResultsPageProperty;
import com.chase.pageproperties.UsedCarSearchResultsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UsedCarSearchResultsPage extends CommonFunctions {
    By TotalResultsListLocator = By.xpath(UsedCarSearchResultsPageProperty.TotalResultsList);
    By ImageLinkLocator = By.xpath(UsedCarSearchResultsPageProperty.ImageLink);
    By VehicleModelLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleModel);
    By VehicleMileageLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleMileage);
    By VehicleInteriorLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleInterior);
    By VehicleExteriorLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleExterior);
    By VehiclePriceLocator = By.xpath(UsedCarSearchResultsPageProperty.VehiclePrice);
    By VehicleLinkLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleLink);


    private WebDriver driver;

    public UsedCarSearchResultsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnThePage(){
        String actualImageLink = getValueOfAttribute(ImageLinkLocator,"src");
        System.out.println(" %%%%%%%%%%%%%%5 "+actualImageLink);
        String actualVehicleModel = getAnyTextFromWebPage(VehicleModelLocator);
        System.out.println(" %%%%%%%%%%%%%%5 "+actualVehicleModel);
        String actualVehicleMileage = getAnyTextFromWebPage(VehicleMileageLocator);
        System.out.println(" %%%%%%%%%%%%%%5 "+actualVehicleMileage);
        String actualVehicleInterior = getAnyTextFromWebPage(VehicleInteriorLocator);
        System.out.println(" %%%%%%%%%%%%%%5 "+actualVehicleInterior);
        String actualVehicleExterior = getAnyTextFromWebPage(VehicleExteriorLocator);
        System.out.println(" %%%%%%%%%%%%%%5 "+actualVehicleExterior);
        String actualVehiclePrice = getAnyTextFromWebPage(VehiclePriceLocator);
        System.out.println(" %%%%%%%%%%%%%%5 "+actualVehiclePrice);

        String expectedShowMessage = "Showing 24 new BMW models. Select a model for pricing details.";
        String expectedBMWText = "BMW Models";
        String expectedBMWLogo= "https://static.tcimg.net/vehicles/logo/192x192_full_color/828d494572d571c5/BMW.png";

//        Assert.assertTrue(compareAnyText(actualShowMessage,expectedShowMessage));
//        Assert.assertTrue(compareAnyText(actualBMWText,expectedBMWText));
//        Assert.assertTrue(compareAnyText(actualBMWLogo,expectedBMWLogo));
    }

    public void clickOnFirstCarLink(){
        int resultsCount = getTotalResultsCount(TotalResultsListLocator);
        System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& "+resultsCount);
        if(resultsCount > 0){
            System.out.println("Results count is > 0");
            click(VehicleLinkLocator);
        }else{
            System.out.println("Results count is < 0");
        }
    }
}
