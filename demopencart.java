package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demopencart {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(alwaysRun = true)
	public void urlopen() throws InterruptedException {
		driver.get("https://magento2demo.firebearstudio.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		WebElement pants = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Aether Gym Pant')]/ancestor::li//button[@title='Add to Cart']")));

		
		searchbar.sendKeys("pants");
		search.click();
		pants.click();
		Thread.sleep(300);

	}
     public void url() {
    	String actualurl =  driver.getCurrentUrl();
    	String expectedurl = "https://magento2demo.firebearstudio.com/catalogsearch/result/?q=pants";
        Assert.assertEquals(actualurl, expectedurl, "Login Failed!");
    	 
	
	}

}
