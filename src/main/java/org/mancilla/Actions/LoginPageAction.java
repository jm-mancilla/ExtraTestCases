package org.mancilla.Actions;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

@DefaultUrl("https://automationexercise.com")
public class LoginPageAction extends UIInteractions {

@Step("Given the user access to AutomationExercises page")
    public void openPage(){
        this.open();
    }
}
