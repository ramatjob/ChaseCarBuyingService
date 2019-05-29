package com.chase.pages;


import com.chase.pageproperties.NewCarSearchResultsPageProperty;
import com.chase.pageproperties.UsedCarSearchResultsPageProperty;
import com.chase.testdata.UsedCarSearchResultsPageTestData;
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
        int resultsCount = getTotalResultsCount(TotalResultsListLocator);
        System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& "+resultsCount);
        if(resultsCount > 0) {
            //isElementPresentOnWebPage(ImageLinkLocator,"Vehicle Image "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleModelLocator,"Vehicle Model "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleMileageLocator,"Vehicle Mileage "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleInteriorLocator,"Vehicle Interior "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleExteriorLocator,"Vehicle Exterior "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehiclePriceLocator,"Vehicle Price "," on the Used Car Serach Results Page");

        }else{
            System.out.println("Results count is < 0");
        }

    }

    public void getCarDetails(){
        CommonFunctions.actualImageLinkFromUsedCarSearchResultsPage = getValueOfAttribute(ImageLinkLocator, "src");
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualImageLinkFromUsedCarSearchResultsPage);
        CommonFunctions.actualVehicleModelFromUsedCarSearchResultsPage = getAnyTextFromWebPage(VehicleModelLocator);
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualVehicleModelFromUsedCarSearchResultsPage);
        CommonFunctions.actualVehicleMileageFromUsedCarSearchResultsPage = getAnyTextFromWebPage(VehicleMileageLocator);
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualVehicleMileageFromUsedCarSearchResultsPage);
        CommonFunctions.actualVehicleInteriorFromUsedCarSearchResultsPage = getAnyTextFromWebPage(VehicleInteriorLocator);
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualVehicleInteriorFromUsedCarSearchResultsPage);
        CommonFunctions.actualVehicleExteriorFromUsedCarSearchResultsPage = getAnyTextFromWebPage(VehicleExteriorLocator);
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualVehicleExteriorFromUsedCarSearchResultsPage);
        CommonFunctions.actualVehiclePriceFromUsedCarSearchResultsPage = getAnyTextFromWebPage(VehiclePriceLocator);
        System.out.println(" %%%%%%%%%%%%%%5 " + CommonFunctions.actualVehiclePriceFromUsedCarSearchResultsPage);
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
