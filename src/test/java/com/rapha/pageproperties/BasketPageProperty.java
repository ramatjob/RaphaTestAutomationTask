package com.rapha.pageproperties;


public interface BasketPageProperty {
    String CheckOutButton = "//a[@class='btn btn-primary btn-block btn--continue-checkout continue-checkout basket-submit']";
    String ProductName = "(//a[@class='item-title__link']/span)[2]";
    String ProductColourAndSize = "(//div[@class='list-item-detail--added']/p)[1]";
    String ProductPrice = "(//div[@class='list-item-detail--added']/p)[2]";

}
