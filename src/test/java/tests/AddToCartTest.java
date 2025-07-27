package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import base.BaseTest;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart() {
        HomePage home = new HomePage(driver);
        home.addFirstItemToCart();
        Assert.assertTrue(home.isCartUpdated(), "Cart should be updated with the item.");
    }
}