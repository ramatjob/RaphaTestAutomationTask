package com.rapha.stepdefinition;


import com.rapha.pages.SignInPage;
import com.rapha.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SignInPageStepDefinition {
    private WebDriver driver;
    private SignInPage signInPageObject;
    private TestBase testBase;

    public SignInPageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Then("^I verify the objects on the SignIn page$")
    public void verifyThePageProperties() throws InterruptedException {
        driver = testBase.getDriver();
        signInPageObject = new SignInPage(driver);
        signInPageObject.verifyThePageProperties();
    }

    @And("^I enter a valid user \"([^\"]*)\"$")
    public void enterAValidUserName(String validUserName) throws InterruptedException {
        signInPageObject.enterValidUserName(validUserName);
    }

    @And("^I enter a valid password \"([^\"]*)\"$")
    public void enterAValidPassword(String validPassword) throws InterruptedException {
        signInPageObject.enterValidPassword(validPassword);
    }

    @And("^I click on SignIn button$")
    public void clickOnSignInButton() throws InterruptedException {
        signInPageObject.clickOnSignInButton();
    }

    @And("^I click on the guest checkout button$")
    public void clickOnTheGuestCheckoutButton() throws InterruptedException {
        signInPageObject.clickOnGuestCheckoutButton();
    }

}
