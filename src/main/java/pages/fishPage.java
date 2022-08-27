package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fishPage extends homePage{
    private WebDriver driver;
    public fishPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public String getTitle(){
        return driver.findElement(By.cssSelector("div#Catalog h2")).getText();
    }
    public productPage chooseFish(int index){
        driver.findElements(By.cssSelector("tbody tr td a")).get(index).click();
        return new productPage(driver);
    }

}
