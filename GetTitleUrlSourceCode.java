package seleniumnewtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleUrlSourceCode {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://amazon.com");
		//Capture the Current Page "Title".
		System.out.println(driver.getTitle());
		//Capture the Current Page "URL".
		System.out.println(driver.getCurrentUrl());
		//Capture the Current Page "HTML SOURCE" Code.
		System.out.println(driver.getPageSource());

	}

}
