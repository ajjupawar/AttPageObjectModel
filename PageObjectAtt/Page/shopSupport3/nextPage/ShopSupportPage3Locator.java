package shopSupport3.nextPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopSupportPage3Locator {
	public WebDriver driver;
	public ShopSupportPage3Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy (xpath="//*[@id='div_taxoManu']/div[1]/form/h2/span")
	private WebElement Manufacturer;
	
	public WebElement getManufacturer() {
		return Manufacturer;
	}
	
	@FindBy (css="input#taxoManu3")
	private WebElement SamsungRedio;
	
	public WebElement getSamsungRedio() {
		return SamsungRedio;
	}
	

}
