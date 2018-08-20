package tsum.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Header extends PageObject {
    @FindBy(xpath = "//a[@href='/personal/profile/' and @class='header__link']")
    public WebElementFacade profileLink;
}
