package com.rapha.stepdefinition;

import com.rapha.pages.AddToBasketPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class AddToBasketPageStepDefinition {
    private WebDriver driver;
    private AddToBasketPage addToBasketPageObject;
    private TestBase testBase;

    public AddToBasketPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the Add To Basket page$")
    public void verifyThePropertiesOnThePage() throws InterruptedException {
        driver = testBase.getDriver();
        addToBasketPageObject = new AddToBasketPage(driver);
        addToBasketPageObject.verifyThePropertiesOnThePage();
    }

    @Then("^I verify that the Add To Basket Page url is coming as \"([^\"]*)\"$")
    public void verifyTheAddToBasketPageUrl(String expectedAddToBasketPageUrl) throws InterruptedException {
        addToBasketPageObject.verifyTheAddToBasketPageUrl(expectedAddToBasketPageUrl);
    }

    @And("^I select the required \"([^\"]*)\" from the Size drop down$")
    public void selectSizeFromSizeDropdown(String sizeOption) throws InterruptedException {
        addToBasketPageObject.selectSizeOptionFromSizeDropdown(sizeOption);
    }

    @And("^I click on Add To Basket button$")
    public void clickOnAddToBasketButton() throws InterruptedException {
        addToBasketPageObject.clickOnAddToBasketButton();
    }

    @And("^I click on the Go To Basket button$")
    public void clickOnGoToBasketButton() throws InterruptedException {
        addToBasketPageObject.clickOnGoToBasketButton();
    }

}
