package tsum.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tsum.steps.Login_steps;

@RunWith(SerenityRunner.class)
public class Login {
    @Managed
    private WebDriver browser;

    @Steps
    Login_steps user;

    @Test
    public void loginSuccess () {
        user.openPage();
        user.submitLoginForm("9112001@test.com","111111");
        user.checkLoginSuccess("test","Tsum");
    }

    @Test
    public void IncorrectPassword () {
        user.openPage();
        user.submitLoginForm("9112001@test.com","222222");
        user.checkLoginError("Неверный логин или пароль");
    }

}
