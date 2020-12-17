package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase16 extends patientLogin{
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver,PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
		patient.more.click();
		patient.title.click();
	Select s= new Select(patient.title1);
	s.selectByIndex(1);
	Actions a = new Actions(driver);
    a.moveToElement(patient.remove).doubleClick().build().perform();
    Thread.sleep(3000);
	
}
}