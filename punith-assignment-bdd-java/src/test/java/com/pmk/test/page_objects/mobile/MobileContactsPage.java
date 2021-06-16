package com.pmk.test.page_objects.mobile;

import com.pmk.test.framework.AndroidObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class MobileContactsPage extends AndroidObject {

    private By addContactButton = By.xpath("//android.widget.Button[@content-desc='Add Contact']");
    private String contactFormFields = ("android.widget.EditText");
    private By saveButton = By.id("com.example.android.contactmanager:id/contactSaveButton");
    private By okButton = By.id("android:id/button1");
    private By errorMessage = By.id("android:id/message");


    public void clickOnAddContact() {
        getAndroidDriver().findElement(addContactButton).click();
    }

    public List<AndroidElement> getContactFormFields() {
        return getAndroidDriver().findElementsByClassName(contactFormFields);
    }

    public void saveContact() {
        getAndroidDriver().findElement(saveButton).click();
    }
    public String verifyMessage() {
       return getAndroidDriver().findElement(errorMessage).getText();
    }
    public void clickOkButton() {
        getAndroidDriver().findElement(okButton).click();
    }
}
