package com.herokuapp.pages;

import com.aventstack.extentreports.Status;
import com.herokuapp.customlisteners.CustomListeners;
import com.herokuapp.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup

    @FindBy(id = "username")
    WebElement enterUsername;
@CacheLookup
    @FindBy(id = "password")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@class='radius']")
    WebElement clickLogin;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'flash error']")
    WebElement passwordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id = 'flash']")
    WebElement usernameInvalidMessage ;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Secure Area']")
    WebElement secureAreaText;

    public void usernameField(String email) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);
        sendTextToElement(enterUsername,email);
    }

    public void passwordField(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);
        sendTextToElement(enterPassword, password);
    }

    public void clickLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
        clickOnElement(clickLogin);
    }

    public String passwordError() {
        CustomListeners.test.log(Status.PASS,"passwordError");
        return getTextFromElement(passwordErrorMessage);
    }
    public String usernameError() {
        CustomListeners.test.log(Status.PASS,"usernameError");
        return getTextFromElement(usernameInvalidMessage);
    }


    public String getSecureAreaMessage(){
        CustomListeners.test.log(Status.PASS,"getSecureAreaMessage");
        return getTextFromElement(secureAreaText);

    }


}
