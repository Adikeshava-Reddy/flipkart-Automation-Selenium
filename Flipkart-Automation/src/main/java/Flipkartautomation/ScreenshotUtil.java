package Flipkartautomation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String name) {

        try {

            String path = System.getProperty("user.dir") + "/ScreenShots/";

            File folder = new File(path);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File(path + name + "_" + time + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot captured");

        } catch (Exception e) {

            System.out.println("Screenshot failed");

        }
    }
}