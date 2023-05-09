package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getLogin()
    {
        return driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/button[2]"));

    }

    private WebElement getID()
    {
        return driver.findElement(By.id("ssid"));

    }
    private WebElement getPassword()
    {
        return driver.findElement(By.id("password"));

    }
    private WebElement getLoginButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/button"));

    }
    public WebElement getForgetPasswordButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/a"));

    }
    public WebElement getRegisterButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[2]/a"));

    }

    public void login(String Mobile , String Password)
    {
        getID().sendKeys(Mobile);
        getPassword().sendKeys(Password);
        getLoginButton().click();
    }


    public WebElement verifyNationalIdNotExist()
    {
        return  driver.findElement(By.xpath(""));

    }
    public WebElement verifyInvalidNationalIdError()
    {
        return  driver.findElement(By.xpath(""));

    }
    public WebElement verifyInvalidPasswordError()
    {
        return  driver.findElement(By.xpath(""));

    }



}
