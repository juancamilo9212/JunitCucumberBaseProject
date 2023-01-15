package StepDefinitions;

import DriverFactory.BrowserType;
import Pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class GoogleHomeSteps {

    private CommonSteps commonSteps;
    private WebDriver driver;
    private GoogleHomePage googleHomePage;

    public GoogleHomeSteps(CommonSteps commonSteps) {
        this.commonSteps = commonSteps;
        this.driver = commonSteps.getDriver(BrowserType.CHROME);
        this.googleHomePage = new GoogleHomePage(driver);
    }

    @Given("I visit google home page")
    public void i_visit_google_home_page() {
        googleHomePage.visit("https://www.google.com");
    }
    @When("I so a simple search for {string}")
    public void i_so_a_simple_search_for(String string) {

    }
    @Then("I will see a {string} as result title")
    public void i_will_see_a_as_result_title(String string) {

    }
}
