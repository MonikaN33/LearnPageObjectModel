package now.selenium.serviceNowPages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import serviceNowBase.BaseServiceNow;

public class Dashboard extends BaseServiceNow
{

	public void search()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleIs("System Administration | ServiceNow"));
		driver.findElementByXPath("//input[@placeholder='Filter navigator']").sendKeys("incident");
		driver.findElementByXPath("//div[@class='sn-widget-list-title' and text()='Create New']").click();
		
	}
	
	public Dashboard clickUserMenu() 
	{
		driver.findElementByCssSelector("#user_info_dropdown").click();
		return this;
	}
	
	public void logout() 
	{
		driver.findElementByLinkText("Logout").click();
	}
	
}
