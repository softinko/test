import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tsum.steps.Registration_steps;


import java.util.Random;
import java.util.stream.Collectors;


@RunWith(SerenityRunner.class)
public class Registration {

    @Managed
    private WebDriver browser;

    @Steps
    Registration_steps user;

    @Test
    public void incorrectEmailReg() {

        user.open_reg_page();
        user.input_reg_form("test","men","09/11/2001","test@test.com","11111111111","111222");
        user.check_email_error("Такой email уже существует");

    }

    @Test
    public void successReg () {

        // Заглушка, из-за невозможности подтереть пользователя в базе
        int length = 8;
        String chars = "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        String str = new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());



        user.open_reg_page();
        user.input_reg_form("test","woman","9112001",str+"@test.com","22222222222","2221111");
        user.check_reg_success("Мои данные","test","09.11.2001",str+"@test.com","22222222222");

    }

}