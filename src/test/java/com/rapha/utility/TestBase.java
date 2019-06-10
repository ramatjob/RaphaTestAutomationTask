package com.rapha.utility;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class TestBase {

    private WebDriver driver;

//    private String browserType = "Chrome";
//    private static String gridType = "Local";
//    private static String platformType = "WIN32";
//    private static String environmentType = "qa";


    private String browserType = System.getProperty("browserType");
    private static String gridType = System.getProperty("gridType");
    private static String platformType = System.getProperty("platformType");
    private static String environmentType = System.getProperty("environmentType");

    private static final Logger LOGGER = Logger.getLogger(TestBase.class.getName());

    @Before
    public WebDriver initializeDriver() {
        if(gridType.equalsIgnoreCase("Local")) {
            if (driver == null) {
                if (browserType.equalsIgnoreCase("Chrome")) {
                    driver = getChromeDriver();
                } else if (browserType.equalsIgnoreCase("Firefox")) {
                    //Firefox driver initialization code goes here
                }else if (browserType.equalsIgnoreCase("IE")) {
                    //IE driver initialization code goes here
                } else if (browserType.equalsIgnoreCase("Safari")) {
                    //Safari driver initialization code goes here
                }
            }
        }else if(gridType.equalsIgnoreCase("BrowserStack")){
            //BrowserStack driver initialization code goes here
        }else if(gridType.equalsIgnoreCase("SauceLabs")){
            //SauceLabs driver initialization code goes here
        } else if(gridType.equalsIgnoreCase("SeleniumGrid")){
            //SeleniumGrid driver initialization code goes here
        }
        return driver;
    }

    @After
    public void tearDown(){
        driver.close();
        driver = null;
    }

    private WebDriver getChromeDriver() {
        LOGGER.info("Loading the Chrome driver");
        String driverPath = null;
        ChromeOptions chromeOptions = new ChromeOptions();

        if(platformType.equals((PlatformDetails.MAC).toString())) {
            driverPath = BrowserDriverDetails.chromeForMac.getProperty();
            chromeOptions.addArguments("--kiosk");
            chromeOptions.addArguments("--disable-notifications");
        }
        else if(platformType.equals((PlatformDetails.LINUX32).toString())) {
            driverPath = BrowserDriverDetails.chromeForLinux32.getProperty();
            chromeOptions.addArguments("--kiosk");
        }
        else if(platformType.equals((PlatformDetails.LINUX64).toString())) {
            driverPath = BrowserDriverDetails.chromeForLinux64.getProperty();
            chromeOptions.addArguments("--kiosk");
        }
        else if(platformType.equals((PlatformDetails.WIN32).toString())){
            driverPath = BrowserDriverDetails.chromeForWin32.getProperty();
            chromeOptions.addArguments("--start-maximized");
        }
        else if(platformType.equals((PlatformDetails.WIN64).toString())){
            driverPath = BrowserDriverDetails.chromeForWin64.getProperty();
            chromeOptions.addArguments("--start-maximized");
        }

        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver(chromeOptions);
    }

    public void launchUrl(String url){
        driver.get(url);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public String getUrl(String urlPath){
        String finalUrlPath = "";
        String finalURL = "";
        finalUrlPath = environmentType+"_url_"+urlPath;
        UrlDetails allUrls[] = UrlDetails.values();
        for (UrlDetails url : allUrls) {
            if(finalUrlPath.equalsIgnoreCase((url).toString())){
                finalURL = url.getProperty();
            }
        }
        return finalURL;
    }


}
