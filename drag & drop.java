package seleniumnewtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demos.telerik.com/Kendo-ui/dragdrop/index");
		WebElement srcwb=driver.findElement(By.id("draggable"));
		WebElement dstwb=driver.findElement(By.id("droptarget"));
		Actions act=new Actions(driver);
		act.dragAndDrop(srcwb,dstwb).perform();
                driver.close();

	}

}
