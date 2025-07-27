package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import base.BaseTest;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchProduct() {
        HomePage home = new HomePage(driver);
        home.search("dress");
        Assert.assertTrue(home.searchResultsContain("dress"), "Search results should contain 'dress'.");
    }
}