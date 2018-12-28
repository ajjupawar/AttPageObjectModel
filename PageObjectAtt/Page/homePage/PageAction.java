package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commenPackage.WebButton;
import commenPackage.WebTextbox;

public class PageAction {
	public WebDriver driver;
	public PageLocator pl;
public PageAction(WebDriver driver) {
	this.driver=driver;
	pl=new PageLocator(driver);
}

public void clickShopSupport() {
	WebElement ele=	pl.getShopSupport();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
	
	}
public void clickAttHome() {
	WebElement ele=pl.getAttHome();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}

public void clickDeals() {
	WebElement ele=pl.getDeals();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}

public void clickPhones() {
	WebElement ele=pl.getPhones();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickWireless() {
	WebElement ele=pl.getWireLess();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickTV() {
	WebElement ele=pl.getTV();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickInternet() {
	WebElement ele=pl.getInternet();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickBundles() {
	WebElement ele=pl.getBundles();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickAccessories() {
	WebElement ele=pl.getAccessories();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}

public void clickBusiness() {
	WebElement ele=pl.getBusiness();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickSignIn() {
	WebElement ele=pl.getSignIn();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickSearchBox(String str) {
	WebElement ele=pl.getSearchBox();
	if(ele!=null){
		if(WebTextbox.isEnable(ele)){
			WebTextbox.sendInput(ele, str);;
		}
	}	
}
public void clickGetconnected() {
	WebElement ele=pl.getGetconnected();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}	
}
public void clickButton() {
	WebElement ele=pl.getButton();
	if(ele!=null){
		if(WebButton.isEnable(ele)){
			WebButton.clickButton(ele);
		}
	}
}





}



