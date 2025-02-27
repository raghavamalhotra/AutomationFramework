package StepDefinition;

import Page.CreateAccountPage;
import Page.LogOut;
import Page.NavigateToUrl;
import Page.SignIn;
import TestData.AccountDetails;
import TestDataBuilder.AccountDetailsBuilder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterAndLoginStepDef {

    NavigateToUrl navigateToUrl = new NavigateToUrl();
    AccountDetails accountDetails;
    AccountDetailsBuilder accountDetailsBuilder = new AccountDetailsBuilder();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    LogOut logOut = new LogOut();
    SignIn signIn = new SignIn();

    @Given("User navigates to Application")
    public void userNavigatesToApplication() {
        //Navigate To Software Testing Board App URL
        navigateToUrl.NavigateToSoftwareTestingBoard();
    }

    @When("User creates a new account")
    public void CreateAccount() throws InterruptedException {

        //Create test data for NewAccount
        accountDetails = accountDetailsBuilder.WithAccountDetails();

        //Create Account
        createAccountPage.CreateAccount(accountDetails);

        //Log out from created user
        logOut.LogOutFromSoftwareTestingBoard();

    }

    @Then("User logs in with new account")
    public void userLogsInWithNewAccount()
    {
        //Login with created user credentials
        signIn.SignInToSoftwareTestingBoard(accountDetails);
    }
}
