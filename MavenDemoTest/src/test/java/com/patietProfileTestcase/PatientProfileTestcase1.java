package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase1 extends patientLogin{
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver,PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
		patient.more.click();
	if(	patient.firstname.isDisplayed() && patient.lastname.isDisplayed() && patient.phone.isDisplayed()&& 
		patient.phone.isDisplayed() && 
		patient.insurance.isDisplayed()  &&
		patient.title.isDisplayed() &&
		patient.suffix.isDisplayed() &&
		patient.middlename.isDisplayed() &&
		patient.id.isDisplayed() )
	{
		System.out.println("person name email box has displays the following option email, first name,last name, mobile number, title,suffix, middle name");

	}
		
}
}