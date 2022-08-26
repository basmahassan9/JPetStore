package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signinPage {
    private WebDriver driver;
    public signinPage(WebDriver driver){
        this.driver=driver;
    }
    public registerPage regBtn(){
        driver.findElement(By.linkText("Register Now!")).click();
        return new registerPage(driver);
    }
    public void addUsername(String name){
        driver.findElement(By.name("username")).sendKeys(name);
    }
    public void addPassword(String pass){
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(pass);
    }
    public void loginBtn(){
        driver.findElement(By.name("signon")).click();
    }

    @FindBy(name = "My Account")
    public WebElement account;
}
