package base_setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	protected WebDriver driver = null;
	private String browser= null;
	protected String url = null;
	
	@BeforeClass
	public void initilizeVariables() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("app.properties");
		prop.load(fis);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
	}

	@BeforeMethod
	public void setup() {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		// My window will open on my left screen (for my computer only)
		driver.manage().window().setPosition(new Point(-1200, 0));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
