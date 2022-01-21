package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheapOAirPage {
	private WebDriver driver;

	// locators
	@FindBy(css = "input[id=\"from0\"]")
	private WebElement fromBox;
	
	@FindBy(css = "input[id=\"to0\"]")
	private WebElement toBox;
	
	@FindBy(css = "a[class=' month-date is--today']")
	private WebElement currentDateOnDeparture;
	
	@FindBy(xpath = "(//a[@class=' month-date'])[5]")
	private WebElement fiveDaysInFutureDate;
	
	@FindBy(id = "travellerButton")
	private WebElement travellerBtn;
	
	@FindBy(id = "addseniors")
	private WebElement addSeniorsBtn;
	
	@FindBy(id = "addchild")
	private WebElement addChildBtn;
	
	@FindBy(name = "ChildrenAge")
	private WebElement child1AgeDrpDown;
	
	@FindBy(id = "addinfant")
	private WebElement addInfantBtn;
	
	@FindBy(id = "Class")
	private WebElement classDrpDown;
	
	@FindBy(id = "closeDialog")
	private WebElement closeDialogueBtn;
	
	@FindBy(id = "searchNow")
	private WebElement searchNowBtn;

	// constructor
	public CheapOAirPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// actions
	public void clearFromBox() {
		fromBox.clear();
	}

	public void clickFromBox() {
		fromBox.click();
	}

	public void insertIntoFromBox(String fromCity) {
		fromBox.sendKeys(fromCity);
	}

	public void pressDownFromBoxResults(int times) {
		for (int i = 0; i < times; i++) {
			fromBox.sendKeys(Keys.ARROW_DOWN);
		}
	}

	public void pressEnterOnFromBox() {
		fromBox.sendKeys(Keys.ENTER);
	}
	
	public void insertIntoToBox(String destinationCity) {
		toBox.sendKeys(destinationCity);
	}
	
	public void pressEnterOnToBox() {
		toBox.sendKeys(Keys.ENTER);
	}
	
	public void selectCurDateForDeparture() {
		currentDateOnDeparture.click();
	}
	
	public void selectFiveDaysLaterForReturn() {
		fiveDaysInFutureDate.click();
	}
	
	public void clickTravellerBtn() {
		travellerBtn.click();
	}
	
	public void addSeniors(int numberOfSeniors) {
		for(int i=0; i<numberOfSeniors; i++) {
			addSeniorsBtn.click();
		}
	}
	
	public void addChildren(int numerOfChildren) {
		for(int i=0; i<numerOfChildren; i++) {
			addChildBtn.click();
		}
	}
	
	public void selectChild1Age(String age) {
		Select child1Age = new Select(child1AgeDrpDown);
		child1Age.selectByValue(age);
	}
	
	public void addInfants(int numerOfInfants) {
		for(int i=0; i<numerOfInfants; i++) {
			addInfantBtn.click();
		}
	}
	
	public void selectClass(String classValue) {
		Select classDrp = new Select(classDrpDown);
		classDrp.selectByValue(classValue);
	}
	
	public void clickCloseDialogueBtn() {
		closeDialogueBtn.click();
	}
	
	public void clickSeachNowBtn() {
		searchNowBtn.click();
	}
}
