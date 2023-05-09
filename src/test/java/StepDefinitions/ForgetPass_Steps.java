package StepDefinitions;

import Pages.ForgetPass_Page;
import Pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;

import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import static StepDefinitions.Steps.webDriver;

public class ForgetPass_Steps {


    ForgetPass_Page Forget = new ForgetPass_Page(webDriver);



    @And("Enter email : {string} and Click submit button")
    public void enterEmailAndClickSubmitButton(String arg0) {
        Forget.getEmail().sendKeys(arg0);
        Forget.getSubmitButton().click();

    }

    @And("Get the code from email and submit")
    public void getTheCodeFromEmailAndSubmit() {
        LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
        WebElement code = Forget.getOTPCode();
        Forget.getOTPField().sendKeys();
        Forget.getSubmitOTPButton();
    }

    @Then("should navigate to change password page")
    public void shouldNavigateToChangePasswordPage() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-cash1.vercel.app/restpass");

    }


    @And("Enter valid password : {string} and confirm password : {string}")
    public void enterValidPasswordAndConfirmPassword(String arg0, String arg1) {
        Forget.changePassword(arg0, arg1);
    }

    @Then("Verify that navigate to login page")
    public void verifyThatNavigateToLoginPage() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://tap-cash1.vercel.app/login");

    }
}
