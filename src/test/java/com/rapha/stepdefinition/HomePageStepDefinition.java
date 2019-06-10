package com.rapha.stepdefinition;

import com.rapha.pages.HomePage;
import com.rapha.pages.SignInPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefinition {
    private WebDriver driver;
    private TestBase testBase;
    private String url;
    private HomePage homePageObject;

    public HomePageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Given("^I launch the Rapha Portal home page$")
    public void luanchRaphaPortalHomePage() {
        driver = testBase.initializeDriver();
        url = testBase.getUrl("RaphaPortal");
        testBase.launchUrl(url);
        homePageObject = new HomePage(driver);
    }

    @And("^I verify the objects on the Ralph portal home page$")
    public void verifyTheObjects() throws InterruptedException {
        homePageObject.verifyTheObjects();
    }

    @And("^I click on SignIn link under MyAccount icon$")
    public void clickOnSignInLink() throws InterruptedException {
        homePageObject.clickOnSignInLink();
    }

    @Then("^User should be signed in and application should return to the Home Page$")
    public void verifyThatApplicationReturnToHomePage() throws InterruptedException {
        homePageObject.verifyTheObjects();
    }

    @And("^I navigate to Jerseys under Mens section$")
    public void navigateToJerseyUnderMensSection() throws InterruptedException {
        homePageObject.navigateToJerseyUnderMensSection();
    }


    @And("^I close the browser$")
    public void closeBrowser(){
        testBase.tearDown();
    }

}
