package StepDefinitions;

import Pages.Register_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Steps {



    public static WebDriver webDriver = null;


    @Given("Navigate to Website")
    public void navigateToWebsite() throws InterruptedException {
        String ChromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromePath);
        webDriver= new ChromeDriver();
        webDriver.navigate().to("https://tap-project-imzl.vercel.app/Home");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Hooks.driver=webDriver;

    }


}
