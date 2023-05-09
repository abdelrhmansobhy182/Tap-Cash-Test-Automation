package StepDefinitions;

import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefinitions.Steps.webDriver;

public class Login_Steps {

    Login_Page Login = new Login_Page(webDriver);

    @When("Click on Login button")
    public void clickOnLoginButton() {
        Login.getLogin().click();

    }


    @And("Enter {string} and {string} and Click Login button")
    public void enterAndAndClickLoginButton(String arg0, String arg1) {
        Login.login(arg0,arg1);
    }

    @Then("Verify that Logged in successfully")
    public void verifyThatLoggedInSuccessfully() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-cash1.vercel.app/Home");

    }


    @Then("Verify message this national Id not exist")
    public void verifyMessageThisNationalIdNotExist() {
        Boolean Verify = Login.verifyNationalIdNotExist().isDisplayed();
        Assert.assertTrue(Verify);
    }

    @Then("Verify error message")
    public void verifyErrorMessage() {
        Boolean Verify = Login.verifyInvalidNationalIdError().isDisplayed();
        Assert.assertTrue(Verify);
    }

    @Then("Verify password error message")
    public void verifyPasswordErrorMessage() {
        Boolean Verify = Login.verifyInvalidPasswordError().isDisplayed();
        Assert.assertTrue(Verify);
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        Login.getRegisterButton().click();
    }

    @Then("Verify that navigate to register page successfully")
    public void verifyThatNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-cash1.vercel.app/register");

    }

    @And("Click on forget password button")
    public void clickOnForgetPasswordButton() {
        Login.getForgetPasswordButton().click();
    }

    @Then("Verify that navigate to forget password page successfully")
    public void verifyThatNavigateToForgetPasswordPageSuccessfully() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-cash1.vercel.app/getPass");

    }
}
