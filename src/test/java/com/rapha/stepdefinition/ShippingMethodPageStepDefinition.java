package com.rapha.stepdefinition;


import com.rapha.pages.ShippingMethodPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ShippingMethodPageStepDefinition {
    private WebDriver driver;
    private ShippingMethodPage shippingMethodPageObject;
    private TestBase testBase;

    public ShippingMethodPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the Shipping Method page$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        shippingMethodPageObject = new ShippingMethodPage(driver);
        shippingMethodPageObject.verifyThePageProperties();
    }

    @And("^I click on the Continue To Payment button$")
    public void clickOnContinueToPaymentButton() throws InterruptedException {
        shippingMethodPageObject.clickOnContinueToPaymentButton();
    }

}
