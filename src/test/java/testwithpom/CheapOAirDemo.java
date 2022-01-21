package testwithpom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_objects.CheapOAirPage;

public class CheapOAirDemo {

	private String practiceUrl = "https://www.cheapoair.com/";
	private WebDriver driver;
	private int numberOfSeniors = 2;
	private CheapOAirPage cheapOAirPage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		// My window will open on my left screen (for my computer only)
		driver.manage().window().setPosition(new Point(-1200, 0));
		driver.manage().window().maximize();
		cheapOAirPage = new CheapOAirPage(driver);
	}

	// @AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testDrpDown() throws InterruptedException {
		driver.get(practiceUrl);

		cheapOAirPage.clearFromBox();		
		cheapOAirPage.clickFromBox();
		cheapOAirPage.insertIntoFromBox("New");
		Thread.sleep(1000);
		cheapOAirPage.pressDownFromBoxResults(3);
		cheapOAirPage.pressEnterOnFromBox();
		cheapOAirPage.insertIntoToBox("Tas");
		Thread.sleep(1000);
		cheapOAirPage.pressEnterOnToBox();
		Thread.sleep(1000);
		cheapOAirPage.selectCurDateForDeparture();
		Thread.sleep(1000);
		cheapOAirPage.selectFiveDaysLaterForReturn();	
		cheapOAirPage.clickTravellerBtn();
		cheapOAirPage.addSeniors(numberOfSeniors);
		cheapOAirPage.addChildren(1);
		cheapOAirPage.selectChild1Age("3");
		cheapOAirPage.addInfants(1);
		cheapOAirPage.selectClass("2");
		cheapOAirPage.clickCloseDialogueBtn();
		cheapOAirPage.clickSeachNowBtn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
