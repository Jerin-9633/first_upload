package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "test1")
	public void verifyLogin(String uname, String pswd) {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("submit"));

		username.sendKeys("uname");
		password.sendKeys("pswd");
		loginButton.click();

		// Validate successful login
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(actualUrl, expectedUrl, "Login Failed!");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.close();
	}
	}

	@DataProvider(name = "test1")
		public static Object[] [] Logincrediantials(){
	    return new Object[][] {
	        {"student", "Password123"},
	        {"admin", "Admin123"}
	    };
		}

}





