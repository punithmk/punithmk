package com.pmk.test.step_definitions.gui;

import com.pmk.test.page_objects.gui.LandingPage;
import cucumber.api.java.en.Then;

public class LandingPageSteps {

    private LandingPage landPage;

    public LandingPageSteps(LandingPage landPage) {
        this.landPage = landPage;
    }


    @Then("^i cancle the promotion add$")
    public void i_click_on_the_cancel_button() throws Throwable {
        landPage.cancelPromotionbutton();
    }

    @Then("^i mouse hover on Men tab AND click on show all$")
    public void i_click_on_the_Mentab_and_showall() throws Throwable {
        landPage.selecttab();
    }

}
