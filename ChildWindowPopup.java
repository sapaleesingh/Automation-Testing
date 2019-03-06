package seleniumnewtest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> it=set.iterator();
		String parentSessionID=it.next();
		
		while(it.hasNext()) {
			String childSessionID=it.next();
			if(!set.equals(childSessionID)) {
		driver.switchTo().window(childSessionID);
		String tit=driver.getTitle();
		System.out.println(tit);
		driver.close();
			}
		}
		driver.switchTo().window(parentSessionID);

	}

}
