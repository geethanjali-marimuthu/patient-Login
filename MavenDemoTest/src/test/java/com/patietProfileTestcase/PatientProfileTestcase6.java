package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase6 extends patientLogin{
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver,PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
		patient.lastname.clear();
		patient.lastname.sendKeys("patient");
		System.out.println("user able to enter last name in the lastname field.");
	
	
		
}
}