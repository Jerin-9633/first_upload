package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class parabank {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void webopen() throws InterruptedException {
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));

		username.sendKeys("john");
		password.sendKeys("demo");
		login.click();
		Thread.sleep(300);
	}

	@Test(dependsOnMethods = "webopen", alwaysRun = true)
	public void url() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("overview.htm"));

		// Now check the URL exactly
		String actualUrl = driver.getCurrentUrl().trim();
		String expectedUrl = "https://parabank.parasoft.com/parabank/overview.htm";

		Assert.assertEquals(actualUrl, expectedUrl, "Login Failed!");

	}

	@Test
	public void open() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Open New Account']")).click();
		Thread.sleep(300);
	}

	@Test
	public void dropdown() throws IOException, InterruptedException {
		driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");

		// wait for dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("type")));

		// First dropdown - account type
		Select select = new Select(dropdown);
		select.selectByVisibleText("SAVINGS");

		WebElement openacc = driver.findElement(By.cssSelector("input[value='Open New Account']"));
		openacc.click();
		System.out.println("successfully account created ");
		Thread.sleep(3000);

	}

	public void logout() {
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		System.out.println("logout is ok!");
	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
