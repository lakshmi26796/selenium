package pages;

import wrappers.Annotations;

public class ViewLead extends Annotations {
	public ViewLead verifyFirstName(String data) {
		String Firstname = driver.findElementById("viewLead_firstName_sp").getText();
		if(Firstname.contains(data)) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		return this;
	
	}
}
