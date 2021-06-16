package com.pmk.test.page_objects.gui;

import com.pmk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class ShopAllMenPage extends PageObject {

    private By firstProduct = By.xpath("(//*[@class=\"product\"])[1]");
    private By sizeButton = By.xpath("//span[@id='select2-vendorSize-shoesize-container']");
    private By agreeButton = By.xpath("//button[contains(text(),'I agree')]");
    private By selectSize = By.id("vendorSize-shoesize");
    private By addToBag = By.xpath("//button[contains(text(),\"Add to bag\")]");
    private By itemInyourBagText = By.xpath("//span[contains(text(),'Item in your bag')]");



    public void clickOnproduct() {
        waitForExpectedElement(firstProduct).click();

    }
    public void clickOnSizeButton() {
        waitForExpectedElement(agreeButton).click();
        waitForExpectedElement(sizeButton).click();

    }
    public void selectSize(String size) {
        Select sel = new Select(waitForExpectedElement(selectSize));
        sel.selectByVisibleText(size);
    }

    public void clickOnAddToBagButton() {
        waitForExpectedElement(addToBag).click();
    }

    public String get() {
        return waitForExpectedElement(itemInyourBagText).getText();
    }
}
