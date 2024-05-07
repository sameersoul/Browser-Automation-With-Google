package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.googleHomePage;

import static org.junit.Assert.assertTrue;

public class googleSearchSteps {
    private WebDriver driver;
    private googleHomePage googlePage;

    @Given("I am on the Google home page")
    public void i_am_on_the_google_home_page() {
       
        driver = new ChromeDriver();
        googlePage = new googleHomePage(driver);
        googlePage.openGoogle();
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        googlePage.searchFor(query);
    }

    @Then("I should see search results related to Independence Day {string}")
    public void i_should_see_search_results_related_to_independence_day(String expectedResult) {
        assertTrue(driver.getTitle().contains(expectedResult));
        driver.quit();
    }
}
