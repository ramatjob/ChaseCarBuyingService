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
    public String TestDriveTitle = "//h2[contains(text(),'Test Drive Our Auto Loan Calculator')]";


}
