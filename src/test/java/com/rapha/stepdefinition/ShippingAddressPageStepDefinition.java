package com.rapha.stepdefinition;


import com.rapha.pages.ShippingAddressPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ShippingAddressPageStepDefinition {
    private WebDriver driver;
    private ShippingAddressPage shippingAddressPageObject;
    private TestBase testBase;

    public ShippingAddressPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the shipping address page$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        shippingAddressPageObject = new ShippingAddressPage(driver);
        shippingAddressPageObject.verifyThePageProperties();
    }

    @And("^I enter all the mandatory details like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enterAllTheMandatoryDetails(String title,String firstName,String lastName,String phoneNumber,String addressLine1,String addressLine2,String city, String postcode,String country) throws InterruptedException {
        shippingAddressPageObject.selectTitle(title);
        shippingAddressPageObject.enterFirstName(firstName);
        shippingAddressPageObject.enterLastName(lastName);
        shippingAddressPageObject.enterPhoneNumber(phoneNumber);
        shippingAddressPageObject.enterAddressLine1(addressLine1);
        shippingAddressPageObject.enterAddressLine2(addressLine2);
        shippingAddressPageObject.enterCity(city);
        shippingAddressPageObject.enterPostCode(postcode);
        shippingAddressPageObject.selectCountry(country);
    }

    @And("^I click on the Continue To Shipping button$")
    public void enterAValidPassword() throws InterruptedException {
        shippingAddressPageObject.clickOnContinueToShippingButton();
    }

}
