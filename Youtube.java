package Selenium5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Youtube {
    @Test
    public void test(){
        // WebDriver driver = null;
        WebDriver  driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


}
