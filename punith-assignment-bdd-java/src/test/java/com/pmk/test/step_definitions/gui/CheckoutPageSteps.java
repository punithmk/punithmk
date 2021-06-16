package com.pmk.test.step_definitions.gui;

import com.pmk.test.page_objects.gui.CheckoutPage;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPageSteps {

    private CheckoutPage checkoutpage;

    public CheckoutPageSteps(CheckoutPage checkoutpage) {
        this.checkoutpage = checkoutpage;
    }


    @Then("^i enter email id \"(.*?)\" in guest email field$")
    public void i_enter_email_in_guest_email_field(String email) throws Throwable {
        checkoutpage.enterEmailidInGuestEmaiField(email);
    }

    @Then("^i click on the continue as guest button$")
    public void i_click_on_the_continue_as_guest_button() throws Throwable {
        checkoutpage.clickContinueAsGuestButton();
    }
    @Then("^i verify the email field for entered value \"(.*?)\"$")
    public void i_verify_the_prepopulated_email_field_checkoutpage(String demail) throws Throwable {
        assertThat(checkoutpage.getDeafaultemailIdFromField().equalsIgnoreCase(demail));
    }
    @Then("^i enter mobile number \"(.*?)\" in mobile field$")
    public void i_enter_mobile_number_in_field(String mnumber) throws Throwable {
        checkoutpage.enterMobileNumberInField(mnumber);
    }
    @Then("^i select title \"(.*?)\" from title dropdown field$")
    public void i_select_title_from_title_dropdown(String title) throws Throwable {
        checkoutpage.selectTitlefromDropdown(title);
    }
    @Then("^i enter firstname \"(.*?)\" in firstname field$")
    public void i_enter_first_name_in_field(String fname) throws Throwable {
        checkoutpage.enterfirstNameInField(fname);
    }
    @Then("^i enter lastname \"(.*?)\" in lastname field$")
    public void i_enter_last_name_in_field(String lname) throws Throwable {
        checkoutpage.enterlastNameInField(lname);
    }
    @Then("^i enter address1 \"(.*?)\" in address1 field$")
    public void i_enter_address1_in_field(String add1) throws Throwable {
        checkoutpage.enterShippingAddOneInField(add1);
    }
    @Then("^i enter address2 \"(.*?)\" in address2 field$")
    public void i_enter_address2_in_field(String add2) throws Throwable {
        checkoutpage.enterShippingAddTwoInField(add2);
    }
    @Then("^i select region \"(.*?)\" from region dropdown field$")
    public void i_select_region_from_region_dropdown(String reg) throws Throwable {
        checkoutpage.selectregionInField(reg);
    }
    @Then("^i select area \"(.*?)\" from area dropdown field$")
    public void i_select_area_from_area_dropdown(String shparea) throws Throwable {
        checkoutpage.selectShippingAreaInField(shparea);
    }
    @Then("i enter postalcode \"(.*?)\" in postalcode field$")
    public void i_enter_postalcode_in_field(String postcode) throws Throwable {
        checkoutpage.enterPostalcodeInField(postcode);
    }
}
