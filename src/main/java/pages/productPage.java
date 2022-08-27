package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
    private WebDriver driver;
    public productPage(WebDriver driver){
        this.driver = driver;
    }
    public shoppingCartPage addToCart(){
        driver.findElement(By.cssSelector("a.Button")).click();
        return new shoppingCartPage(driver);
    }
    public String getID(){
        return driver.findElements(By.cssSelector("tbody tr td")).get(1).getText();
    }
}
