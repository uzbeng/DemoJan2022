package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_setup.Base;
import page_objects.LetsKodeIt;

public class SoftAssertDemo extends Base {
	
	@Test
	public void testSoftAssert() {
		SoftAssert softAssert = new SoftAssert();
		LetsKodeIt letsKodeIt = new LetsKodeIt(driver);
		
		driver.get("http://automationpractice.com/index.php");
		WebElement searchBox = driver.findElement(By.name("submit_search"));
		Assert.assertNotNull(searchBox);	
		
		String actualPhoneNumber = driver.findElement(By.xpath("//span[@class='shop-phone']/strong")).getText();
		String expectedPhoneNumber = "123-55-3366";
		softAssert.assertEquals(actualPhoneNumber, expectedPhoneNumber);
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		driver.findElement(By.name("submit_search")).click();
		
		//String firstItemName = driver.findElement(By.xpath("//ul[@class='product_list grid row']//div//h5/a")).getText();
		String firstItemName = letsKodeIt.getFirstItemName();
		boolean firstItemMatches = firstItemName.toLowerCase().contains("shirt");
		softAssert.assertFalse(firstItemMatches, "My item's name matches to the search criteria");
		
		boolean isOneWaySelected = driver.findElement(By.id("")).isSelected();
		Assert.assertTrue(isOneWaySelected);
		softAssert.assertAll();
	}

}
