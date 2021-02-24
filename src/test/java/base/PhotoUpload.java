package base;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class PhotoUpload extends BasePage {

    public static void checkPhoto(String tabName) {
        String notUploadedImageUrl = "";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        linksList.addAll(Collections.singleton(driver.findElement(By.tagName("img"))));

        List<WebElement> brokenImages = new ArrayList<>();

        for (WebElement webElement : linksList) {
            if (webElement.getAttribute("href") == notUploadedImageUrl) {
                brokenImages.add(webElement);
            }
        }

        System.out.print("\nThe "+"'"+tabName+"'"+" tabs all images number is : " + linksList.size());
        if (brokenImages != null) {
            System.out.print("\nThe broken images number is : " + brokenImages.size());
        } else {
            System.out.print("\nThere are no broken images\n\n");
        }

    }
}
