package com.rapha.utility;


public enum UrlDetails {

    //QA environment details
    qa_url_RaphaPortal("https://www.rapha.cc"),

    //UAT environment details
    uat_url_RaphaPortal("https://www.rapha.cc"),

    //Prod environment details
    prod_url_RaphaPortal("https://www.rapha.cc");


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
