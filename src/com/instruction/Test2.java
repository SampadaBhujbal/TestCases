package com.instruction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void Tc_00() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree-pc\\eclipse-workspace\\instructions\\drivers\\chromedriver.exe ");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:/www.amazon.com/");
	}
	@Test
	public void Tc_01() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sampada96bhujbal@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sam@12345");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
	//for login invalid username,password
	@Test
	public void Tc_02() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sampada95Bhujbal@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sam@12345");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	//for login  username,invalid password
	@Test
	public void Tc_03() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sampada96bhujbal@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sam12345");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	@Test
	public void Tc_04() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/span[4]/span/a")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
	}
	
	
	
	@AfterMethod
	public void Tc_5()
	{
		driver.quit();
		
	}

	
	
}
