package pages;

import org.openqa.selenium.By;

import wrappers.Annotations;

public class CreateLead extends Annotations {
	public CreateLead enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
		public CreateLead enterLastName(String data) {
			driver.findElementById("createLeadForm_lastName").sendKeys(data);
			return this;
		}
	
		public CreateLead enterCompanyName (String data) {
			driver.findElementById("createLeadForm_companyName").sendKeys(data);
			return this;
		}
        
		public ViewLead clickCreateLead (String date) {
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
            return new ViewLead();
}
}
