package regression;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import setup.CommonAPI;
import setup.LiveIntentHomePage;


public class LiveIntentHomePageTest extends CommonAPI{

    LiveIntentHomePage testObj;

    /**
     * instantiate the object
     */
    @BeforeMethod
    public void init(){
        testObj= PageFactory.initElements(driver, LiveIntentHomePage.class);

    }


    /**
     * //this function verifies 'Get Started' then click it, and CONTACT US and click
     * created by Winsen Sid Date /--/--
     */
    @Test
    public void verifyAndClkTest(){
        testObj.verifyAndClickGetStarted();


    }

}


