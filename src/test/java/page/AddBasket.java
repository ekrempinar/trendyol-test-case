package page;

import base.BasePage;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddBasket extends BasePage {
    private static AddBasket instance;

    public static synchronized AddBasket getInstance() {
        if (instance == null)
            instance = new AddBasket();
        return instance;
    }
    public void navigateToProductDetail() {
        driver.get(randomProductUrl);
    }

    public void clickToAddBasket() {
        element = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[4]/div/button"));
        element.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void checkAddBasket() {
        element = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p"));
        element.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Boolean isAdded =  driver.findElement(By.cssSelector("#partial-basket > div > div.pb-merchant-group > div.pb-basket-item > a > p.pb-item")).isDisplayed();
        if (isAdded == true) {
            System.out.print("\nSuccessfully added to basket\n");
        }
        else {
            System.out.print("\nDid not added to basket successfully\n");

        }
    }
}
