package selenium5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Multi_Page_Automation {
    @Test
    public void test() {
        // WebDriver driver = null;
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys(" ");

    }

    @Test
    public void delta() {
        // WebDriver driver = null;
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.delta.com/");
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement  login= driver.findElement(By.xpath("//button[@id='login-modal-button']"));
        login.sendKeys(" ");

        WebElement  username= driver.findElement(By.xpath("//input[@name=\"textfield\"]"));
        username.sendKeys("fate1234");

        driver.getCurrentUrl();
        System.out.println("My url= "+driver.getCurrentUrl());
    }
    @Test
    public void facebook() {
        // WebDriver driver = null;
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        username.sendKeys("abc123 ");

        WebElement  password= driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        password.sendKeys("54321");

        WebElement  login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
        login.click();

        driver.getCurrentUrl();
        System.out.println("My url= "+driver.getCurrentUrl());

    }
}
