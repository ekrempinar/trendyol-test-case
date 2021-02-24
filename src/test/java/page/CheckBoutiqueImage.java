package page;

import base.BasePage;
import base.PhotoUpload;
import org.openqa.selenium.By;

public class CheckBoutiqueImage extends BasePage {

    private static CheckBoutiqueImage instance;

    public static synchronized CheckBoutiqueImage getInstance() {
        if (instance == null)
            instance = new CheckBoutiqueImage();
        return instance;
    }
    public void navigateToBoutiqueUrl() {
        driver.get(randomBoutiqueUrl);
    }

    public void logTheBoutiqueImageInfo() {
        String womanTab = driver.findElement(By.cssSelector("#boutique-detail-app > div > div.boutique-meta-container > div.boutique-description > a > h1")).getText();
        PhotoUpload.checkPhoto(womanTab);
    }
}
