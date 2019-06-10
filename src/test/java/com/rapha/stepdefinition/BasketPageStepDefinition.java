package com.rapha.stepdefinition;


import com.rapha.pages.BasketPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class BasketPageStepDefinition {
    private WebDriver driver;
    private BasketPage basketPageObject;
    private TestBase testBase;

    public BasketPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }



    @Then("^I verify the objects on the basket page$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        basketPageObject = new BasketPage(driver);
        basketPageObject.verifyThePageProperties();
    }

    @And("^I click on the Checkout button$")
    public void clickOnTheCheckoutButton() throws InterruptedException {
        basketPageObject.clickOnCheckoutButton();
    }

}
