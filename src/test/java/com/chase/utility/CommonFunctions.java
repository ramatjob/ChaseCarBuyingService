package com.chase.utility;


import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver){
        this.driver = driver;
    }

    public static String actualImageLinkFromUsedCarSearchResultsPage = "";
    public static String actualVehicleModelFromUsedCarSearchResultsPage = "";
    public static String actualVehicleMileageFromUsedCarSearchResultsPage = "";
    public static String actualVehicleInteriorFromUsedCarSearchResultsPage = "";
    public static String actualVehiclePriceFromUsedCarSearchResultsPage = "";
    public static String actualVehicleImageFromNewCarSearchResultsPage = "";
    public static String actualVehicleModelFromNewCarSearchResultsPage = "";
    public static String vehicleSeriesNameFromNewCarSearchResultsPage="";
    public static String vehiclePriceTitleFromNewCarSearchResultsPage="";
    public static String vehiclePriceValueFromNewCarSearchResultsPage="";
    public static String vehicleMakeYearFromNewCarSearchResultsPage="";

    public void wait_explicit_till_element_loaded(By by){
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        waitnew.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void wait_explicit_till_element_loaded(String xpath){
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        waitnew.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void enterText(By byProp, String searchText) {
        wait_explicit_till_element_loaded(byProp);
        driver.findElement(byProp).sendKeys(searchText);
    }

    public void click(By byProp) {
        wait_explicit_till_element_loaded(byProp);
        driver.findElement(byProp).click();
    }

    public void click(String xpath) {
        wait_explicit_till_element_loaded(xpath);
        driver.findElement(By.xpath(xpath)).click();
    }

    public String getAnyTextFromWebPage(By prop){
        wait_explicit_till_element_loaded(prop);
        return driver.findElement(prop).getText();
    }

    public String getAnyTextFromWebPage(String xpath){
        wait_explicit_till_element_loaded(xpath);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void selectAnyVlueFromDropDown(By byProp1, By byProp2) throws InterruptedException {
        wait_explicit_till_element_loaded(byProp1);
        WebElement mainElement = driver.findElement(byProp1);
        wait_explicit_till_element_loaded(byProp2);
        WebElement subElement = driver.findElement(byProp2);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainElement).click().perform();
        actions.moveToElement(subElement).click().perform();
    }

    public int getTotalResultsCount(By byProp){
        wait_explicit_till_element_loaded(byProp);
        List<WebElement> weList = driver.findElements(byProp);
        return weList.size();
    }

    public void isElementPresentOnWebPage(By byProp,String str1,String str2){
        boolean isElementPresent = false;
        wait_explicit_till_element_loaded(byProp);
        if(driver.findElement(byProp).isDisplayed()){
            isElementPresent = true;
        }

        if(isElementPresent){
            System.out.println(str1+" is present on the "+str2);
        }else{
            System.out.println(str1+" is not present on the "+str2);
            Assert.fail(str1+" is not present on the "+str2+" screen");
        }
    }

    public boolean compareAnyText(String actualString,String expectedString){
        boolean finalResult;
        if(expectedString.trim().equalsIgnoreCase(actualString.trim())){
            System.out.println("Actual string ("+actualString+")  is matched with the Expected string ("+expectedString+")");
            finalResult = true;
        }else{
            System.out.println("Actual string ("+actualString+")  is not matched with the Expected string ("+expectedString+")");
            finalResult = false;
        }
        return finalResult;
    }

    public boolean containsAnyText(String actualString,String expectedString){
        boolean finalResult;
        if(expectedString.trim().contains(actualString.trim())){
            System.out.println("Actual string ("+actualString+")  is matched with the Expected string ("+expectedString+")");
            finalResult = true;
        }else{
            System.out.println("Actual string ("+actualString+")  is not matched with the Expected string ("+expectedString+")");
            finalResult = false;
        }
        return finalResult;
    }

    public String getValueOfAttribute(By byProp,String attributeProperty){
        wait_explicit_till_element_loaded(byProp);
        return driver.findElement(byProp).getAttribute(attributeProperty);
    }

    public String getValueOfAttribute(String xpath,String attributeProperty){
        wait_explicit_till_element_loaded(xpath);
        return driver.findElement(By.xpath(xpath)).getAttribute(attributeProperty);
    }

    public void wait_implicit_till_window_load(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
