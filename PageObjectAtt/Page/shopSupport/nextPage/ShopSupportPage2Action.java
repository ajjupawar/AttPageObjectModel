package shopSupport.nextPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commenPackage.WebButton;

public class ShopSupportPage2Action {
	public WebDriver driver;
	public ShopSupportPage2Locator pl2;
public ShopSupportPage2Action(WebDriver driver) {
	this.driver=driver;
	pl2=new ShopSupportPage2Locator(driver);
	
}
public void clickWireless2() {
	WebElement ele=	pl2.getWireless2();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
}
public void clickPhoneTablet() {
	WebElement ele=	pl2.getPhoneTablet();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
	

}
}
