package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass 
{
public static WebDriver driver;
public FileLib flb=new FileLib();
	
@BeforeClass
public void actiTimeBC() {
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@BeforeMethod
public void actiTimeBM() throws Throwable {
	String URL=flb.getPropertyKeyValue("url");
	System.out.println(URL);
	driver.get(URL);
	driver.findElement(By.id("username")).sendKeys(flb.getPropertyKeyValue("username"));
	driver.findElement(By.name("pwd")).sendKeys(flb.getPropertyKeyValue("password"));
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}

@AfterMethod
public void actiTimeAM() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	
}

@AfterClass
public void actiTimeAC() {
	driver.close();
}
}
