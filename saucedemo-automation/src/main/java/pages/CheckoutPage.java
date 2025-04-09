
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkoutButton = By.id("checkout");             //Selecting element as id
    By firstName = By.id("first-name");                
    By lastName = By.id("last-name");                  
    By postalCode = By.id("postal-code");             
    By continueButton = By.id("continue");             
    By finishButton = By.id("finish");                 
    By successMsg = By.className("complete-header");   

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();   
    }

    public void fillInformation(String fName, String lName, String pCode) {
        driver.findElement(firstName).sendKeys(fName); 
        WaitUtils.pauseDefault(); 
        driver.findElement(lastName).sendKeys(lName); 
        WaitUtils.pauseDefault(); 
        driver.findElement(postalCode).sendKeys(pCode); 
        WaitUtils.pauseDefault(); 
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();   
        WaitUtils.pauseDefault(); 
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();   
        WaitUtils.pauseDefault(); 
    }

    public boolean isCheckoutComplete() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
