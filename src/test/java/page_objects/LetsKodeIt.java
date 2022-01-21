package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LetsKodeIt {
	
	private WebDriver driver;
	
	//Locators:
	By bmwRadBtn = By.id("bmwradio");
	By openWinBtn = By.id("openwindow");
	By searchBox = By.id("name123");
	By firstItemName = By.xpath("//ul[@class='product_list grid row']//div//h5/a");
	// add other object locators here

	
	// Constructor
	public LetsKodeIt(WebDriver driver) {
		this.driver = driver;
	}
	
	// Actions:
	public void clickBmwRadBtn() {
		driver.findElement(bmwRadBtn).click();
	}
	
	public void clickOpenWinBtn() {
		driver.findElement(openWinBtn).click();
	}
	
	public void insertNameIntoBox(String myName) {
		driver.findElement(searchBox).sendKeys(myName);
	}
	
	public String getFirstItemName() {
		return driver.findElement(firstItemName).getText();
	}
}
