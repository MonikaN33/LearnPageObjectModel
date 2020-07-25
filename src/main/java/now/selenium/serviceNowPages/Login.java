package now.selenium.serviceNowPages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import serviceNowBase.BaseServiceNow;

public class Login extends BaseServiceNow
{

	
	public Login enterUserName(String username)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleIs("Home | ServiceNow Developers"));
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys(username);
		return this;
	}
	
	public Login password(String password)
	{
		driver.findElementById("user_password").sendKeys(password);
		return this;
	}
	
	public Dashboard clicklogin()
	{
		driver.findElementById("sysverb_login").click();
		return new Dashboard();
	}

}
