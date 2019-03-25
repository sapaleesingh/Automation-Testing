package actiTime.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.actitime.genericLib.BaseClass;

public class NewTask extends BaseClass{
	
@Test
public void createCustomerTest() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
	Select sel=new Select(driver.findElement(By.name("customerId")));
	Thread.sleep(1000);
	sel.selectByVisibleText("-- new customer --");
	driver.findElement(By.name("customerName")).sendKeys(flb.getPropertyKeyValue("entercustomername"));
}

@Test
public void taskCreate() throws Throwable{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
	Select sel=new Select(driver.findElement(By.name("projectId")));
	sel.selectByVisibleText("-- new project --");
	driver.findElement(By.name("projectName")).sendKeys(flb.getPropertyKeyValue("projectName"));
}
}