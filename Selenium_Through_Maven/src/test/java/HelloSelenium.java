import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by srikanth.nellore on 18/11/2015.
 */
public class HelloSelenium {

    @Test
    public void googleTest(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
        assertTrue(driver.getTitle().equals("Google"));
        driver.quit();
    }
}
