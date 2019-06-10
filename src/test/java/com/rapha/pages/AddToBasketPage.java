package com.rapha.pages;


import com.rapha.pageproperties.AddToBasketPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToBasketPage extends CommonFunctions {

    By SizeDropdownLocator = By.xpath(AddToBasketPageProperty.SizeDropdown);
    By AddToBasketLocator = By.xpath(AddToBasketPageProperty.AddToBasket);
    By GotoBasketLocator = By.xpath(AddToBasketPageProperty.GotoBasket);


    private WebDriver driver;

    public AddToBasketPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnThePage(){
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(SizeDropdownLocator,"Size drop down "," On the Add to basket Page");
        isElementPresentOnWebPage(AddToBasketLocator,"Add to basket button "," On the Add to basket Page");
    }

    public void verifyTheAddToBasketPageUrl(String expectedAddToBasketPageUrl){
        String actualAddToBasketPageUrl = driver.getCurrentUrl();
        Assert.assertTrue(compareAnyText(actualAddToBasketPageUrl, expectedAddToBasketPageUrl));
    }

    public void selectSizeOptionFromSizeDropdown(String sizeOption){
        wait_implicit_till_window_load();
        selectAnyOptionFromDropdown(SizeDropdownLocator,sizeOption);
    }

    public void clickOnAddToBasketButton(){
        click(AddToBasketLocator);
    }

    public void clickOnGoToBasketButton(){
        click(GotoBasketLocator);
    }

}
