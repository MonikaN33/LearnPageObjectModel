package now.selenium.test;

import org.testng.annotations.Test;

import now.selenium.serviceNowPages.Login;
import serviceNowBase.BaseServiceNow;

public class TC001ProfileChange extends BaseServiceNow
{

	@Test
	public void profile()
	{
		/*
		 * Login login = new Login(); login.enterUserName("admin");
		 * login.password("Servicenow#33"); login.clicklogin();
		 */
		
		new Login()
		.enterUserName("admin")
		.password("Servicenow#33")
		.clicklogin()
		.clickUserMenu()
		.logout();
		
		
		
		
		
		
		
		
		
	}
}
