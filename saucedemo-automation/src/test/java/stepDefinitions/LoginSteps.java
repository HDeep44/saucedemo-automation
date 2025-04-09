
package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the SauceDemo login page")
    public void user_is_on_login_page() {
        driver = DriverFactory.initializeDriver();
        driver.get("https://www.saucedemo.com/");  //Loading the page
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername("standard_user"); //Provided Username
        loginPage.enterPassword("secret_sauce"); //Provided Password
    }

    @When("Clicks on the login button")
    public void click_login_button() {
        loginPage.clickLogin();         //Click on Login
    }

    @Then("User should be navigated to the homepage")
    public void verify_homepage() {
        assert driver.getCurrentUrl().contains("inventory");   //Display Homepage
    }
}
