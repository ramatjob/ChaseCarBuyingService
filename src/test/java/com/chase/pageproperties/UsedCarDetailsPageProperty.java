package com.chase.pageproperties;



public interface UsedCarDetailsPageProperty {
    public String CheckAvailabilityButton = "//div[@class='spacing-1']//button[@data-test='leadCTA']//div[@class='btn-inner']";
    public String TruPriceButton = "//div[@class='spacing-1']//button[@data-test='topLowerLeadCTA']//div[@class='btn-inner']";
    public String VehicleImage = "//a[@data-test='PrevNextCardContent-center']//div/img";
    public String VehicleMileage = "//div[@data-qa='Col']/ul/li[2]/span";
    public String VehiclePrice = "//div[@data-qa='list-price']/li/span";
    public String VehicleFirstHeadLine = "//h1[@data-qa='Heading']/div[1]";
    public String VehicleSecondHeadLine = "//h1[@data-qa='Heading']/div[2]";

}
