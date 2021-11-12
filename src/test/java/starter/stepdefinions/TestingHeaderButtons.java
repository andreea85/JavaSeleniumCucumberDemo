package starter.stepdefinions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestingHeaderButtons {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("Accessing the Home page")
    public void accessing_the_home_page() {
        driver.get("https://phptravels.com/");
        driver.manage().window().maximize();


    }

    @When("User clicks on Demo Button")
    public void user_clicks_on_demo_button() {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();

    }

    @Then("The Demo page is displayed")
    public void the_demo_page_is_displayed() {

        String url = driver.getCurrentUrl();
        String expectedUrl = "https://phptravels.com/demo";
        Assert.assertEquals(expectedUrl,url);
    }

    @When("User clicks on Pricing Button")
    public void user_clicks_on_pricing_button() {
       driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
    }

    @Then("The Pricing page is displayed")
    public void the_pricing_page_is_displayed() {

        String urlPricing = driver.getCurrentUrl();
        String expectedUrlPricing = "https://phptravels.com/order";
        Assert.assertEquals(expectedUrlPricing, urlPricing);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
