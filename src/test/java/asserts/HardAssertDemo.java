package asserts;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_setup.Base;

public class HardAssertDemo extends Base{
	
	@Test
	public void testHardAssert() {
		driver.get("http://automationpractice.com/index.php");
		WebElement searchBox = driver.findElement(By.name("submit_search"));
		Assert.assertNotNull(searchBox);	
		
		String actualPhoneNumber = driver.findElement(By.xpath("//span[@class='shop-phone']/strong")).getText();
		String expectedPhoneNumber = "123-55-3366";
		Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber);
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		driver.findElement(By.name("submit_search")).click();
	}

}
