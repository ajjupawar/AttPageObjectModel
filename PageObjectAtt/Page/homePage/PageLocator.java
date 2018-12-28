package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocator {

	public WebDriver driver;
	public PageLocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy (xpath="//*[contains(text(),'Shop & support')][1]")
	private WebElement ShopSupport;
	
	
	public WebElement getShopSupport() {
		return ShopSupport;
	}
	
	@FindBy (css="i#z1-globe-md")
	private WebElement AttHome;
	
	public WebElement getAttHome() {
		return AttHome;
	}
	
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Deals']")
	private WebElement Deals;
	
	public WebElement getDeals() {
		return Deals;
	}
	
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Phones']")
	private WebElement Phones;
	
	public WebElement getPhones() {
		return Phones;
	}
	
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Wireless']")
	private WebElement WireLess;
	
	public WebElement getWireLess() {
		return WireLess;
	}
	
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='TV']")
	private WebElement TV;
	
	public WebElement getTV() {
		return TV;
	}
	
	@FindBy(xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Internet']")
	private WebElement Internet;
	
	public WebElement getInternet() {
		return Internet;
	}
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Bundles']")
	private WebElement Bundles;
	
	public WebElement getBundles() {
		return Bundles;
	}
	@FindBy (xpath="(//span[@class='HeadBand__content Label__medium '])[text()='Accessories']")
	private WebElement Accessories;
	
	public WebElement getAccessories() {
		return Accessories;
	}
	@FindBy (xpath="(//a[@class='watch-tv-link'])[text()='Business']")
	private WebElement Business;
	public WebElement getBusiness() {
		return Business;
	}
	
	@FindBy (xpath="(//span[@class='z1-profile-text hide-xsm hide-sm hide-md'])[text()='Sign in']")
	private WebElement SignIn;
	
	public WebElement getSignIn() {
		return SignIn;
	}
	@FindBy (id="z1-searchfield")
	private WebElement SearchBox;
	
	public WebElement getSearchBox() {
		return SearchBox;
	}
	
	@FindBy (xpath="//a[contains(text(),'GET CONNECTED')]")
	private WebElement Getconnected;
	
	public WebElement getGetconnected() {
		return Getconnected;
	}
	
	@FindBy (xpath="//button[@class='btn-search']")
	private WebElement Button;
	public WebElement getButton() {
		return Button;
	}
	
}
