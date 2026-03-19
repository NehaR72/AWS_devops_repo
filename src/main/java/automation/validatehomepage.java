package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class validatehomepage {
    @Test
    public void loginTest() {
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/login");
        driver.findElement(By.id("userName")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("Password123!");
        driver.findElement(By.id("login")).click();
        
        driver.quit();
    }
}
