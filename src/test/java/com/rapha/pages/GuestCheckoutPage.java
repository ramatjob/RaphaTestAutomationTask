package com.rapha.pages;


import com.rapha.pageproperties.GuestCheckoutPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuestCheckoutPage extends CommonFunctions {
    By EmailBoxLocator = By.xpath(GuestCheckoutPageProperty.EmailBox);
    By CheckAsAGuestButtonLocator = By.xpath(GuestCheckoutPageProperty.CheckAsAGuestButton);



    private WebDriver driver;

    public GuestCheckoutPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnPage(){
        isElementPresentOnWebPage(EmailBoxLocator,"Email text box ","On guest checkout page");
        isElementPresentOnWebPage(CheckAsAGuestButtonLocator,"Checkout Aa A Guest button ","On guest checkout page");
    }

    public void entervalidEmail(String validEmail){
        enterText(EmailBoxLocator,validEmail);
    }

    public void clickOnCheckAsAGuestButton(){
        click(CheckAsAGuestButtonLocator);
    }
}
