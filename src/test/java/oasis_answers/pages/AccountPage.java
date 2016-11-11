package oasis_answers.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://oasis.dev.clever-solution.com/login")
public class AccountPage extends PageObject {

    @FindBy(xpath = "//p[contains(text(),'Welcome to Your Account:')]")
    private WebElementFacade accountWelcomeTitle;

    public void wait_account_welcome(){
        waitFor(accountWelcomeTitle);

    }

    public String get_account_welcome_title_text(){
        return accountWelcomeTitle.getText();
    }

}

