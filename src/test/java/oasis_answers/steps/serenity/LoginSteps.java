package oasis_answers.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import oasis_answers.pages.AccountPage;
import oasis_answers.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;


    @Step
    public void input_login (String login) {
        loginPage.enter_login(login);
    }

    @Step
    public void input_password (String password) {
        loginPage.enter_password(password);
    }

    @Step
    public void press_login(){
        loginPage.click_login();
    }

    @Step
    public void open_login_page() {
        loginPage.open();
    }

}