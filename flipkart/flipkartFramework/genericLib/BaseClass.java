package com.flipkart.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.flipkart.genericLib.FileLib;

public class BaseClass {
	public static WebDriver driver;
	public FileLib flb=new FileLib();
	
	@BeforeClass
	public void flipkartBC() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void flipkartBM() throws Throwable {
		String URL=flb.getPropertyKeyValue("url");
		System.out.println(URL);
		driver.get(URL);
		driver.findElement(By.className("_2zrpKA")).sendKeys(flb.getPropertyKeyValue("EmailId"));
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(flb.getPropertyKeyValue("Password"));
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

	}
	@AfterMethod
	public void flipkartAM() throws Throwable {
	//	Thread.sleep(2000);
		WebElement dwb=driver.findElement(By.xpath("//div[@class='_2aUbKa']"));
		Actions act=new Actions(driver);
		act.moveToElement(dwb).perform();
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Logout']")));
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		
	}
	@AfterClass
	public void flipkartAC() {
		driver.close();
	}
}
