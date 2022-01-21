package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuyPage {
	
	private WebDriver driver;
    
	  
	  //Locators
	  @FindBy(xpath = "//a/img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	  private WebElement UsLink;
	  
	  //@FindBy(xpath = "//label[@for='input-894e7898-2f61-440e-9555-de57c05b19f1']")
	  //WebElement SendEmail;
	  @FindBy(xpath ="//button[@class='c-close-icon c-modal-close-icon']")
	  private WebElement CloseMarAdd;
	  
	  
	  @FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	  private WebElement MenuNavigationBtn;
	  @FindBy(xpath = "//li[@class='liDropdownList '][3]")
	  private WebElement MenuDropDown;
	  @FindBy(css = "a[data-lid='ubr_shp_apl']")
	  private WebElement appleBox;
	  @FindBy(xpath ="//div/h2/a[@href='/site/misc/same-day-delivery/pcmcat748300518938.c?id=pcmcat748300518938']")
	  private WebElement sameDayDelivery;
	  @FindBy(xpath = "//input[@class='tb-input ']")
	  private WebElement insertZipCode;
	  @FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-md zipcode__lookup__submit-button']")
	  private WebElement submitZipCode;
	  @FindBy(xpath = "//a[text()='Shop Best Buy']")
	  private WebElement shopBestBuy;
	  @FindBy(xpath = "//a[text()='Apple']")
	  private WebElement appleIcon;
	  @FindBy(xpath = "//h2[@id='wf-offer-536f8134-3a61-4080-88ec-cafb25f9d9dc-product-title']")
	  private WebElement saveIphone13Pro;
	  
	  // Constructor
	    
	  public BestBuyPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver,this);
	  }
	  
	  // Actions
	  public void SelectBestBuyUsLink() {
	    UsLink.click();
	  }

	  // public void swithcToAlert() {
	  // Alert alert = driver.switchTo().alert();
	  // alert.sendKeys("jamabrook1@gmail.com");
	  // }
	  // public void SendEmailAdd() {
	  // SendEmail.sendKeys("jamabrook1@gmail.com");
	  // }
	  public void closeMarAdd() {
	    CloseMarAdd.click();
	  }

	  public void clickMenuNavigatBtn() {
	    MenuNavigationBtn.click();

	  }

	  public void clickMenuDropDown() {
	    MenuDropDown.click();
	  }

	  public void selectBrandsApple() {
	    appleBox.click();
	    driver.navigate().refresh();
	    
	  }
	  public void clickSameDayDel(){
	    
	    driver.navigate().refresh();
	    sameDayDelivery.click();
	  }
	  public void insertZipCode(int zipcode ) {
	    insertZipCode.sendKeys("11223");
	  }
	  public void clickSubmitZipCode() {
	    submitZipCode.click();
	  }
	  public void clickShopBestBuy() {
	    shopBestBuy.click();
	  }
	  public void clickAppleIcon() {
	    driver.navigate().refresh();
	    appleIcon.click();
	  }
	  public void clickSaveUpToIphone13Pro() {
	    saveIphone13Pro.click();
	  }


}
