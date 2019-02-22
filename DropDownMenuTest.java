package seleniumnewtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenuTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ref=new_logo");
		//Step1: Identify Drop down new Element in GUI
		WebElement dwb=driver.findElement(By.xpath("//span[text()='Departments']"));
		//Step2: Create an Object to ACTIONS class
		Actions act=new Actions(driver);
		//Step3: take the Mouse Cursor middle of the Element & Execute
		((Actions) act).moveToElement(dwb).perform();
		//click on "Books" sub menue LINK
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Books']")).click();

	}

}
