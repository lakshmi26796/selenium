package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import pages.ViewLead;
import wrappers.Annotations;

public class TC002flow extends Annotations {

	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void flow (String FirstName, String LastName, String CompanyName ) {
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLoginButton();
		new HomePage()
		.clickCrmSfa();
		
	    new MyHomePage()
	    .clickLeads();
	   
		new MyLeads()
	    .clickCreateLeads();
	  
	    new CreateLead()
	    .enterFirstName(FirstName)
	    .enterLastName(LastName)
	    .enterCompanyName(CompanyName);
	    
	
	
	
}
	
}