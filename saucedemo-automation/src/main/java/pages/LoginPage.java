
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        WaitUtils.pauseDefault(); //We can eliminate this wait. But to show you how the pages load slowly while executing I added this
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        WaitUtils.pauseDefault(); 
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        WaitUtils.pauseDefault(); 
    }
}
