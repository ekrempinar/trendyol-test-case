package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static WebElement element = null;
    public static String loginUrl = "https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F";
    public static String loggedInPageUrl = "https://www.trendyol.com/butik/liste/kadin";
    public static String randomBoutiqueUrl = "https://www.trendyol.com/supermarkette-buyuk-subat-firsati/butikdetay/555836";
    public static String randomProductUrl = "https://www.trendyol.com/kahve-dunyasi/orta-kavrulmus-turk-kahvesi-100-gr-12-li-p-3674890?boutiqueId=555836&merchantId=106690";

    @Parameters("browser")
    public static void setup(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else{
            throw new Exception("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Opening browser");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}