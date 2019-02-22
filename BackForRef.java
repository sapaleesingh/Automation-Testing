package seleniumnewtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackForRef {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://amazon.com");
		//Click on a LINK
		driver.findElement(By.linkText("Your Amazon.com")).click();
		Thread.sleep(2000);
		//Click on "BACK" Button
		driver.navigate().back();
		Thread.sleep(2000);
		//Click on "FORWARD" Button
		driver.navigate().forward();
		Thread.sleep(2000);
		//Clock on "REFRESS" Button
		driver.navigate().refresh();

	}

}
