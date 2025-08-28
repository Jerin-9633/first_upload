package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {
	WebDriver driver;
    @BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test(priority  =1)
	public void login() throws InterruptedException {
		driver.get("https:\\google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("hello", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
		
	}
	@Test(priority = 1)
	public void facebook() throws InterruptedException  {
		driver.get("https:\\facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("hello", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();


		
	}
}


