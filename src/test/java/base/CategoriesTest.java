package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.fishPage;
import pages.homePage;
import pages.productPage;
import pages.shoppingCartPage;

public class CategoriesTest extends baseTest{
    @Test
    public void catTest(){
        fishPage page = home.categoriesClick();
        SoftAssert soft = new SoftAssert();
       soft.assertEquals(page.getTitle(),"Fish","wrong category");
       productPage productPage = page.chooseFish(0);
       String firstId=productPage.getID();
        shoppingCartPage cart = productPage.addToCart();
        soft.assertEquals(firstId, cart.getID(),"wrong ID");
        soft.assertAll();
    }

}
