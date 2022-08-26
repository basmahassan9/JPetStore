package base;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.signinPage;

public class signinTest extends baseTest{
    @Test(dataProvider = "loginData")
    public void LoginTest(String username,String pass) throws InterruptedException {
        signinPage page=  home.signinBtn();
        page.addUsername(username);
        page.addPassword(pass);
        page.loginBtn();
        SoftAssert soft = new SoftAssert();

        //soft.assertTrue(page.account.isDisplayed(),"not signed in");
        soft.assertEquals(driver.getCurrentUrl(),"https://petstore.octoperf.com/actions/Catalog.action","wrong url");
        soft.assertAll();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginInfo(){
        return new Object[][]{{"basma","asff"},{"bazma","12345"},{"bazmaa","mas1223"},{"basma","12345"}};
    }
}
