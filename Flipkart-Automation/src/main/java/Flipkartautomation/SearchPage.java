package Flipkartautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    By brandDropdown = By.xpath("//div[text()='Brand']");
    By boatBrand = By.xpath("//div[text()='boAt']");
    By fourStarRating = By.xpath("//div[contains(text(),'4') and contains(text(),'above')]");
    By priceSort = By.xpath("//div[text()='Price -- Low to High']");
    By productLinks = By.cssSelector("a[href*='/p/']");

 public void applyFilters() {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

   
    wait.until(ExpectedConditions.elementToBeClickable(brandDropdown)).click();

    
    wait.until(ExpectedConditions.elementToBeClickable(boatBrand)).click();


    wait.until(ExpectedConditions.invisibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Loading')]")
    ));

}

 public void selectFourStarRating() {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement rating = wait.until(
            ExpectedConditions.elementToBeClickable(fourStarRating));

    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", rating);

  
    wait.until(ExpectedConditions.invisibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Loading')]")
    ));
}

    public void sortByPrice() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement sort = wait.until(ExpectedConditions.visibilityOfElementLocated(priceSort));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sort);

    }

    public void openFirstProduct() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        List<WebElement> products = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(productLinks));

        products.get(0).click();

      
    }

    public void switchToNewTab() {

        String currentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {

            if (!window.equals(currentWindow)) {

                driver.switchTo().window(window);
                break;
            }
        }
    }
}