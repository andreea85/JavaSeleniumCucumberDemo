package starter.runners.stepdefinions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingHeaderButtons {
    WebDriver driver;

    @Given("Accessing the Home page")
    public void accessing_the_home_page() {
       driver.get("https://phptravels.com/");
    }

    @When("User clicks on Demo Button")
    public void user_clicks_on_demo_button() {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();

    }
    @Then("The Demo page is displayed")
    public void the_demo_page_is_displayed() {

    }
}
