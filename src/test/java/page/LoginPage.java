package page;

import base.BasePage;
import base.PhotoUpload;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    private static LoginPage instance;

    public static synchronized LoginPage getInstance() {
        if (instance == null)
            instance = new LoginPage();
        return instance;
    }

    //Login
    public void startDriver() throws Exception {
        //if you want you can change running browser
        BasePage.setup("firefox");
    }

    public void navigateToUrl() {
        driver.get(loginUrl);
    }

    public void enterEmail() {
        element = driver.findElement(By.id("login-email"));
        element.sendKeys("vimlanasto@nedoz.com");
    }

    public void enterPassword() {
        element = driver.findElement(By.id("login-password-input"));
        element.sendKeys("Test1234");
    }

    public void clickToSignIn() {
        element = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button"));
        element.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void checkLoggedInPage() {
        Boolean isLoggedIn =  driver.findElement(By.cssSelector("#account-navigation-container > div > div.account-nav-item.user-login-container > div.link.account-user > p")).isDisplayed();
        if (isLoggedIn == true) {
            System.out.print("Successfully logged in");
        }
        else {
            System.out.print("Did not log in successfully");

        }
    }

    public void openMainPage() {
        driver.get(loggedInPageUrl);
    }

    public void clickToWomanTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[1]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToManTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToKidTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[3]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToHomeAndLifeTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[4]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToSupermarketTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[5]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToCosmeticTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[6]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToShoeAndBagTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[7]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToWatchAndAccessoryTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[8]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void clickToElectronicTab() {
        element = driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void logTheWomanTabPhotoInfo() {
        String womanTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(1) > a")).getText();
        PhotoUpload.checkPhoto(womanTab);
    }

    public void logTheManTabPhotoInfo() {
        String manTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(2) > a")).getText();
        PhotoUpload.checkPhoto(manTab);
    }

    public void logTheKidTabPhotoInfo() {
        String kidTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(3) > a")).getText();
        PhotoUpload.checkPhoto(kidTab);
    }

    public void logTheHomeAndLifeTabPhotoInfo() {
        String homeAndLifeTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(4) > a")).getText();
        PhotoUpload.checkPhoto(homeAndLifeTab);
    }

    public void logTheSupermarketTabPhotoInfo() {
        String supermarketTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(5) > a")).getText();
        PhotoUpload.checkPhoto(supermarketTab);
    }

    public void logTheCosmeticTabPhotoInfo() {
        String cosmeticTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(6) > a")).getText();
        PhotoUpload.checkPhoto(cosmeticTab);
    }

    public void logTheShoeAndBagTabPhotoInfo() {
        String shoeAndBagTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(7) > a")).getText();
        PhotoUpload.checkPhoto(shoeAndBagTab);
    }

    public void logTheWatchAndAccessoryTabPhotoInfo() {
        String watchAndAccessoryTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(8) > a")).getText();
        PhotoUpload.checkPhoto(watchAndAccessoryTab);
    }

    public void logTheElectronicTabPhotoInfo() {
        String electronicTab = driver.findElement(By.cssSelector("#navigation-wrapper > nav > ul > li:nth-child(9) > a")).getText();
        PhotoUpload.checkPhoto(electronicTab);
    }
}