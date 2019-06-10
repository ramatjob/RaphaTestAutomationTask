package com.rapha.pages;


import com.rapha.pageproperties.JerseyPageProperty;
import com.rapha.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class JerseyPage extends CommonFunctions {

    By GenderDropDownLocator = By.xpath(JerseyPageProperty.GenderDropDown);
    By ColourDropDownLocator = By.xpath(JerseyPageProperty.ColourDropDown);
    By JerseyNameLocator = By.xpath(JerseyPageProperty.JerseyName);


    private WebDriver driver;

    public JerseyPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyThePropertiesOnThePage(){
        wait_implicit_till_window_load();
        isElementPresentOnWebPage(GenderDropDownLocator,"Gender drop down "," On the Jersey Page");
        isElementPresentOnWebPage(ColourDropDownLocator,"Colour drop down "," On the Jersey Page");

    }

    public void verifyTheJerseyPageUrl(String expectedJerseyPageUrl){
        String actualJerseyPageUrl = driver.getCurrentUrl();
        Assert.assertTrue(compareAnyText(actualJerseyPageUrl, expectedJerseyPageUrl));
    }

    public void selectMensFromGenderDropDown(String genderOption) throws InterruptedException {
        String genderOptionFirstXPath = "(//input[@id='";
        String genderOptionSecondXPath = "']/following-sibling::label)[1]";
        String genderOptionFinalXpath = genderOptionFirstXPath+genderOption+genderOptionSecondXPath;
        click(GenderDropDownLocator);
        click(genderOptionFinalXpath);
        Thread.sleep(3000);
    }

    public void selectBlackColourFromColourDropDown(String colourOption) throws InterruptedException {
        String colourOptionFirstXpath = "(//input[@id='";
        String colourOptionSecondXpath = "']/following-sibling::label)[1]";
        String colourOptionFinalXpath = colourOptionFirstXpath+colourOption+colourOptionSecondXpath;
        click(ColourDropDownLocator);
        click(colourOptionFinalXpath);
    }

    public void clickOnRequiredProduct(String expectedProduct) throws InterruptedException {
        Thread.sleep(5000);
        clickOnTheRequiredProductFromAnyGivenList(JerseyNameLocator,expectedProduct);
    }

}
