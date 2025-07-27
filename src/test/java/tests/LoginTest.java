package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.LoginPage;
import pages.HomePage;
import base.BaseTest;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login("testuser@example.com", "password123");
        Assert.assertTrue(loginPage.isLoggedIn(), "User should be logged in.");
    }
}