package com.rapha.pageproperties;


public interface HomePageProperty {
    String MyAccountIcon = "//a[@class='account-icon']";
    String SignInLink = "//div[@class='icons']//div[2]//ul[@class='account__sub-menu t-body']/li[1]";
    String ShopMenuOption = "(//li[@class='primary__item']/child::a/child::span)[1]";
    String MensMenuOption = "(//li[@class='secondary__item']/child::a/child::span)[1]";
    String JersyMenuOption = "(//ol[@class='tertiary']/child::li/child::a)[8]";
}
