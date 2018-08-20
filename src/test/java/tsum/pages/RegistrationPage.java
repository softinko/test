package tsum.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/registration")
public class RegistrationPage extends PageObject {

    @FindBy(name = "REGISTER[NAME]")
    public WebElementFacade name;

    @FindBy(css = "[for='reg-male']")
    private WebElementFacade men;

    @FindBy(css = "[for='reg-female']")
    private WebElementFacade woman;

    @FindBy(name = "REGISTER[PERSONAL_BIRTHDAY]")
    public WebElementFacade birthdate;

    @FindBy(name = "REGISTER[EMAIL]")
    public WebElementFacade email;

    @FindBy(name = "REGISTER[PERSONAL_PHONE]")
    public WebElementFacade phone;

    @FindBy(name = "REGISTER[PASSWORD]")
    public WebElementFacade password;

    @FindBy(css = "[for='reg-subscribe']")
    public WebElementFacade subscribe;

    @FindBy(css = ".popup__button [type]")
    public WebElementFacade submit;

    @FindBy(css = ".js-popup-container .js-field-custom-email.js-field .field__error")
    public WebElementFacade email_error;


    public void setGender (String Gender) {
        switch (Gender.toLowerCase()) {
            case "woman":
                woman.click();
                break;
            case "men":
                woman.click();
                break;
            default: throw new IllegalArgumentException("Vitaly Valentinovich Milonov worry, because your gender is " + Gender);


        }
    }


}


