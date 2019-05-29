package com.chase.pageproperties;


public interface HomePageProperty {
    public String LeftSideTitle = "//span[@class='service_1n29f82']";
    public String NewCarSelectMakeDropdown = "//div[@data-qa='Col']//div[@data-qa='SelectNewMake']//*[@class='icon icon-color-default']";
    public String NewCarMakeName = "//div[@data-qa='Col']//div[@data-qa='SelectNewMake']//div[@data-qa='DropdownBox-menu']//button[@value='bmw']";
    public String NewCarZipcodeBox = "//div[@class='padding-right-md-4 padding-bottom-md-0 padding-bottom-4 col-12 col-md-6']//div[@class='text-left']//form[@class='d-flex justify-content-center align-items-center margin-top-3']//label[@class='field-container field-size-md field-layout-float field-theme-dark field-emphasized margin-right-2']//div//input[@placeholder='ZIP Code']";
    public String ShopNewCarsButton = "//div[contains(text(),'Shop New Cars')]";
    public String UsedCarSelectMakeDropdown = "//div[@data-qa='Col']//div[@data-qa='SelectUsedMake']//*[@class='icon icon-color-default']";
    public String UsedCarMakeName = "//div[@data-qa='Col']//div[@data-qa='SelectUsedMake']//div[@data-qa='DropdownBox-menu']//button[@value='bmw']";
    public String UsedCarZipcodeBox = "//div[@class='usedCarSelector_5ok647 padding-left-md-4 padding-top-md-0 padding-top-4 col-12 col-md-6']//div[@class='text-left']//form[@class='d-flex justify-content-center align-items-center margin-top-3']//label[@class='field-container field-size-md field-layout-float field-theme-dark field-emphasized margin-right-2']//div//input[@placeholder='ZIP Code']";
    public String ShopUsedCarsButton = "//div[contains(text(),'Shop Used Cars')]";
    public String AutoLoansMenu = "//a[contains(text(),'Auto loans')]";
    public String ChaseSymbol = "//img[@class='logo_1syy1m0']"; //https://consumer.tcimg.net/assets/19-05/logo-aca9ba0a630257cb35d7f60ee4349f30.svg
    public String RightSideTitle1 = "//span[@class='poweredBy_pw9p4f']";
    public String RightSideTitle2 = "//img[@class='tempLogo_1ap3qm0']"; //https://consumer.tcimg.net/assets/19-05/tc-logo_122x20-fa794b42eef3f0f5f74482fb9af0f5ad.png
    public String CarBuyingHomeMenu = "//span[@id='home-link']";
    public String NewCarSearchMenu = "//span[@id='new-car-link']";
    public String UsedCarSearchMenu = "//span[@id='used-car-link']";
    public String MoneySaveTitle = "//h4[@class='heading-2 heading-xl-1']";
    public String NewCarSearchTitle = "//p[contains(text(),'Price a New Car')]";
    public String UsedCarSearchTitle = "//p[contains(text(),'Price a Used Car')]";

}
