package test;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabtest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

}
	@Test(priority = 1, alwaysRun =  true, description = "launch app")
	public void launchapp()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void startapp() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//input[@placeholder='Username']")
		    ));
		    username.sendKeys("standard_user");

		    WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//input[@id='password']")
		    ));
		    password.sendKeys("secret_sauce");

		    WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//input[@id='login-button']")
		    ));
		    loginBtn.click();
	}
	
	@Test
	public void currenturl() {
		String url = driver.getCurrentUrl();
	}
	@Test
	public void get() {
		String title = driver.getTitle();
	}
	
	@Test
	public void logout() {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    System.out.println("URL: " + driver.getCurrentUrl());
		    System.out.println("Title: " + driver.getTitle());
          WebElement dropdown = wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn'")));
          dropdown.click();

		    WebElement logoutBtn = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout_sidebar_link']")));
		  logoutBtn.click();
	} 
	@AfterClass
	public void out() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}