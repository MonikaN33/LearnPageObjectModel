package serviceNowBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseServiceNow
{
	protected static ChromeDriver driver;
	
	@BeforeMethod
	public void openchrome()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev78844.service-now.com/navpage.do");
	}
	
	/*
	 * @AfterMethod public void closechrome() { driver.quit(); }
	 */

}
