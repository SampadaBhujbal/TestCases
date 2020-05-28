package com.instruction;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
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
	
	//for title verification
	@Test
	public void Tc_01()
	{
  	    String Title=driver.getTitle();
		System.out.println("page Title is" +Title);
		Assert.assertEquals(Title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	//for logo verification
	@Test
	public void Tc_02()
	{
	boolean flag=driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a/span[1]")).isDisplayed();
	Assert.assertTrue(flag);
		
		
	}
	
	//for login valid username,password
	
	@Test
	public void Tc_03() throws InterruptedException
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
	@Test
	public void Tc_04() {
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Assert.assertEquals(searchbox.isDisplayed(), true);
	}
	
	
	@Test
	public void Tc_05() throws InterruptedException{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera canon");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(5000);
	
	
	}
	
	//for :reviews 
	@Test
	public void Tc_06() throws  InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[2]/div/div/span/form/span")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]")).click();;
		Thread.sleep(3000);
	}
	
	@Test
	public void TC_07() {
		driver.findElement(By.xpath("//span[contains(text(),'Canon EOS 6D 20.2 MP CMOS Digital SLR Camera with')]")	).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	}
	
	@Test
	public void Tc_08()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();;
	
	}
	
	
}
