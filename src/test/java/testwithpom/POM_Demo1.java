package testwithpom;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_objects.LetsKodeIt;
import page_objects.LetsKodeItPageFactory;

public class POM_Demo1 {
	
	private String url = "https://courses.letskodeit.com/practice";
	private WebDriver driver;
	private LetsKodeIt letsKodeItPage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		// My window will open on my left screen (for my computer only)
		driver.manage().window().setPosition(new Point(-1200, 0));
		driver.manage().window().maximize();
		letsKodeItPage = new LetsKodeIt(driver);
	}
	
		
	@Test
	public void testPOM1() {
		
		driver.get(url);
		
		//BWM radio button
		//driver.findElement(By.id("bmwradio")).click();
		letsKodeItPage.clickBmwRadBtn();
		
		letsKodeItPage.clickOpenWinBtn();
		
		letsKodeItPage.insertNameIntoBox("Tom");
	}
	
	@Test
	public void testPOM2() {
		
		driver.get(url);
				
		letsKodeItPage.insertNameIntoBox("Jeremy");
	}
	
	@Test
	public void testPageFactory() {
		LetsKodeItPageFactory letsKodeItPageFactory = new LetsKodeItPageFactory(driver);
		
		driver.get(url);
		letsKodeItPageFactory.clickBmwRadBtn();
	}

}
