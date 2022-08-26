package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver){
        this.driver=driver;
    }
    public signinPage signinBtn(){
        driver.findElement(By.linkText("Sign In")).click();
        return new signinPage(driver);
    }
    public void addSearch(String name){
        driver.findElement(By.name("keyword")).sendKeys(name);
    }
    public void clickSearch(){
        driver.findElement(By.name("searchProducts")).click();
    }

    public String getResult(){
        return driver.findElement(By.xpath("//tr//td[3]")).getText();
    }

}
