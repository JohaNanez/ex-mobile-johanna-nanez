package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc='test-Username']")
    private WebElement username;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc='test-Password']")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement firstOption;

    @AndroidFindBy(id = "android.view.ViewGroup[@content-desc='test-LOGIN']")
    private WebElement logginButton;



    public String getTitleInicial(){
        return firstOption.getText();
    }

    public void enterSearchInput(String place){
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


}
