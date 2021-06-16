package com.pmk.test.step_definitions.mobile;

import com.pmk.test.framework.helpers.utils.RandomGenerator;
import com.pmk.test.page_objects.mobile.MobileContactsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MobileSteps {

    private MobileContactsPage mobileContactsPage;

    public MobileSteps(MobileContactsPage mobileContactsPage) {
        this.mobileContactsPage = mobileContactsPage;
    }

    @Given("^i click on Add New Contacts Button$")
    public void i_click_on_Add_New_Contacts_Button() throws Throwable {
        mobileContactsPage.clickOnAddContact();
    }

    @When("^i add name email and click on Save$")
    public void i_add_name_email_and_click_on_Save() throws Throwable {
        Assert.assertTrue(mobileContactsPage.getContactFormFields().get(0).isEnabled());
        mobileContactsPage.getContactFormFields().get(0).sendKeys(RandomGenerator.randomAlphabetic(5));
        Assert.assertTrue(mobileContactsPage.getContactFormFields().get(2).isEnabled());
        mobileContactsPage.getContactFormFields().get(2).sendKeys(RandomGenerator.randomEmailAddress(8));
        mobileContactsPage.saveContact();
    }

    @Then("^i verify the error message \"(.*?)\"$")
    public void i_verify_the_error_message(String msg) throws Throwable {
        Assert.assertTrue(mobileContactsPage.verifyMessage().equalsIgnoreCase(msg));
    }

    @Then("^i click on ok button$")
    public void i_click_on_ok_button() throws Throwable {
        mobileContactsPage.clickOkButton();
    }
}
