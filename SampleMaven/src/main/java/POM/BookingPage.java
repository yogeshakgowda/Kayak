package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	@FindBy(xpath="//div[text()='Clear all']")
	private WebElement clearall;
	
	@FindBy(xpath="(//div[@class=\"btf6-container\"]/ancestor::div[@class=\"nrc6-inner\"]/div[@class=\"nrc6-price-section\"]/descendant::div[@class='f8F1-price-text'])[1]")
	private WebElement firstprice;
	
	@FindBy(xpath="//div[text()='Air India']")
	private WebElement airind;
	
	
	public BookingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getClearall() {
		return clearall;
	}

	public WebElement getFirstprice() {
		return firstprice;
	}

	public WebElement getAirind() {
		return airind;
	}
	
}


