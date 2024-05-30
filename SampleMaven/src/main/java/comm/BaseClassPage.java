package comm;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClassPage
{
	public WebDriver driver=null;
	
	public FileUtility futlis=new FileUtility();
	public WebDriverUtility wutlis= new WebDriverUtility();

@BeforeClass
public void launchBrowser() throws IOException
{
	String BROWSER = futlis.readDataFromPropertyFile("browser");
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver(wutlis.handleNotificationBychromeOption());
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		Reporter.log("---invalid browser---",true);
	}
	wutlis.maximizebroswer(driver);
}
@AfterClass
public void closeBrowser()
{
	driver.quit();
	Reporter.log("---close browser---",true);
}


}
