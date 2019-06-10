  Feature: Test the signin functionality of Rapha Portal

    @TestCase1
    Scenario Outline: Test the signin functionality using the registered user in rapha portal
      Given I launch the Rapha Portal home page
      Then I verify the objects on the Ralph portal home page
      And I click on SignIn link under MyAccount icon
      Then I verify the objects on the SignIn page
      And I enter a valid user "<UserName>"
      And I enter a valid password "<Password>"
      And I click on SignIn button
      Then User should be signed in and application should return to the Home Page
      And I close the browser
      Examples:
      | UserName          | Password |
      | raphatest@test.cc | T3st2019 |


    @TestCase2
    Scenario Outline: Test the payment method functionality for any required product in rapha portal
      Given I launch the Rapha Portal home page
      Then I verify the objects on the Ralph portal home page
      And I navigate to Jerseys under Mens section
      Then I verify the objects on the Jersey page
      Then I verify that the Jersey page url is coming as "https://www.rapha.cc/gb/en/mens-products/jerseys/category/jerseys"
      And I select required "<Gender>" option from Gender drop down
      And I select required "<Colour>" option from Colour drop down
      And I select the required "<Product>" from the search results
      Then I verify the objects on the Add To Basket page
      Then I verify that the Add To Basket Page url is coming as "https://www.rapha.cc/gb/en/shop/classic-jersey-ii/product/CLJ04XXBLK"
      And I select the required "<Size>" from the Size drop down
      And I click on Add To Basket button
      And I click on the Go To Basket button
      Then I verify the objects on the basket page
      And I click on the Checkout button
      Then I verify the objects on the SignIn page
      And I click on the guest checkout button
      Then I verify the objects on the guest checkout page
      And I enter a valid "<Email>" into Email box
      And I click on the CheckoutAsAGuest button
      Then I verify the objects on the shipping address page
      And I enter all the mandatory details like "<Title>","<FirstName>","<LastName>","<PhoneNumber>","<AddressLine1>","<AddressLine2>","<Town>","<PostCode>","<Country>"
      And I click on the Continue To Shipping button
      Then I verify the objects on the Shipping Method page
      And I click on the Continue To Payment button
      Then I verify the objects on Payment Method page
      Then I compare the payment method page details against the details of the previous pages
      And I close the browser

      Examples:
        | Gender  | Colour   | Product           | Size   | Email              |  Title | FirstName | LastName  | PhoneNumber | AddressLine1  | AddressLine2  | Town    | PostCode  | Country         |
        | Mens    | Black    | Classic Jersey II | Medium | mymail@nomail.com  |  Mr    | david     | robert    | 1234567890  | 18 Port Line  | Borough Road  | London  | AB12CD    | United Kingdom  |
