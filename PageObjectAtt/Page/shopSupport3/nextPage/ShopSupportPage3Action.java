package shopSupport3.nextPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commenPackage.WebButton;

public class ShopSupportPage3Action {
	public WebDriver driver;
	public ShopSupportPage3Locator pl3;
public ShopSupportPage3Action(WebDriver driver) {
	this.driver=driver;
	pl3=new ShopSupportPage3Locator(driver);
	
}
public void clickManufacturer() {
	WebElement ele=	pl3.getManufacturer();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
}
public void clickSamsungRedio() {
	WebElement ele=	pl3.getSamsungRedio();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
	

}
}
