package setup;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

    public class LiveIntentHomePage extends CommonAPI {

        @FindBy(xpath = "//*[@class='white-border-btn']")
        WebElement getStarted;

        @FindBy(xpath = "//*[@class='header-cta-nav']")
        WebElement contactUsHeader;



        //this function verifies 'Get Started' then click it, and CONTACT US and click
        public void verifyAndClickGetStarted() {
            if (getStarted.isDisplayed())
                Assert.assertTrue(true);
            getStarted.click();

            String countactheader= contactUsHeader.getText();
            //this verifies CONTACT US
            Assert.assertEquals("Contact Us",countactheader);
            String actCcurrentURL=driver.getCurrentUrl();
            //this Assertion verifies the https://www.liveintent.com/get-in-touch/ page
            Assert.assertEquals("https://www.liveintent.com/get-in-touch/",actCcurrentURL);
            System.out.println("my actual text is: "+countactheader);


        }
    }



