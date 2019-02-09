package seleniumnewtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {
    
	//gmail login log out automatically 
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		String expPage="Gmail";
		String actiTitle=driver.getTitle();
		if(expPage.equals(actiTitle)) {
			System.out.println("Gmail login page is displayed==PASS");
		}
		else {
			System.out.println("Gmail.login page is not displayed==FAIL");
		}
		System.out.println("test is PASS");
		WebElement wbEmail=driver.findElement(By.id("identifierId"));
		wbEmail.sendKeys("sapaleesingh03");
		WebElement wnBtn=driver.findElement(By.xpath("//span[text()='Next']"));
		wnBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("durgamaraksha");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='gb_cb gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
		driver.close();

	}

}
