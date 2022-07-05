package com.nttdata.screens;


import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    private WebElement btnClose;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement username;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement firstOption;

    @AndroidFindBy(xpath = "android.view.ViewGroup[@content-desc='test-LOGIN']")
    private WebElement logginButton;

    @AndroidFindBy(xpath = "android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement mensajeProductsOk;

    //


    public String getTitleInicial(){
        return firstOption.getText();
    }

    public void enterButtonLogin(){
        logginButton.click();

    }


    public void addtextUser(String texto){
        username.sendKeys(texto);
    }

    public void addtextPassword(String texto){
        password.sendKeys(texto);
    }


    public void clickFirstOption(){
        firstOption.click();
    }

    public void clickClose(){
       // getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //btnClose.click();
    }

    public String mensajeProductOk(){
        return mensajeProductsOk.getText();
    }

}
