package com.pmk.test.page_objects.gui;

import com.pmk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class CheckoutPage extends PageObject {

    private By guestEmailIdField = By.xpath("//input[@id='guest-email']");
    private By continueAsGuestButton = By.xpath("//button[contains(text(),'Continue As Guest')]");
    private By mobileNumberField = By.id("shippingPhoneNumberdefault");
    private By selectTitleDropdown = By.id("shippingSalutationdefault");
    private By firstNameField = By.id("shippingFirstNamedefault");
    private By lastNameField = By.id("shippingLastNamedefault");
    private By shippingAddressOneField = By.id("shippingAddressOnedefault");
    private By shippingAddressOTwoField = By.id("shippingAddressTwodefault");
    private By regionField = By.id("shippingCitydefault");
    private By shippingArea = By.id("shippingAreadefault");
    private By postalCodeField = By.id("shippingZipCodedefault");
    private By shippingemailidDefault = By.id("shippingEmaildefault");




    public void enterEmailidInGuestEmaiField(String email) {
        waitForExpectedElement(guestEmailIdField).sendKeys(email);

    }
    public void clickContinueAsGuestButton() {
        waitForExpectedElement(continueAsGuestButton).click();

    }
    public void enterMobileNumberInField(String mnumber) {
        waitForExpectedElement(mobileNumberField).sendKeys(mnumber);
    }
    public String getDeafaultemailIdFromField() {
        return waitForExpectedElement(shippingemailidDefault).getText();
    }
    public void selectTitlefromDropdown(String option) {
        Select sel = new Select(waitForExpectedElement(selectTitleDropdown));
        sel.selectByValue(option);
    }
    public void enterfirstNameInField(String fname) {
        waitForExpectedElement(firstNameField).sendKeys(fname);
    }
    public void enterlastNameInField(String lname) {
        waitForExpectedElement(lastNameField).sendKeys(lname);
    }
    public void enterShippingAddOneInField(String add1) {
        waitForExpectedElement(shippingAddressOneField).sendKeys(add1);
    }
    public void enterShippingAddTwoInField(String add2) {
        waitForExpectedElement(shippingAddressOTwoField).sendKeys(add2);
    }
    public void selectregionInField(String region) {
        Select sel = new Select(waitForExpectedElement(regionField));
        sel.selectByValue(region);
    }
    public void selectShippingAreaInField(String shparea) {
        Select sel = new Select(waitForExpectedElement(shippingArea));
        sel.selectByValue(shparea);
    }
    public void enterPostalcodeInField(String postalcode) {
        waitForExpectedElement(postalCodeField).sendKeys(postalcode);
    }
}
