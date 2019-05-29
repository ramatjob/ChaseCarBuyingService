package com.chase.pageproperties;



public interface NewCarDetailsPagePageProperty {
    public String CarDetails = "//div[@data-qa='vehicle-header-vehicle-image']//img";

    //img[@class='img-inner img-block']//img;
    //div[@class='img-container img-container-block']//img
    //div[@data-qa='vehicle-header-vehicle-image']//img

    public String VehicleImage = "//div[@data-qa='vehicle-header-vehicle-image']/img";
            //"//button[@data-test='vehicleHeaderBuildAndPrice']//div[@class='btn-inner']";

    public String CustomerPrcingButton = "//strong[@class='d-none d-md-inline']";

    public String FirstCarLink = "//div[@class='row row-2 padding-top-2']/div[1]//div[@data-qa='Img']";
    public String CarLinkDetails = "//div[@class='row row-2 padding-top-2']/div[1]//div[@data-qa='Img']//img";
    public String SelectMakeDropdown = "//select[@class='form-control-select-sm']";
    public String ZipCode = "//input[@placeholder='ZIP Code']";
    public String UpdateButton = "//div[@class='btn-inner']";

}
