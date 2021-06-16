package com.pmk.test.step_definitions.gui;

import com.pmk.test.page_objects.gui.ShopAllMenPage;
import cucumber.api.java.en.Then;

public class ShopMenAllPageSteps {

    private ShopAllMenPage shopallmenpage;

    public ShopMenAllPageSteps(ShopAllMenPage shopallmenpage) {
        this.shopallmenpage = shopallmenpage;
    }


    @Then("^i select the product from PLP$")
    public void i_click_on_the_first_product() throws Throwable {
        shopallmenpage.clickOnproduct();
    }

    @Then("^i click on the selctsize option$")
    public void i_click_on_the_selectsize_combobox() throws Throwable {
        shopallmenpage.clickOnSizeButton();
    }
    @Then("^i select the size \"(.*?)\" from list$")
    public void i_select_the_size_from_list(String size) throws Throwable {
        shopallmenpage.selectSize(size);
    }
    @Then("^i click on the add to bag button$")
    public void i_click_on_the_addtobag_button() throws Throwable {
        shopallmenpage.clickOnAddToBagButton();
    }

}
