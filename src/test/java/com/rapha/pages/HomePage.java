package com.rapha.pages;


import com.rapha.pageproperties.HomePageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends CommonFunctions {
    By MyAccountIconLocator = By.xpath(HomePageProperty.MyAccountIcon);
    By SignInLocator = By.xpath(HomePageProperty.SignInLink);
    By ShopMenuOptionLocator = By.xpath(HomePageProperty.ShopMenuOption);
    By MensMenuOptionLocator = By.xpath(HomePageProperty.MensMenuOption);
    By JersyMenuOptionLocator = By.xpath(HomePageProperty.JersyMenuOption);


    private WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyTheObjects() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(MyAccountIconLocator,"My Account icon"," present on the rapha portal home screen");
        isElementPresentOnWebPage(ShopMenuOptionLocator,"Shop menu option"," present on the rapha portal home screen");

    }

    public void clickOnSignInLink() throws InterruptedException {
        selectAnyVlueFromDropDown(MyAccountIconLocator,SignInLocator);
    }

    public void navigateToJerseyUnderMensSection() throws InterruptedException {
        selectAnyValueFromUIMenu(ShopMenuOptionLocator,MensMenuOptionLocator,JersyMenuOptionLocator);
    }

}
