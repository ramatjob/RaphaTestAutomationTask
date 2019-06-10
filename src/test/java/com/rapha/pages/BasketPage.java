package com.rapha.pages;


import com.rapha.pageproperties.BasketPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends CommonFunctions {
    By CheckOutButtonLocator = By.xpath(BasketPageProperty.CheckOutButton);
    By ProductNameLocator = By.xpath(BasketPageProperty.ProductName);
    By ProductColourAndSizeLocator = By.xpath(BasketPageProperty.ProductColourAndSize);
    By ProductPriceLocator = By.xpath(BasketPageProperty.ProductPrice);


    private WebDriver driver;

    public BasketPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePageProperties(){
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(CheckOutButtonLocator,"Check out button ","On basket screen");
        productNameFromBasketPage = getAnyTextFromWebPage(ProductNameLocator);
        productColourAndSizeFromBasketPage = getAnyTextFromWebPage(ProductColourAndSizeLocator);
        productPriceFromBasketPage = getAnyTextFromWebPage(ProductPriceLocator);
    }

    public void clickOnCheckoutButton(){
        click(CheckOutButtonLocator);
    }

}
