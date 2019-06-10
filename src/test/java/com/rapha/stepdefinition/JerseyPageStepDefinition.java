package com.rapha.stepdefinition;

import com.rapha.pages.JerseyPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class JerseyPageStepDefinition {
    private WebDriver driver;
    private JerseyPage jerseyPageObject;
    private TestBase testBase;

    public JerseyPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the Jersey page$")
    public void verifyThePropertiesOnThePage() throws InterruptedException {
        driver = testBase.getDriver();
        jerseyPageObject = new JerseyPage(driver);
        jerseyPageObject.verifyThePropertiesOnThePage();
    }

    @Then("I verify that the Jersey page url is coming as \"([^\"]*)\"$")
    public void verifyTheJerseyPageUrl(String expectedJerseyPageUrl) throws InterruptedException {
        jerseyPageObject.verifyTheJerseyPageUrl(expectedJerseyPageUrl);
    }

    @And("^I select required \"([^\"]*)\" option from Gender drop down$")
    public void selectMensOptionFromGenderDropDown(String genderOption) throws InterruptedException {
        jerseyPageObject.selectMensFromGenderDropDown(genderOption);
    }

    @And("^I select required \"([^\"]*)\" option from Colour drop down$")
    public void selectBlackColourFromColourDropDown(String colourOption) throws InterruptedException {
        jerseyPageObject.selectBlackColourFromColourDropDown(colourOption);
    }

    @And("^I select the required \"([^\"]*)\" from the search results$")
    public void clickOnRequiredProduct(String expectedProduct) throws InterruptedException {
        jerseyPageObject.clickOnRequiredProduct(expectedProduct);
    }

}
