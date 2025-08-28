package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	
	
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void testcase1() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println("Testcase1 Done: " +Thread.currentThread().getId());
	}
	
	@Test
	public void testccase3() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Testcase2 Done: " +Thread.currentThread().getId());
	}
}
