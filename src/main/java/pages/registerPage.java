package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class registerPage {
    private WebDriver driver;
    public  registerPage(WebDriver driver){
        this.driver = driver;
    }
    public void addUser(String name){
        driver.findElement(By.name("username")).sendKeys(name);
    }

    public void addpassword(String pass){
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("repeatedPassword")).sendKeys(pass);
    }
    public void addFirstName(String name){
        driver.findElement(By.name("account.firstName")).sendKeys(name);
    }
    public void addLastname(String name){
        driver.findElement(By.name("account.lastName")).sendKeys(name);
    }
    public void addEmail(String mail){
        driver.findElement(By.name("account.email")).sendKeys(mail);
    }
    public void addPhone(String phone){
        driver.findElement(By.name("account.phone")).sendKeys(phone);
    }
    public void addAddress(String address){
        driver.findElement(By.name("account.address1")).sendKeys(address);
    }
    public void addCity(String city){
        driver.findElement(By.name("account.city")).sendKeys(city);
    }
    public void addState(String state){
        driver.findElement(By.name("account.state")).sendKeys(state);
    }
    public void addZip(String zip){
        driver.findElement(By.name("account.zip")).sendKeys(zip);
    }
    public void addCountry(String country){
        driver.findElement(By.name("account.country")).sendKeys(country);
    }

    public void selectFav(String value){
        Select obj = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
        obj.selectByValue(value.toUpperCase());
    }
    public void enableList(Boolean value){
        if (value==true){
        driver.findElement(By.name("account.listOption")).click();
    }
    }
    public void enableBanner(Boolean value){
        if (value==true){
            driver.findElement(By.name("account.bannerOption")).click();
        }

    }
    public void saveBtn(){
        driver.findElement(By.name("newAccount")).click();
    }

}
