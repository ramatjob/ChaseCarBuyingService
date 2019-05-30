package com.chase.pageproperties;



public interface NewCarDetailsPagePageProperty {
    public String CarDetails = "//div[@data-qa='vehicle-header-vehicle-image']//img";
    public String CustomerPrcingButton = "//strong[@class='d-none d-md-inline']";
    public String CarDetailsHeader = "//h1[@data-qa='vehicle-header-year-make-model']";
    public String CarImage = "//div[@data-qa='vehicle-header-vehicle-image']//img";
    public String MSRPValue = "//span[@class='pricing-block-amount-strikethrough']";
    public String MarketAverageValue = "//div[@data-qa='vehicle-header-average-market-price']//div[@data-qa='LabelBlock-text']/span";
    public String CustomerPricingLink = "//span[@class='d-none d-md-inline']";
    public String BuildAndPriceButton = "//button[@data-test='vehicleHeaderBuildAndPrice']";
    public String ChangeStyleLink = "//div[@data-qa='Container']//a[@data-qa='config-summary-change-style-link']";

}
