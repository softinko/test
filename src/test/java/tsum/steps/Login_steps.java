package tsum.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tsum.pages.Header;
import tsum.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;


public class Login_steps extends ScenarioSteps {

    LoginPage logPage;
    Header header;

    @Step
    public void openPage () {
        logPage.open();
    }


    @Step
    public void submitLoginForm (String login,String pass) {
        logPage.loginInput.type(login);
        logPage.passInput.type(pass);
        logPage.loginButton.click();

    }

    @Step
    public void checkLoginSuccess (String firstName,String lastName) {
        assertThat(header.profileLink.getAttribute("innerText")).isEqualTo(firstName + " " + lastName);
    }

    @Step
    public void checkLoginError (String errorText) {
        assertThat(logPage.loginResultError.getAttribute("innerText")).isEqualTo(errorText);
    }


}
