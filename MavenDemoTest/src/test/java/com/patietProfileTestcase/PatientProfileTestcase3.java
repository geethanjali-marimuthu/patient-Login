package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase3 extends patientLogin{
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver, PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
        patient.phone.clear();
		patient.id.clear();
		patient.insurance.clear();
		patient.save.click();
		System.out.println(" user able to save person name and following options without these fields 1.mobile number 2.ID 3.Insurance");
		
	
		
}
}