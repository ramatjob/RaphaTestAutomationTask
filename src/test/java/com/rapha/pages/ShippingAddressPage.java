package com.rapha.pages;

import com.rapha.pageproperties.ShippingAddressPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingAddressPage extends CommonFunctions {
    By TitleDropdownLocator = By.xpath(ShippingAddressPageProperty.TitleDropdown);
    By FirstNameLocator = By.xpath(ShippingAddressPageProperty.FirstName);
    By LastNameLocator = By.xpath(ShippingAddressPageProperty.LastName);
    By PhoneNumberLocator = By.xpath(ShippingAddressPageProperty.PhoneNumber);
    By AddressLine1Locator = By.xpath(ShippingAddressPageProperty.AddressLine1);
    By AddressLine2Locator = By.xpath(ShippingAddressPageProperty.AddressLine2);
    By CityLocator = By.xpath(ShippingAddressPageProperty.City);
    By PostcodeLocator = By.xpath(ShippingAddressPageProperty.Postcode);
    By CountryDropdownLocator = By.xpath(ShippingAddressPageProperty.CountryDropdown);
    By ContinueToShippingButtonLocator = By.xpath(ShippingAddressPageProperty.ContinueToShippingButton);


    private WebDriver driver;

    public ShippingAddressPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePageProperties() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(TitleDropdownLocator,"Title drop down ","On shipping address screen");
        isElementPresentOnWebPage(FirstNameLocator,"First name text box ","On shipping address screen");
        isElementPresentOnWebPage(LastNameLocator,"Last name text box ","On shipping address screen");
        isElementPresentOnWebPage(PhoneNumberLocator,"Phone number text box ","On shipping address screen");
        isElementPresentOnWebPage(AddressLine1Locator,"Address line1 text box ","On shipping address screen");
        isElementPresentOnWebPage(AddressLine2Locator,"Address line2 text box ","On shipping address screen");
        isElementPresentOnWebPage(CityLocator,"City text box ","On shipping address screen");
        isElementPresentOnWebPage(PostcodeLocator,"Postcode text box ","On shipping address screen");
        isElementPresentOnWebPage(ContinueToShippingButtonLocator,"Continue to shipping button ","On shipping address screen");
    }

    public void selectTitle(String title) throws InterruptedException {
        titleFromShippingAddressPage = title;
        selectAnyOptionFromDropdown(TitleDropdownLocator,title);
    }

    public void enterFirstName(String firstName){
        firstNameFromShippingAddressPage = firstName;
        enterText(FirstNameLocator,firstName);
    }

    public void enterLastName(String lastName){
        lastNameFromShippingAddressPage = lastName;
        enterText(LastNameLocator,lastName);
    }

    public void enterPhoneNumber(String phoneNumber){
        enterText(PhoneNumberLocator,phoneNumber);
    }

    public void enterAddressLine1(String addressLine1){
        addressLine1FromShippingAddressPage = addressLine1;
        enterText(AddressLine1Locator,addressLine1);
    }

    public void enterAddressLine2(String addressLine2){
        addressLine2FromShippingAddressPage = addressLine2;
        enterText(AddressLine2Locator,addressLine2);
    }

    public void enterCity(String city){
        cityFromShippingAddressPage = city;
        enterText(CityLocator,city);
    }

    public void enterPostCode(String postcode){
        postcodeFromShippingAddressPage = postcode;
        enterText(PostcodeLocator,postcode);
    }

    public void selectCountry(String country){
        countryFromShippingAddressPage = country;
        selectAnyOptionFromDropdown(CountryDropdownLocator,country);
    }

    public void clickOnContinueToShippingButton(){
        click(ContinueToShippingButtonLocator);
    }

}
