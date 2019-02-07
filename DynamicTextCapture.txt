package seleniumnewtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTextCapture {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//close the Login window POPUP
		driver.findElement(By.xpath("//button[text()='?']")).click();
		//Enter the Data
		driver.findElement(By.name("q")).sendKeys("apple mobile",Keys.ENTER);
		//click on 2-GB RAM,checkBox
		driver.findElement(By.xpath("//div[text()='2 GB']/preceding-sibling::div")).click();
		//IDentify the dynamic text & capture the data
		String data=driver.findElement(By.xpath("//span[contains(text()='Showing']")).getText();
		System.out.print(data);
		driver.close();

	}

}
