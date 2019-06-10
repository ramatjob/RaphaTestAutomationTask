package com.rapha.stepdefinition;


import com.rapha.pages.PaymentMethodPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PaymentMethodPageStepDefinition {
    private WebDriver driver;
    private PaymentMethodPage paymentMethodPageObject;
    private TestBase testBase;

    public PaymentMethodPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on Payment Method page$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        paymentMethodPageObject = new PaymentMethodPage(driver);
        paymentMethodPageObject.verifyThePageProperties();
    }

    @Then("^I compare the payment method page details against the details of the previous pages$")
    public void comparePaymentMethodDetails() throws InterruptedException {
        paymentMethodPageObject.compareThePaymentMethodDetails();
    }


}
