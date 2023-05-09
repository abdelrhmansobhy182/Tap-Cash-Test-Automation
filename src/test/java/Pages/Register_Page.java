package Pages;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register_Page {
    WebDriver driver;

    public Register_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement getSignUP()
    {
        return driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/a[1]"));

    }
    public WebElement getParentButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-choose-type/div/div[2]/div[2]/div[1]/div/img"));

    }
    public WebElement getChildButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-choose-type/div/div[2]/div[2]/div[2]/div/img"));

    }



    private WebElement getFirstName()
    {
        return driver.findElement(By.id("name"));

    }
    private WebElement getLastName()
    {
        return driver.findElement(By.xpath(""));

    }
    private WebElement getNationalID()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/div[2]/input"));

    }
    public WebElement getChildNationalID()
    {
        return driver.findElement(By.xpath(""));

    }
    private WebElement getMobile()
    {
        return driver.findElement(By.id("phone"));

    }
    private WebElement getEmail()
    {
        return driver.findElement(By.id("email"));

    }
    private WebElement getPassword()
    {
        return driver.findElement(By.id("password"));

    }
    private WebElement getRePassword()
    {
        return driver.findElement(By.id("confirmPassword"));

    }




    private WebElement getSignUpButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/button"));

    }
    public void SignUp(String FirstName , String LastName , String Id , String Mobile , String Email, String Password, String RePassword )
    {
        getFirstName().sendKeys(FirstName);
        //getLastName().sendKeys(LastName);
        getNationalID().sendKeys(Id);
        getMobile().sendKeys(Mobile);
        getEmail().sendKeys(Email);
        getPassword().sendKeys(Password);
        getRePassword().sendKeys(RePassword);
        getSignUpButton().click();
    }



    public WebElement verifyErrorMessageForEmail()
    {
        return  driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/div[2]/p"));

    }

    public WebElement verifyErrorMessageForId()
    {
        return  driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/div[3]/div/p"));

    }
    public WebElement verifyErrorMessageForName()
    {
        return  driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/div[1]/div/div/p"));

    }
    public WebElement verifyErrorMessageForPassword()
    {
        return  driver.findElement(By.xpath(""));

    }
    public WebElement verifyErrorMessageForMobile()
    {
        return  driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/div[2]/form/div[2]/p"));

    }
    public WebElement verifyErrorMessageForParentID()
    {
        return  driver.findElement(By.xpath(""));

    }






}
