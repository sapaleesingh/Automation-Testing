package seleniumnewtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://amazon.in/");
		//Search for Iphone XR
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr",Keys.ENTER);
		//IDentify the Price of "IPhone XR"
		String x="//h2[text()='Apple iPhone XR (Blue, 3GB RAM, 256GB Storage, 12 MP Camera, 326 PPI Display)']/../../../../div[2]/div[1]/div";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);

	}

}