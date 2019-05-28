package com.chase.pageproperties;



public interface NewCarSearchResultsPageProperty {
    public String TotalResultsList = "//div[@class='row row-2 padding-top-2']";
    public String FirstCarLink = "//div[@class='row row-2 padding-top-2']/div[1]//div[@data-qa='Img']";
    public String CarLinkDetails = "//div[@class='row row-2 padding-top-2']/div[1]//div[@data-qa='Img']//img";
    public String ShowMessage = "//div[@class='padding-y-1']";
    public String BMWText = "//span[@class='margin-left-2']";
    public String BMWLogo = "//div[@class='img-container']//img";

    public String SelectMakeDropdown = "//select[@class='form-control-select-sm']";
    public String ZipCode = "//input[@placeholder='ZIP Code']";
    public String UpdateButton = "//div[@class='btn-inner']";

}
