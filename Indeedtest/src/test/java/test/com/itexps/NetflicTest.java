/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Chaudhry
 */
public class NetflicTest {
    
     private WebDriver driver;
     private String baseUrl;
    
    public NetflicTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {   
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    @Test   
    public void testGOOGLESEARCHTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.netflix.com/pk/");
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.xpath("//div[@id='appMountPoint']/div/div[3]/div/div/div/form/div/div/div/label/label")).click();
    driver.findElement(By.id("id_userLoginId")).click();
    driver.findElement(By.id("id_userLoginId")).clear();
    driver.findElement(By.id("id_userLoginId")).sendKeys("abc@abc.com");
    driver.findElement(By.id("id_password")).clear();
    driver.findElement(By.id("id_password")).sendKeys("abcd");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  
    
}
}
