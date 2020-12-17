package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase13 extends patientLogin{
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
	List<WebElement> t=s.getOptions();
	Iterator<WebElement> g=t.iterator();
	while(g.hasNext())
	{
	System.out.println(	g.next().getText());
	}
	System.out.println("the following options are display under the title dropdown1. Mr2. Mrs3. Ms 4. Dr 5. Capts 6. Prof7. Col");
}
}