package Flipkartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    By closeLoginPopup = By.xpath("//button[contains(text(),'✕')]");
    By searchBox = By.name("q");

    // Close login popup
    public void closeLoginPopup(){

        try{
            driver.findElement(closeLoginPopup).click();
        }catch(Exception e){
            System.out.println(e);
        }

    }

    // Search product
    public void searchProduct(String product){

        driver.findElement(searchBox).sendKeys(product + Keys.ENTER);

    }

}