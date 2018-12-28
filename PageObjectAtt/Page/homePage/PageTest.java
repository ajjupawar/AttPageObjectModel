package homePage;

import org.testng.annotations.Test;

import helperPackage.BrowserConfiguration;
import shopSupport.nextPage.ShopSupportPage2Verify;
import shopSupport3.nextPage.ShopSupportPage3Verify;
import utility.TestBase;

public class PageTest extends TestBase {
	
public BrowserConfiguration br; 
 
	
	public PageTest() {
	
		 
	      br=new BrowserConfiguration();
	      TestBase ul=new TestBase();
	      

	}
	
	
  @Test
  public void shopSupport() {
	  PageVerify pv=new PageVerify(driver);
	  pv.verifyShopSupport();
	  ShopSupportPage2Verify pv2=new ShopSupportPage2Verify(driver);
	 pv2.verifyWireless2();
	 pv2.verifyPhoneTablet();
	 ShopSupportPage3Verify pv3=new ShopSupportPage3Verify(driver);
	 pv3.verifyManufacturer();
	 pv3.verifySamsungRedio();
	/* String str=driver.getTitle();
	 System.out.println("Title is equals to ="+str);
*/  }
 /* @Test
  public void attHome() {
	  PageVerify pv=new PageVerify(driver);
	  pv.verifyAttHome();
  }*/
}
