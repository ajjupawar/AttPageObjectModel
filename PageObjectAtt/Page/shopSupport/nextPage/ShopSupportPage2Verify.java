package shopSupport.nextPage;

import org.openqa.selenium.WebDriver;

public class ShopSupportPage2Verify {
	public WebDriver driver=null;
    public ShopSupportPage2Action pa2;
    public ShopSupportPage2Verify(WebDriver driver) {
		this.driver=driver;
		pa2=new ShopSupportPage2Action(driver);
	}

    public void verifyWireless2() {
		pa2.clickWireless2();

	}
    public void verifyPhoneTablet() {
		pa2.clickPhoneTablet();
	}
    
}
