package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.WebDriverUtility;

public class HomePage 
{
	@FindBy(xpath="//span[text()='Return']")
	private WebElement trip;

	@FindBy(xpath="//li[@aria-label='One-way']")
	private WebElement single_trip;


	@FindBy(xpath="//span[text()='1 adult']")
	private WebElement single1adult;


	@FindBy(xpath="//input[@aria-label='Adults']/following-sibling::button[@aria-label='Increment']")
	private WebElement incrementadult;


	@FindBy(xpath="//span[.='Economy']")
	private WebElement Economy;


	@FindBy(xpath="//li[@aria-label='Business']")
	private WebElement businessclass;


	@FindBy(xpath="//div[@class='c_neb-item-close']")
	private WebElement fromcancel;

	@FindBy(xpath="//input[@placeholder='From?']")
	private WebElement fromtext;

	@FindBy(xpath="//input[@placeholder='To?']")
	private WebElement Totext;

	@FindBy(xpath="//div[@class='SVL4-button-content']")
	private WebElement date;

	@FindBy(xpath="//caption[text()='June 2024']/../tbody/tr/descendant::div[text()='19']")
	private WebElement particulardate;

	@FindBy(xpath="//button[@aria-label='Search']")
	private WebElement search;

@FindBy(xpath="//span[text()='Bengaluru, Karnataka, India']")
private WebElement partcity;

@FindBy(xpath="//span[text()='Mumbai, Maharashtra, India']")
private WebElement tocity;

@FindBy(xpath="//div[@class='zEiP-formField zEiP-destination']/descendant::div[@class='c_neb-item-close']")
private WebElement tocitycan;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}

	public WebElement getTrip() {
		return trip;
	}



	public WebElement getSingle_trip() {
		return single_trip;
	}



	public WebElement getSingle1adult() {
		return single1adult;
	}



	public WebElement getIncrementadult() {
		return incrementadult;
	}



	public WebElement getEconomy() {
		return Economy;
	}



	public WebElement getBusinessclass() {
		return businessclass;
	}



	public WebElement getFromcancel() {
		return fromcancel;
	}



	public WebElement getFromtext() {
		return fromtext;
	}



	public WebElement getTotext() {
		return Totext;
	}



	public WebElement getDate() {
		return date;
	}



	public WebElement getParticulardate() {
		return particulardate;
	}

	public WebElement getSearch() {
		return search;
	}
	

	public WebElement getPartcity() {
		return partcity;
	}
	

	public WebElement getTocity() {
		return tocity;
	}

	public WebElement getTocitycan() {
		return tocitycan;
	}

	public void tripselect()
	{
		trip.click();
		single_trip.click();
		single1adult.click();
		incrementadult.click();
	}
	public void selectFlight(String fromtxt,String Totxt) throws InterruptedException
	{
		Economy.click();
		businessclass.click();
		fromcancel.click();
		fromtext.sendKeys(fromtxt);
		Thread.sleep(10000);
		partcity.click();
		Thread.sleep(3000);
		//tocitycan.click();
		Totext.sendKeys(Totxt);
		Thread.sleep(10000);
		tocity.click();
		date.click();
		particulardate.click();
		search.click();
	}

}
