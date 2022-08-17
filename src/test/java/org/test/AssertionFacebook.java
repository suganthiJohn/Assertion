package org.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AssertionFacebook {
	
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		System.out.println(contains);
		Assert.assertTrue(contains);
		
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("suganthi");
		String attribute = txtemail.getAttribute("value");
		Assert.assertEquals("suganthi", attribute);
		
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("judith samuel");
		
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();

	}
@Test
public void tc2() {
	System.out.println("TC2....");

}
@Test
public void tc3() {
	System.out.println("TC3.....");

}
}
