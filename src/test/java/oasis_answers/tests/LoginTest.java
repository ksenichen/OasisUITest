package oasis_answers.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import oasis_answers.pages.AccountPage;
import oasis_answers.steps.serenity.AccountSteps;
import oasis_answers.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    public static final String LOGIN = "test@test.com";
    public static final String PASSWORD = "12345";
    public static final String FULL_NAME = "ab ab";

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public AccountSteps accountSteps;

    @Test
    public void login() {
        loginSteps.open_login_page();
        loginSteps.input_login(LOGIN);
        loginSteps.input_password(PASSWORD);
        loginSteps.press_login();
        accountSteps.verify_account_welcome_is_present(FULL_NAME);
    }

} 