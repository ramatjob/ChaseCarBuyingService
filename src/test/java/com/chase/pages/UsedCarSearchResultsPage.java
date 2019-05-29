package com.chase.pages;


import com.chase.pageproperties.UsedCarSearchResultsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsedCarSearchResultsPage extends CommonFunctions {
    By TotalResultsListLocator = By.xpath(UsedCarSearchResultsPageProperty.TotalResultsList);
    By VehicleModelLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleModel);
    By VehicleMileageLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleMileage);
    By VehicleInteriorLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleInterior);
    By VehicleExteriorLocator = By.xpath(UsedCarSearchResultsPageProperty.VehicleExterior);
    By VehiclePriceLocator = By.xpath(UsedCarSearchResultsPageProperty.VehiclePrice);


    private WebDriver driver;

    public UsedCarSearchResultsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnThePage(){
        int resultsCount = getTotalResultsCount(TotalResultsListLocator);
        if(resultsCount > 0) {
            isElementPresentOnWebPage(VehicleModelLocator,"Vehicle Model "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleMileageLocator,"Vehicle Mileage "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleInteriorLocator,"Vehicle Interior "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehicleExteriorLocator,"Vehicle Exterior "," on the Used Car Serach Results Page");
            isElementPresentOnWebPage(VehiclePriceLocator,"Vehicle Price "," on the Used Car Serach Results Page");

        }else{
            System.out.println("Results count is < 0");
        }

    }

    public void getCarDetails(int requiredLinkNumber){
        String imageFirstXpath = "//div[@class='spacing-1']/div[";
        String imageLastXpath = "]/a/div[2]/img";
        String finalImageXpath = imageFirstXpath+requiredLinkNumber+imageLastXpath;
        CommonFunctions.actualImageLinkFromUsedCarSearchResultsPage = getValueOfAttribute(finalImageXpath, "src");

        String modelFirstXpath = "//div[@class='spacing-1']/div[";
        String modelLastXpath = "]/div/div[1]/a/h4";
        String finalModelXpath = modelFirstXpath+requiredLinkNumber+modelLastXpath;
        CommonFunctions.actualVehicleModelFromUsedCarSearchResultsPage = getAnyTextFromWebPage(finalModelXpath);

        String mileageFirstXpath = "//div[@class='spacing-1']/div[";
        String mileageLastXpath = "]/div/div[2]/a/div[2]/div[1]/span[2]";
        String mileageXpath = mileageFirstXpath+requiredLinkNumber+mileageLastXpath;
        CommonFunctions.actualVehicleMileageFromUsedCarSearchResultsPage = getAnyTextFromWebPage(mileageXpath);

        String interiorFirstXpath = "//div[@class='spacing-1']/div[";
        String interiorLastXpath = "]/div/div[2]/a/div[2]/div[3]/span[2]";
        String finalInteriorXpath = interiorFirstXpath+requiredLinkNumber+interiorLastXpath;
        CommonFunctions.actualVehicleInteriorFromUsedCarSearchResultsPage = getAnyTextFromWebPage(finalInteriorXpath);

        String priceFirstXpath = "//div[@class='spacing-1']/div[";
        String priceLastXpath = "]/div/div[2]/div[1]/div[2]/h4";
        String finalPriceXpath = priceFirstXpath+requiredLinkNumber+priceLastXpath;
        CommonFunctions.actualVehiclePriceFromUsedCarSearchResultsPage = getAnyTextFromWebPage(finalPriceXpath);
    }

    public void clickOnFirstCarLink(int requiredLinkNumber){
        String firstXpath = "//div[@class='spacing-1']/div[";
        String lastXpath = "]";
        String finalXpath = firstXpath+requiredLinkNumber+lastXpath;

        int resultsCount = getTotalResultsCount(TotalResultsListLocator);
        if(resultsCount > 0){
            if(requiredLinkNumber <= resultsCount) {
                click(finalXpath);
            }else{
                System.out.println("We are trying to click the car link "+requiredLinkNumber+" which is less than the total resultsCount "+resultsCount);
            }
        }else{
            System.out.println("Results count is < 0");
        }
    }
}
