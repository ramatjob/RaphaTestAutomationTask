package com.rapha.pages;

import com.rapha.pageproperties.ShippingMethodPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingMethodPage extends CommonFunctions {
    By ContinueToPaymentButtonLocator = By.xpath(ShippingMethodPageProperty.ContinueToPaymentButton);
    By StandardDeliveryMethodLocator = By.xpath(ShippingMethodPageProperty.StandardDeliveryMethod);

    private WebDriver driver;

    public ShippingMethodPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePageProperties() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(ContinueToPaymentButtonLocator,"Continue To Payment button ","On shipping method screen");
        isElementPresentOnWebPage(StandardDeliveryMethodLocator,"Standard Delivery Method ","On shipping method screen");

        standardDeliveryMethodFromShippingMethodPage = getAnyTextFromWebPage(StandardDeliveryMethodLocator);
    }

    public void clickOnContinueToPaymentButton() throws InterruptedException {
        click(StandardDeliveryMethodLocator);
        click(ContinueToPaymentButtonLocator);
    }

}
