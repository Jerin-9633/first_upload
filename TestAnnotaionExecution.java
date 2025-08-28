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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotaionExecution {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite executed");
	}
	@AfterSuite
	public void aftersuite() {
       System.out.println("After suite executed");		
	}
	@BeforeTest
	public void beforetest() {
	       System.out.println("before test executed");
		}
    @AfterTest
	public void aftertest() {
	       System.out.println("Aafter test executed");
    }
    @BeforeClass
    public void beforeclass() {
        System.out.println("Before class executed");
    }
    @AfterClass
    public void afterclass() {
        System.out.println("After class executed");
    }
    @BeforeMethod
    public void Beforemethod() {
        System.out.println("beforemethod executed");
    }
    @AfterMethod
    public void aftermethod() {
        System.out.println("Aftermethod executed");
    }
    @Test
    public void testmethod1() {
    	System.out.println("Testing1 Done");
    }
    @Test
    public void testmethod2() {
    	System.out.println("Testing2 Done");
}
}
    


