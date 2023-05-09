package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass_Page {

    WebDriver driver;

    public ForgetPass_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getEmail()
    {
        return driver.findElement(By.id("email"));

    }
    public WebElement getSubmitButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-forgrt-password/div/div/div[1]/form/button"));

    }

    public WebElement getOTPField()
    {
        return driver.findElement(By.xpath("//*[@id=\"c_rjwst2d2xgolhaji4yc\"]"));

    }
    public WebElement getRequestAgainButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-check-otp/div/div/div[2]/div[3]/a/span/a"));

    }
    public WebElement getSubmitOTPButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-check-otp/div/div/div[2]/button/span"));

    }
    public WebElement getOTPCode()
    {
        return driver.findElement(By.xpath(""));

    }

    private WebElement getPasswordField()
    {
        return driver.findElement(By.id("newPassword"));

    }

    private WebElement getConfirmPasswordField()
    {
        return driver.findElement(By.xpath("//*[@id=\"passwordRestVerified  \"]"));

    }
    private WebElement getSubmitPassword()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-rest-pass/div/div/div[1]/form/button"));

    }

    public void changePassword(String Pass, String ConfirmPass)
    {
        getPasswordField().sendKeys(Pass);
        getConfirmPasswordField().sendKeys(ConfirmPass);
        getSubmitPassword().click();
    }



}
