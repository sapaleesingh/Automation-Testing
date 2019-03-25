package flipkart.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseClass;

public class LoginTest extends BaseClass{
	@Test
	public void LoginerrorTest() throws InterruptedException {
		Dimension dem=new Dimension(100,300);
		driver.manage().window().setSize(dem);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
		
		@Test
		public void priceTest() throws InterruptedException {
			//Search for Iphone XR
			driver.findElement(By.name("q")).sendKeys("iphone xr",Keys.ENTER);
			WebDriverWait wait=new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apple iPhone XR (White, 256 GB)']/../../../../div/div[1]/div[1]/a[3]/div/div")));
			//IDentify the Price of "IPhone XR"
			String x="//a[text()='Apple iPhone XR (White, 256 GB)']/../../../../div/div[1]/div[1]/a[3]/div/div";
			String price=driver.findElement(By.xpath(x)).getText();
			System.out.println(price);

		}
		
	

}
	
