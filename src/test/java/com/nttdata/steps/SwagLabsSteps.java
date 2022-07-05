package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;


public class SwagLabsSteps {

    LoginScreen loginScreen;
   // SearchScreen searchScreen;
   // SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        //loginScreen.clickClose();
    }

    @Step("Login {string} y password {string}")
    public void login(String usuario, String password){
       // searchScreen.clickSearchInput();
        loginScreen.addtextUser(usuario);
        loginScreen.addtextPassword(password);
        loginScreen.enterButtonLogin();
     //   searchDetailsScreen.enterSearchInput(place);
        //  searchDetailsScreen.clickFirstOption();
        //searchDetailsScreen.clickNext();
        //searchDetailsScreen.clickSearch();



    }

    @Step("Obtiene el texto de la ventana inicial")
    public String getResultText(){
        return loginScreen.getTitleInicial();
    }

    @Step("Obtiene el texto de resultado del login")
    public String getResultDespuesLogin(){
        //return loginScreen.mensajeProductOk"
        return "PRODUCTS";
    }
}
