package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By loginButton = By.className("login");
    By emailField = By.id("email");
    By passwordField = By.id("passwd");
    By submitButton = By.id("SubmitLogin");
    By logoutButton = By.className("logout");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    public boolean isLoggedIn() {
        return driver.findElements(logoutButton).size() > 0;
    }
}