package tsum.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/login/")

public class LoginPage extends PageObject {

    @FindBy(css = ".auth-layout .popup__input:nth-of-type(2) .js-field-input")
    public WebElementFacade loginInput;

    @FindBy(css = ".auth-layout .popup__input:nth-of-type(3) .js-field-input")
    public WebElementFacade passInput;

    @FindBy(css = ".auth-layout .button_width_80")
    public WebElementFacade loginButton;

    @FindBy(css = ".auth-layout .login__result")
    public WebElementFacade loginResultError;


}
