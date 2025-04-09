
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Random;
import utils.WaitUtils;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By inventoryItems = By.cssSelector(".inventory_item"); //Selecting element as cssSelector
    By addToCartButtons = By.xpath("//button[contains(text(),'Add to cart')]"); //Selecting element as xPath
    By cartIcon = By.className("shopping_cart_link"); //Selecting element as className

    public void addTwoRandomItemsToCart() {
        List<org.openqa.selenium.WebElement> buttons = driver.findElements(addToCartButtons);
        Random rand = new Random();
        int first = rand.nextInt(buttons.size()); 
        int second;
        do {
            second = rand.nextInt(buttons.size());  
        } while (second == first);
        buttons.get(first).click();
        WaitUtils.pauseDefault(); 
        buttons.get(second).click();
        WaitUtils.pauseDefault(); 
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
        WaitUtils.pauseDefault(); //We can eliminate this wait. But to show you how the pages load while executing I added this
    }
}
