package Flipkartautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {

public static WebDriver driver;

public void setup() throws InterruptedException {

WebDriverManager.chromedriver().setup();

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.flipkart.com");
     Thread.sleep(5000);

}

}