package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.homePage;

public class baseTest {
    public WebDriver driver;
    public homePage home;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new ChromeDriver();

        goHome();

        driver.manage().window().maximize();
        home = new homePage(driver);


    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

}
