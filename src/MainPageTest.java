import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MainPageTest {
    WebDriver driver;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // на полный экран
        driver.get("http://newtours.demoaut.com/");
    }


    @Test
public void test1() {
        WebElement login = driver.findElement(By.xpath(".//input[@name='userName']"));
        WebElement pass = driver.findElement(By.xpath(".//input[@name='password']"));
        WebElement signIn = driver.findElement(By.xpath(".//input[@name='login']"));
        login.sendKeys("test1");
        pass.sendKeys("test1");
        signIn.click();



    }
    @After
    public void stop() {
     driver.quit();
    }
}