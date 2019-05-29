package com.chase.pages;


import com.chase.pageproperties.NewCarSearchResultsPageProperty;
import com.chase.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCarSearchResultsPage extends CommonFunctions {

    By TotalResultsListLocator = By.xpath(NewCarSearchResultsPageProperty.TotalResultsList);
    By ShowMessageLocator = By.xpath(NewCarSearchResultsPageProperty.ShowMessage);
    By BMWTextLocator = By.xpath(NewCarSearchResultsPageProperty.BMWText);
    By BMWLogoLocator = By.xpath(NewCarSearchResultsPageProperty.BMWLogo);

    private WebDriver driver;

    public NewCarSearchResultsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnThePage(){
        isElementPresentOnWebPage(ShowMessageLocator,"Results message "," On the New Car Search Results screen");
        isElementPresentOnWebPage(BMWTextLocator,"BMW Text "," On the New Car Search Results screen");
        isElementPresentOnWebPage(BMWLogoLocator,"BMW Logo "," On the New Car Search Results screen");
    }

    public void clickOnFirstCarLink(int requiredLinkNumber){
        String firstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String latXpath = "]//div[@data-qa='Img']";
        String finalXpath = firstXpath+requiredLinkNumber+latXpath;

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

    public void getDetailsOfCarLink(int requiredLinkNumber){
        String firstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String lastXpath = "]//div[@data-qa='Img']//img";
        String finalXpath = firstXpath+requiredLinkNumber+lastXpath;
        actualVehicleImageFromNewCarSearchResultsPage = getValueOfAttribute(finalXpath,"src");
        actualVehicleModelFromNewCarSearchResultsPage =getValueOfAttribute(finalXpath,"alt");

        String seriesNameFirstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String seriesNameLastXpath = "]//div[@data-qa='CardContent']//h4";
        String finalSeriesNameXpath = seriesNameFirstXpath+requiredLinkNumber+seriesNameLastXpath;
        vehicleSeriesNameFromNewCarSearchResultsPage = getAnyTextFromWebPage(finalSeriesNameXpath);

        String priceTitleFirstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String priceTitleLastXpath = "]//div[@data-qa='CardContent']//div[@class='label-block-title']";
        String finalPriceTitleXpath = priceTitleFirstXpath+requiredLinkNumber+priceTitleLastXpath;
        vehiclePriceTitleFromNewCarSearchResultsPage = getAnyTextFromWebPage(finalPriceTitleXpath);

        String priceValueFirstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String priceValueLastXpath = "]//div[@data-qa='CardContent']//div[@class='label-block-text']//span";
        String finalPriceValueXpath = priceValueFirstXpath+requiredLinkNumber+priceValueLastXpath;
        vehiclePriceValueFromNewCarSearchResultsPage = getAnyTextFromWebPage(finalPriceValueXpath);

        String makeYearFirstXpath = "//div[@class='row row-2 padding-top-2']/div[";
        String makeYearLastXpath = "]/a";
        String finalMakeYearXpath = makeYearFirstXpath+requiredLinkNumber+makeYearLastXpath;
        vehicleMakeYearFromNewCarSearchResultsPage = getValueOfAttribute(finalMakeYearXpath,"data-analytics-model-year");
    }

}
