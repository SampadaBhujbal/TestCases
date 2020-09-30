package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLogin {
	public static WebDriver driver;
	// Change by sushil
	
	@BeforeTest
	//@Test
	public void setUpChrome() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\shree-pc\\eclipse-workspace\\instructions\\drivers\\chromedriver.exe ");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");

}
		@Test
	public void loginUsingValidCridential() {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8830404095");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sam@12345");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
	}
		
	//@Test(priority=2)
	public void loginUsingInValidUsername() {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8830404085");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sam@12345");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
	}
	//@Test(priority=3)
	public void loginUsingInValidPassword() {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8830404095");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sam@12356");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
	}
	@Test
	public void verifyTitle() {
		String Title=driver.getTitle();
		System.out.println("page Title is " +Title);
	Assert.assertEquals(Title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test
	public void tc() {
		
	}
	
}