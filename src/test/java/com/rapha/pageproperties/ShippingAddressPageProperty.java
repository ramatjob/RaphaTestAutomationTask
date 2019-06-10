package com.rapha.pageproperties;


public interface ShippingAddressPageProperty {
    String TitleDropdown = "(//label[@for='title']/following-sibling::select)[1]";
    String FirstName = "(//h4[@class='t-h4']/following-sibling::input)[1]";
    String LastName = "(//h4[@class='t-h4']/following-sibling::input)[2]";
    String PhoneNumber = "(//h4[@class='t-h4']/following-sibling::input)[3]";
    String AddressLine1 = "(//h4[@class='t-h4']/following-sibling::input)[5]";
    String AddressLine2 = "(//h4[@class='t-h4']/following-sibling::input)[6]";
    String City = "(//h4[@class='t-h4']/following-sibling::input)[8]";
    String Postcode = "(//h4[@class='t-h4']/following-sibling::input)[9]";
    String ContinueToShippingButton = "(//div[@class='full-width']/child::button)[2]";
    String CountryDropdown = "(//select[@id='address.country'])[1]";

}
