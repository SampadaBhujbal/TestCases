package com.instruction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateList {
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
	@Test
	public void Tc_02() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera canon");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Canon PowerShot SX420 Digital Camera w')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
		
	}
	
	@Test
	public void Tc_03() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera bag");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//span[contains(text(),'AmazonBasics Large DSLR Camera Gadget Bag - 11.5 x')]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
	//driver.navigate().back();
		
		
	}
	@Test
	public void Tc_04() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera stand");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//span[contains(text(),'AmazonBasics 60-Inch Lightweight Tripod with Bag')]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
	}
	@Test
	public void Tc_05() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera cleaning kit");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//span[contains(text(),'LS PHOTOGRAPHY [2Pack] 7 in 1 Care & Cleaning Kit')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
		
	}
	@Test
	public void Tc_06() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera canon lens");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//span[contains(text(),'Canon EF-S 55-250mm F4-5.6 is STM Lens for Canon S')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
		
	}
	//Shopping list
	@Test
	public void Tc_07() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //div[@id='nav-flyout-wl-items']//a[1]//span[1]")).click();
		driver.findElement(By.xpath("//a[@id='filter-and-sort']//i[contains(@class,'a-icon a-icon-dropdown')]")).click();
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//a[@id='dropdown1_3']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='dropdown1_3']")).click();
	}
	//add to cart
	@Test
	public void Tc_08() {
		driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']")).click();
		WebElement text=driver.findElement(By.id("itemAction_I111KE6STTB6QK"));
		text.getText();
		System.out.println("page Title is" +text.getText());
		
	}
	@Test
	public void Tc_09() {
		driver.findElement(By.xpath("//a[contains(text(),'View Cart')]")).click();
		System.out.println("This is gift");
		driver.findElement(By.xpath("//div[@class='a-checkbox sc-gift-option a-align-top a-size-small a-spacing-top-micro']//label//input")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//a[@id='dropdown1_1']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='dropdown1_1']")).click();
		
		
	}
}
