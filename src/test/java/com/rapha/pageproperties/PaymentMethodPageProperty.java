package com.rapha.pageproperties;


public interface PaymentMethodPageProperty {

    String PaymentMethod = "(//main[@class='checkout checkout-summary']//child::h3)[3]";

    String ShippingAddress = "(//main[@class='checkout checkout-summary']//child::p)[1]";
    String ShippingMethod = "(//main[@class='checkout checkout-summary']//child::p)[2]";
    String ProductName = "(//h4[@class='checkout-summary__basket-item-title']/a)";
    String ProductColourAndSize = "(//h4[@class='checkout-summary__basket-item-title']/following-sibling::p)[1]";
    String ProductPrice = "(//h4[@class='checkout-summary__basket-item-title']/following-sibling::p)[2]";


}
