package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartPage {
    private WebDriver driver;
    public shoppingCartPage(WebDriver driver){
        this.driver = driver;
    }
    public String getID(){
        return driver.findElements(By.cssSelector("tbody tr td")).get(1).getText();
    }
}
