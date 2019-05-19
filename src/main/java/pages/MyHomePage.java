package pages;

import wrappers.Annotations;

public class MyHomePage extends Annotations{
	public MyLeads clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();


	}
}

