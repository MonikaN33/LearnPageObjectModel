package now.selenium.test;

import org.testng.annotations.Test;

import now.selenium.serviceNowPages.Login;
import serviceNowBase.BaseServiceNow;

public class TC002CreateIncident extends BaseServiceNow
{

	@Test
	public void create()
	{
		
		new Login()
		.enterUserName("admin")
		.password("Servicenow#33")
		.clicklogin()
		.search();
		
		System.out.println("Validation completed...");
		
		
		
		
	}
}
