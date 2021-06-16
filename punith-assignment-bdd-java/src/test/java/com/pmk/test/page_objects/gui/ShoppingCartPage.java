package com.pmk.test.page_objects.gui;

import com.pmk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class ShoppingCartPage extends PageObject {


    private By itemInyourBagText = By.xpath("//span[contains(text(),'Item in your bag')]");
    private By checkoiutSecurelyButton = By.xpath("//a[contains(text(),'Checkout securely')]");



    public String getItemInyourBagText() {
        return waitForExpectedElement(itemInyourBagText).getText();
    }
    public void clickOnSecurelyButton() {
        WebElement webElement = waitForExpectedElement(checkoiutSecurelyButton);
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("arguments[0].click()", webElement);
    }
}
