package tsum.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tsum.pages.ProfilePage;
import tsum.pages.RegistrationPage;


import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class Registration_steps extends ScenarioSteps {

    RegistrationPage regPage;
    ProfilePage proPage;

    @Step
    public void open_reg_page(){regPage.open();}

    @Step
    public void input_reg_form(String name, String gender, String birhdate, String email, String phone, String pass) {
        regPage.name.type(name);
        regPage.setGender(gender);
        regPage.birthdate.type(birhdate);
        regPage.email.type(email);
        regPage.phone.type(phone);
        regPage.password.type(pass);
        regPage.submit.click();
    }

    @Step
    public void check_email_error(String error_message) {
        regPage.email_error.shouldBeVisible();
        assertThat(regPage.email_error.getAttribute("innerText")).isEqualTo(error_message);
    }

    @Step
    public void check_reg_success(String title, String name, String birhdate, String email, String phone) {
        proPage.waitForTitleToAppear(title);
        assertThat(proPage.name.getAttribute("defaultValue")).isEqualTo(name);
        assertThat(proPage.birthday.getAttribute("defaultValue")).isEqualTo(birhdate);
        assertThat(proPage.email.getAttribute("defaultValue")).isEqualTo(email);
        assertThat(proPage.phone.getAttribute("defaultValue")).isEqualTo(phone);
    }


}
