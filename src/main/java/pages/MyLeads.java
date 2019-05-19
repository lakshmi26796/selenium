package pages;

import wrappers.Annotations;

public class MyLeads extends Annotations {
	public CreateLead clickCreateLeads() {
		driver.findElementByLinkText("Leads").click();
		return new CreateLead();
	
}
}