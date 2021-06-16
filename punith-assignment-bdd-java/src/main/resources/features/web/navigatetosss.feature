@guicart
Feature: Add Item to cart:- As a Guest I would like to add ITEM to cart: -


  Scenario: Negative combinations for user login scenarios
    Given i navigate to the website "SSS" page
    Then  i cancle the promotion add
    Then  i mouse hover on Men tab AND click on show all
    Then  i select the product from PLP
    Then  i click on the selctsize option
    Then  i select the size "EU 44" from list
    When  i click on the add to bag button
    Then  i verify the product added to cart or not with text "tem in your bag"
    Then  i click on checkout securely button


  Scenario: Enter deatils in checkout page
    When i enter email id "abcd@gmail.com" in guest email field
    Then i click on the continue as guest button
    Then i verify the email field for entered value "abcd@gmail.com"
    Then i enter mobile number "503855039" in mobile field
    Then i select title "mr" from title dropdown field
    Then i enter firstname "testp" in firstname field
    Then i enter lastname "hello" in lastname field
    Then i enter address1 "testp hello near by" in address1 field
    Then i enter address2 "testp hello near by" in address2 field
    Then i select region "Dubai" from region dropdown field
    Then i select area "Bur Dubai" from area dropdown field
    Then i enter postalcode "123456" in postalcode field



