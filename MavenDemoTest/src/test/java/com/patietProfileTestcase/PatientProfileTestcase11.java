package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase11 extends patientLogin{
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver,PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
	    patient.more.click();
	   if( patient.title.isDisplayed() && patient.suffix.isDisplayed() && patient.previousname.isDisplayed()
	 && patient.middlename.isDisplayed())
	   {
		   System.out.println("The following options are display under the more option in Person name module in Patient's Profile page1.Title 2.Middle Name 3.Suffix 4.Previous name");
	   }
}
}