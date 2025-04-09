
package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.CheckoutPage;
import pages.LoginPage;
import utils.DriverFactory;

public class AddToCartCheckoutSteps {
    WebDriver driver = DriverFactory.driver;
    HomePage homePage;
    CheckoutPage checkoutPage;
    LoginPage loginPage;

    @Given("User is logged in to SauceDemo")
    public void user_logged_in() {
        driver = DriverFactory.driver;
        if (driver == null) {
            driver = DriverFactory.initializeDriver();
        }
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @When("User adds two random items to the cart")
    public void user_adds_items_to_cart() {
        homePage = new HomePage(driver);
        homePage.addTwoRandomItemsToCart();   //Adding two random items
    }

    @Then("The cart should reflect the correct items")
    public void cart_should_have_items() {
        homePage.goToCart();
        assert driver.getCurrentUrl().contains("cart");  //Click on cart 
    }

    @Given("Items are in the cart")
    public void items_are_in_cart() {
        homePage = new HomePage(driver);  //Items should display in cart
        homePage.goToCart();
    }

    @When("User proceeds to checkout and fills details")
    public void user_proceeds_to_checkout() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout(); //checking out
        checkoutPage.fillInformation("Hima", "Deep", "T4C 5G7"); //Provide details
        checkoutPage.clickContinue(); //Continue
    }

    @Then("The checkout should be completed successfully")
    public void checkout_success() {
        checkoutPage.clickFinish();  //Finish checkout
        assert checkoutPage.isCheckoutComplete();
        driver.quit();
    }
}
