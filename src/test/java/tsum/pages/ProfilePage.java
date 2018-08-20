package tsum.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/personal/profile/")
public class ProfilePage extends PageObject {

    @FindBy(name = "FIELDS[NAME]")
    public WebElementFacade name;

    @FindBy(name = "FIELDS[EMAIL]")
    public WebElementFacade email;

    @FindBy(name = "FIELDS[PERSONAL_PHONE]")
    public WebElementFacade phone;

    @FindBy(name = "FIELDS[PERSONAL_BIRTHDAY]")
    public WebElementFacade birthday;




}


