package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleHomePage {
    private WebDriver driver;
    private By searchBox = By.name("q");

    public googleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    public void searchFor(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchBox).submit();
    }
}
