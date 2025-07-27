package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By searchBox = By.id("search_query_top");
    By searchButton = By.name("submit_search");
    By firstProduct = By.cssSelector(".product_list .product-container");
    By addToCartButton = By.cssSelector(".ajax_add_to_cart_button");
    By cartQuantity = By.className("ajax_cart_quantity");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchButton).click();
    }

    public boolean searchResultsContain(String keyword) {
        return driver.getPageSource().toLowerCase().contains(keyword.toLowerCase());
    }

    public void addFirstItemToCart() {
        driver.findElement(firstProduct).click();
        driver.findElement(addToCartButton).click();
    }

    public boolean isCartUpdated() {
        return !driver.findElement(cartQuantity).getText().isEmpty();
    }
}