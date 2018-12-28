package shopSupport.nextPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopSupportPage2Locator {
	public WebDriver driver;
	public ShopSupportPage2Locator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy (xpath="//span[@class='auth-pull-left'][text()='Wireless']")
	private WebElement Wireless2;
	
	public WebElement getWireless2() {
		return Wireless2;
	}
	
	@FindBy (xpath="//span[@class='auth-pull-left'][text()='Phones & tablets']")
	private WebElement PhoneTablet;
	
	public WebElement getPhoneTablet() {
		return PhoneTablet;
	}
	

}
