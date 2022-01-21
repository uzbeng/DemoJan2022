package synchronization;

import java.time.Duration;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base_setup.Base;

public class ExplicitWait extends Base {
	
	@Test
	public void testExplicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("");
		
		// Opens a new page (takes 10 seconds to load)
		driver.findElement(By.id("")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
		// Continue your testing now, because it got loaded
		driver.findElement(By.id("")).click();
		
		
	}

}
