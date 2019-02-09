package seleniumnewtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartpricetest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://flipkart.com/");
		//close the Login window POPUP
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Search for Iphone XR
		driver.findElement(By.name("q")).sendKeys("iphone xr",Keys.ENTER);
		
		Thread.sleep(2000);
		//IDentify the Price of "IPhone XR"
		String x="//a[text()='Apple iPhone XR (White, 256 GB)']/../../../../div/div[1]/div[1]/a[3]/div/div";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);

	}

}
