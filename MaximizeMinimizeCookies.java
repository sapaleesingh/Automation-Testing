package seleniumnewtest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeMinimizeCookies {

	public static void main(String[] args)throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		//maximize to Browser Window
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//change the Size of the Window Minimize
		Dimension dem=new Dimension(100,300);
		driver.manage().window().setSize(dem);
		Thread.sleep(2000);
		//Delete the browser data which is being used at the time of Execution
		driver.manage().deleteAllCookies();
		//Close only one window
		driver.close();
	}

}