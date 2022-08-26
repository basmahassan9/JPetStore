package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class searchTest extends baseTest{

    @Test
    public void searchTest(){
        String search="angelfish";
        home.addSearch(search);
        home.clickSearch();

        Assert.assertEquals(search.toLowerCase(),home.getResult().toLowerCase(),"wrong search item");
    }
}
