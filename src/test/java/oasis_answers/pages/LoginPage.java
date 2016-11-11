package oasis_answers.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

    @DefaultUrl("http://oasis.dev.clever-solution.com/login")
    public class LoginPage extends PageObject {

        @FindBy(css = "input.form-control[placeholder='Email']")
        private WebElementFacade loginInput;

        @FindBy(css = "input.form-control[placeholder='Password']")
        private WebElementFacade passwordInput;

        @FindBy(xpath = "//button[contains(text(),'Login')]")
        private WebElementFacade loginButton;

        public void enter_login(String login) {
            loginInput.type(login);
        }

        public void enter_password(String password) {
            passwordInput.type(password);
        }

        public void click_login() {
            loginButton.click();
        }


    }

