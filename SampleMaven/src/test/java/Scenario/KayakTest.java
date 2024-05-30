package Scenario;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.BookingPage;
import POM.HomePage;
import comm.BaseClassPage;

public class KayakTest extends BaseClassPage
{
	
	@Test
	public void script() throws IOException, InterruptedException
	{
		HomePage homePage=new HomePage(driver);
		BookingPage bookpage=new BookingPage(driver);
		String URL = futlis.readDataFromPropertyFile("url");
		wutlis.waitPageLoad(driver, 40);
		driver.get(URL);
		Thread.sleep(3000);
		homePage.tripselect();
		wutlis.scrollclick(driver);
		homePage.selectFlight("Bengaluru","mumbai");
		Thread.sleep(5000);
		wutlis.switchToWindow(driver, "Book now");
		Thread.sleep(5000);
		WebElement ele = bookpage.getClearall();
		wutlis.scrollToElement(driver, ele);
		ele.click();
		bookpage.getAirind().click();
		Thread.sleep(3000);
		System.out.println(bookpage.getFirstprice().getText());
	}
}
