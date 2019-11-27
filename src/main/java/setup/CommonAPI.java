package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver;


    @Parameters({"url","paltform","browser"})
    @BeforeMethod
    public static WebDriver setup(String url , String platform, String browser) {
        System.setProperty("webdriver.chrome.driver","/Users/winsensid/Documents/LiveIntentCom/src/test/resources/Drivers/chromedriver 3");
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);


        return driver;
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
   /* public void sleepfor(int sec) { try {
            sleepfor(sec *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();*/
        }



