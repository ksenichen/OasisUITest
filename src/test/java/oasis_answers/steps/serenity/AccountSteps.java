package oasis_answers.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import oasis_answers.pages.AccountPage;
import oasis_answers.pages.LoginPage;
import org.junit.Assert;

public class AccountSteps extends ScenarioSteps {

    AccountPage accountPage;


    @Step
    public void verify_account_welcome_is_present(String fullName){
        accountPage.wait_account_welcome();
        Assert.assertTrue(accountPage.get_account_welcome_title_text().contains(fullName));
    }
}