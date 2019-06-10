package com.rapha.pages;

import com.rapha.pageproperties.PaymentMethodPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaymentMethodPage extends CommonFunctions {
    By ShippingAddressLocator = By.xpath(PaymentMethodPageProperty.ShippingAddress);
    By ShippingMethodLocator = By.xpath(PaymentMethodPageProperty.ShippingMethod);
    By PaymentMethodLocator = By.xpath(PaymentMethodPageProperty.PaymentMethod);
    By ProductNameLocator = By.xpath(PaymentMethodPageProperty.ProductName);
    By ProductColourAndSizeLocator = By.xpath(PaymentMethodPageProperty.ProductColourAndSize);
    By ProductPriceLocator = By.xpath(PaymentMethodPageProperty.ProductPrice);

    private WebDriver driver;

    public PaymentMethodPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePageProperties() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(ShippingAddressLocator,"Shipping Address ","On payment method screen");
        isElementPresentOnWebPage(ShippingMethodLocator,"Shipping Method ","On payment method screen");
        isElementPresentOnWebPage(PaymentMethodLocator,"Payment Method ","On payment method screen");

    }

    public void compareThePaymentMethodDetails(){

        String shippingAddressFromPaymentMethodPage = getAnyTextFromWebPage(ShippingAddressLocator);
        String shippingMethodFromPaymentMethodPage = getAnyTextFromWebPage(ShippingMethodLocator);
        String productNameFromPaymentMethodPage = getAnyTextFromWebPage(ProductNameLocator);
        String productColourAndSizeFromPaymentMethodPage = getAnyTextFromWebPage(ProductColourAndSizeLocator);
        String productPriceFromPaymentMethodPage = getAnyTextFromWebPage(ProductPriceLocator);

        String expectedFinalAddress = titleFromShippingAddressPage+" "+
                firstNameFromShippingAddressPage+" "+
                lastNameFromShippingAddressPage+", "+
                addressLine1FromShippingAddressPage+", "+
                addressLine2FromShippingAddressPage+", "+
                cityFromShippingAddressPage+", "+
                postcodeFromShippingAddressPage+", "+
                countryFromShippingAddressPage;

        System.out.println(shippingMethodFromPaymentMethodPage);
        System.out.println(standardDeliveryMethodFromShippingMethodPage);
        System.out.println(productPriceFromPaymentMethodPage);
        System.out.println(productPriceFromBasketPage);


        Assert.assertTrue(compareAnyText(shippingAddressFromPaymentMethodPage, expectedFinalAddress));
        Assert.assertTrue(containsAnyText(shippingMethodFromPaymentMethodPage, standardDeliveryMethodFromShippingMethodPage.split("-")[1]));
        Assert.assertTrue(compareAnyText(productNameFromPaymentMethodPage, productNameFromBasketPage));
        Assert.assertTrue(compareAnyText(productColourAndSizeFromPaymentMethodPage, productColourAndSizeFromBasketPage));
        Assert.assertTrue(containsAnyText(productPriceFromPaymentMethodPage, productPriceFromBasketPage));

    }

}
