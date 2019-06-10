package com.rapha.pages;

import com.rapha.pageproperties.SignInPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends CommonFunctions {
    By UserNameBoxLocator = By.xpath(SignInPageProperty.UserNameBox);
    By PasswordBoxLocator = By.xpath(SignInPageProperty.PasswordBox);
    By SignInButtonLocator = By.xpath(SignInPageProperty.SignInButton);
    By GuestCheckOutButtonLocator = By.xpath(SignInPageProperty.GuestCheckOutButton);

    private WebDriver driver;

    public SignInPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePageProperties() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(UserNameBoxLocator,"User Name Box ","On SignIn screen");
        isElementPresentOnWebPage(PasswordBoxLocator,"Password Box ","On SignIn screen");
        isElementPresentOnWebPage(SignInButtonLocator,"SignIn Button ","On SignIn screen");

    }

    public void enterValidUserName(String validUserName) throws InterruptedException {
        enterText(UserNameBoxLocator,validUserName);
    }

    public void enterValidPassword(String validPassword) throws InterruptedException {
        enterText(PasswordBoxLocator,validPassword);
    }

    public void clickOnSignInButton() throws InterruptedException {
        click(SignInButtonLocator);
    }

    public void clickOnGuestCheckoutButton(){
        click(GuestCheckOutButtonLocator);
    }

}
