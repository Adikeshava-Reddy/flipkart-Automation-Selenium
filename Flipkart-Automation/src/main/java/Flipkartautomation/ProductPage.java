package Flipkartautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


   
   


    public void handleProduct() {

    try {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
        Thread.sleep(1000);

      
        List<WebElement> offers = driver.findElements(By.xpath("//li"));

        if (!offers.isEmpty()) {
            System.out.println("Available offers count: " + offers.size());
        } else {
            System.out.println("No Available Offers section found.");
        }

        
        List<WebElement> addBtns = driver.findElements(
                By.xpath("//*[contains(text(),'Add to cartgg') or contains(text(),'Add to Cartdb')]")
        );

        if (!addBtns.isEmpty()) {

            WebElement addBtn = addBtns.get(0);

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView({block:'center'});", addBtn);

            wait.until(ExpectedConditions.elementToBeClickable(addBtn));

            addBtn.click();

            System.out.println("Add to Cart clicked successfully!");

            Thread.sleep(3000);

  driver.get("https://www.flipkart.com/viewcart");

Thread.sleep(3000);
ScreenshotUtil.takeScreenshot(driver, "cart_result");
            

            

        } else {

            System.out.println("Product unavailable — could not be added to cart.");

            ScreenshotUtil.takeScreenshot(driver, "result");

        }

    } catch (Exception e) {

        System.out.println(e);

       

    }
}
}