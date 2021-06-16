package com.pmk.test.step_definitions.gui;

import com.pmk.test.page_objects.gui.ShoppingCartPage;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartPageSteps {

    private ShoppingCartPage shoppingcartpage;

    public ShoppingCartPageSteps(ShoppingCartPage shoppingcartpage) {
        this.shoppingcartpage = shoppingcartpage;
    }


    @Then("^i verify the product added to cart or not with text \"(.*?)\"$")
    public void i_verify_the_product_added_to_cart(String text) throws Throwable {
        System.out.println(shoppingcartpage.getItemInyourBagText());
        assertThat(shoppingcartpage.getItemInyourBagText().equalsIgnoreCase(text));
    }

    @Then("^i click on checkout securely button$")
    public void i_click_on_securely_checkout_button_on_cart_page() throws Throwable {
        shoppingcartpage.clickOnSecurelyButton();


    }

}
