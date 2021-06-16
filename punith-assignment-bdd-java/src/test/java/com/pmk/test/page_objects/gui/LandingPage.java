package com.pmk.test.page_objects.gui;

import com.pmk.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class LandingPage extends PageObject {

    private By menTab = By.xpath("//header/div[1]/nav[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/div[3]/div[1]/ul[1]/li[1]/a[1]");
    private By showAllMenTLink = By.xpath("//a[contains(text(),\"Shop All Men's\")]");
    private By cancelPromotionButton = By.xpath("//a[@id='NC_CLOSE_ICON']");


    private By passwordText = By.name("logonPassword");
    private By verifyPasswordText = By.name("logonPasswordVerify");

    private By titleList = By.name("personTitle");
    private By firstNameText = By.name("firstName");
    private By lastNameText = By.name("lastName");

    private By postCodeText = By.name("zipCode");
    private By address1Text = By.name("address1");
    private By townOrCityText = By.name("city");

    private By emailText = By.name("email1");
    private By confirmEmailText = By.name("email2");


    private By birthDay = By.name("birth_date");
    private By birthMonth = By.name("birth_month");
    private By birthYear = By.name("birth_year");

    private By termsAndConditionsCheckBox = By.name("termsAndCons");

    private By submitButton = By.id("WC_UserRegistrationAddForm_links_1");


    public WebElement passwordText() {
        return getWebDriver().findElement(passwordText);
    }

    public WebElement verifyPasswordText() {
        return getWebDriver().findElement(verifyPasswordText);
    }


    public Select selectTitle() {
        return new Select(waitForExpectedElement(titleList));
    }

    public WebElement firstNameText() {
        return getWebDriver().findElement(firstNameText);
    }

    public WebElement lastNameText() {
        return getWebDriver().findElement(lastNameText);
    }

    public WebElement postCodeText() {
        return getWebDriver().findElement(postCodeText);
    }

    public WebElement address1Text() {
        return getWebDriver().findElement(address1Text);
    }

    public WebElement townOrCityText() {
        return getWebDriver().findElement(townOrCityText);
    }


    public WebElement emailAddressText() {
        return getWebDriver().findElement(emailText);
    }

    public WebElement confirmEmailAddressText() {
        return getWebDriver().findElement(confirmEmailText);
    }


    public Select birthDayText() {
        return new Select(waitForExpectedElement(birthDay));
    }

    public Select birthMonthText() {
        return new Select(getWebDriver().findElement(birthMonth));
    }

    public Select birthYearText() {
        return new Select(getWebDriver().findElement(birthYear));
    }


    public void acceptTermsAndConditions(boolean yesOrNo) {
        WebElement termsAndConditionsWebElement = getWebDriver().findElement(termsAndConditionsCheckBox);
        boolean selected = termsAndConditionsWebElement.isSelected();
        if (yesOrNo && !selected) {
            termsAndConditionsWebElement.click();
        } else if (!yesOrNo && selected) {
            termsAndConditionsWebElement.click();
        }
    }

    public void submitRegistration() {
        waitForExpectedElement(submitButton).click();
    }
    public void selecttab() {
        Actions act = new Actions(webDriver);
        act.moveToElement(getWebDriver().findElement(menTab)).perform();
        elementToBeClickable(showAllMenTLink).click();
    }

    public void cancelPromotionbutton() {
        frameToBeAvailableAndSwitchToIt(By.name("preview-notification-frame"));
        elementToBeClickable(cancelPromotionButton).click();
        frameToBeAvailableAndSwitchToIt(By.xpath("//body/div[@id='__st_fancy_popup']/iframe[1]"));
        elementToBeClickable(By.xpath("//input[@id='__st_bpn_no']")).click();
    }
}
