package shopSupport3.nextPage;

import org.openqa.selenium.WebDriver;

public class ShopSupportPage3Verify {
	public WebDriver driver=null;
    public ShopSupportPage3Action pa3;
    public ShopSupportPage3Verify(WebDriver driver) {
		this.driver=driver;
		pa3=new ShopSupportPage3Action(driver);
	}

    public void verifyManufacturer() {
		pa3.clickManufacturer();

	}
    public void verifySamsungRedio() {
		pa3.clickSamsungRedio();
	}
    
}
