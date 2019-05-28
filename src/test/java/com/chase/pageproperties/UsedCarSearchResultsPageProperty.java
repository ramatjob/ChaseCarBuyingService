package com.chase.pageproperties;



public interface UsedCarSearchResultsPageProperty {
    public String TotalResultsList = "//div[@class='spacing-1']/div";
            //"//div[@class='spacing-1']";
    public String ImageLink = "//div[@class='spacing-1']/div[1]/a/div[2]/img";
    public String VehicleModel = "//div[@class='spacing-1']/div[1]/div/div[1]/a/h4";
    public String VehicleMileage = "//div[@class='spacing-1']/div[1]/div/div[2]/a/div[2]/div[1]/span[2]";
    public String VehicleExterior = "//div[@class='spacing-1']/div[1]/div/div[2]/a/div[2]/div[2]/span[2]";
    public String VehicleInterior = "//div[@class='spacing-1']/div[1]/div/div[2]/a/div[2]/div[3]/span[2]";
    public String VehiclePrice = "//div[@class='spacing-1']/div[1]/div/div[2]/div[1]/div[2]/h4";
    public String VehicleLink = "//div[@class='spacing-1']/div[1]";
}
