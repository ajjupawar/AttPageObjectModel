package homePage;

import org.openqa.selenium.WebDriver;

public class PageVerify {
	public WebDriver driver=null;
    public PageAction pa;
    public PageVerify(WebDriver driver) {
		this.driver=driver;
		pa=new PageAction(driver);
	}
    
    public void verifyShopSupport() {
		pa.clickShopSupport();

	}
    public void verifyAttHome() {
  		pa.clickAttHome();

  	}
    public void verifyDeals() {
  		pa.clickDeals();

  	}
    public void verifyPhones() {
  		pa.clickPhones();

  	}
    
    public void verifyWireless() {
  		pa.clickWireless();

  	}
    public void verifyTV() {
  		pa.clickTV();

  	}
    public void verifyInternet() {
  		pa.clickInternet();

  	}
    public void verifyBundles() {
  		pa.clickBundles();

  	}
    public void verifyAccessoies() {
  		pa.clickAccessories();

  	}
    public void verifyBusiness() {
  		pa.clickBusiness();

  	}
    public void verifySignIn() {
  		pa.clickSignIn();

  	}
    public void verifySearchBox(String str) {
  		pa.clickSearchBox(str);

  	}
    public void verifyGetconnected() {
  		pa.clickGetconnected();

  	}
    public void verifyButton() {
  		pa.clickButton();

  	}










}
