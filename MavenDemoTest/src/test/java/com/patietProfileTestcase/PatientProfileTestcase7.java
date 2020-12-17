package com.patietProfileTestcase;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientRateus.RateUs;
import com.patientLogin.patientLogin;
import com.patientProfile.PatientProfile;

public class PatientProfileTestcase7 extends patientLogin{
	
	@Test
	public void profile() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PatientProfile patient = PageFactory.initElements(driver,PatientProfile.class);
		Thread.sleep(8000);

		patient.settings.click();
		patient.manageaccount.click();
		patient.edit.click();
		List<WebElement> tt=driver.findElements(By.cssSelector("div.col-xs-6.col-xs-offset-right-2"));
	for(int i=0;i<tt.size();i++)
	{
		String s= tt.get(i).getAttribute("title");
		
		if(s.equalsIgnoreCase("Enter Patient's Last Name"))
		{
			System.out.println("Enter Patient's Last Name tooltip is showing");
		}
		
	
	}
	}
}
	
		

