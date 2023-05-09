package StepDefinitions;

import Pages.Pages;
import Pages.Register_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static StepDefinitions.Steps.webDriver;

public class Register_Steps {
    Register_Page Register = new Register_Page(webDriver);



    @When("Click on Sign in button")
    public void clickOnSignInButton() throws InterruptedException {
        Register.getSignUP().click();
        Thread.sleep(1000);
    }


    @And("Click on Parent button")
    public void clickOnParentButton() throws InterruptedException {
        Register.getParentButton().click();
        Thread.sleep(1000);
    }

    @And("Enter valid data for parent")
    public void enterValidDataForParent() throws InterruptedException {
        Register.SignUp("Abdelrahman" , "Sobhy","98765432198765","01234567891",
                "test123@gmail.com","Aa@12345","Aa@12345");

        Thread.sleep(6000);

    }

    @Then("Verify that ACCOUNT CREATED")
    public void verifyThatACCOUNTCREATED() throws InterruptedException {

        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-project-imzl.vercel.app/login");
        Thread.sleep(1000);

    }

    @And("Enter valid data and invalid email : {string}")
    public void enterValidDataAndInvalidEmail(String arg0) {
        Register.SignUp("Abdelrahman" , "Sobhy","12345678912345","01224542365",
                arg0,"Aa@12345","Aa@12345");
    }

    @Then("Verify error message for email")
    public void verifyErrorMessageForEmail() {
        Boolean Verify = Register.verifyErrorMessageForEmail().isDisplayed();
        Assert.assertTrue(Verify);

    }


    @And("Enter valid data and invalid ID : {string}")
    public void enterValidDataAndInvalidID(String arg0) {
        Register.SignUp("Abdelrahman" , "Sobhy",arg0,"01224542365",
                "abdosobhy18220@gmail.com","Aa@12345","Aa@12345");
    }

    @Then("Verify error message for ID")
    public void verifyErrorMessageForID() {
        Boolean Verify = Register.verifyErrorMessageForId().isDisplayed();
        Assert.assertTrue(Verify);
    }

    @And("Enter valid data and invalid {string} and {string}")
    public void enterValidDataAndInvalidAnd(String arg0, String arg1) {
        Register.SignUp(arg0 , arg1,"12345678912345","01224542365",
                arg0,"Aa@12345","Aa@12345");
    }

    @Then("Verify error message for Name")
    public void verifyErrorMessageForName() {
        Boolean Verify = Register.verifyErrorMessageForName().isDisplayed();
        Assert.assertTrue(Verify);
    }

    @And("Enter valid data and invalid mobile : {string}")
    public void enterValidDataAndInvalidMobile(String arg0) {
        Register.SignUp("Abdelrahman" , "Sobhy","12345678912345",arg0,
                "abdosobhy18220@gmail.com","Aa@12345","Aa@12345");
    }

    @Then("Verify error message for mobile")
    public void verifyErrorMessageForMobile() {
        Boolean Verify = Register.verifyErrorMessageForMobile().isDisplayed();
        Assert.assertTrue(Verify);
    }


    @And("Enter valid data and invalid password: {string} and {string}")
    public void enterValidDataAndInvalidPasswordAnd(String arg0, String arg1) {
        Register.SignUp("Abdelrahman" , "Sobhy","12345678912345","01224542365",
                "abdosobhy18220@gmail.com",arg0,arg1);
    }

    @Then("Verify error message for password")
    public void verifyErrorMessageForPassword() {
        Boolean Verify = Register.verifyErrorMessageForPassword().isDisplayed();
        Assert.assertTrue(Verify);
    }
    // for Child

    @And("Click on child button")
    public void clickOnChildButton() {
        Register.getChildButton().click();
    }

    @And("Enter valid data for child")
    public void enterValidDataForChild() {
        Register.getChildNationalID().sendKeys("12345678912346");
        Register.SignUp("Yahia" , "Abdelrahman","12345678912345","01224542355",
                "abdosobhy1822@gmail.com","Aa@12345","Aa@12345");


    }

    @And("Enter valid data for child and invalid parent id")
    public void enterValidDataForChildAndInvalidParentId() {
        Register.getChildNationalID().sendKeys("12345678912346");
        Register.SignUp("Yahia" , "Abdelrahman","54698752148561","01224542355",
                "abdosobhy1822@gmail.com","Aa@12345","Aa@12345");
    }

    @Then("Verify error message for parent id")
    public void verifyErrorMessageForParentId() {
        Boolean Verify = Register.verifyErrorMessageForParentID().isDisplayed();
        Assert.assertTrue(Verify);
    }


}
