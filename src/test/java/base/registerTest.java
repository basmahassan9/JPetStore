package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.registerPage;
import pages.signinPage;

public class registerTest extends baseTest{
    @Test
    public void regTest() throws InterruptedException {
        signinPage siginin =home.signinBtn();
        registerPage page= siginin.regBtn();
        page.addUser("basma");
        page.addpassword("12345");
        page.addFirstName("basma");
        page.addLastname("hassan");
        page.addEmail("example@gmail.com");
        page.addPhone("123456");
        page.addAddress("cairo 123");
        page.addCity("cairo");
        page.addState("texas");
        page.addZip("11345");
        page.addCountry("egypt");
        page.selectFav("cats");
        page.enableBanner(true);
        page.enableList(true);
        Thread.sleep(2000);
        page.saveBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://petstore.octoperf.com/actions/Catalog.action","wrong url");
    }

}
