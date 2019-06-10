package com.rapha.stepdefinition;


import com.rapha.pages.GuestCheckoutPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class GuestCheckoutPageStepDefinition {
    private WebDriver driver;
    private GuestCheckoutPage guestCheckoutPageObject;
    private TestBase testBase;

    public GuestCheckoutPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the guest checkout page$")
    public void verifyObjectsOnGuestCheckoutPage() throws InterruptedException {
        driver = testBase.getDriver();
        guestCheckoutPageObject = new GuestCheckoutPage(driver);
        guestCheckoutPageObject.verifyThePropertiesOnPage();
    }

    @And("^I enter a valid \"([^\"]*)\" into Email box$")
    public void enterAValidEmail(String validEmail) throws InterruptedException {
        guestCheckoutPageObject.entervalidEmail(validEmail);
    }

    @And("^I click on the CheckoutAsAGuest button$")
    public void clickOnCheckoutAsGuestButton() throws InterruptedException {
        guestCheckoutPageObject.clickOnCheckAsAGuestButton();
    }



}
