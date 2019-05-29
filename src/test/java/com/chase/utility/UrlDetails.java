package com.chase.utility;


public enum UrlDetails {

    //QA environment details
    qa_url_ChasePortal("https://chase.truecar.com/main.html"),

    //UAT environment details
    uat_url_ChasePortal("https://chase.truecar.com/main.html"),

    //Prod environment details
    prod_url_ChasePortal("https://chase.truecar.com/main.html");


    private String property;
    public void setProperty(String property){
        this.property = property;
    }

    public String getProperty(){
        return property;
    }

    UrlDetails(String property) {
        this.property = property;
    }
}
