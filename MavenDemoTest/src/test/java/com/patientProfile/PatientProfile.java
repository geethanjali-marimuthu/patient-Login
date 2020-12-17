package com.patientProfile;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatientProfile {
	 WebDriver driver;
	 public PatientProfile(WebDriver driver) {
			this.driver = driver;
		}
	 @FindBy(how = How.XPATH, using = "//td[contains(text(),'Settings')]")
		public WebElement settings;
	 @FindBy(how = How.XPATH, using = "//button[contains(text(),'Manage your Account')]")
		public WebElement manageaccount;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/div[1]/div[7]/span[1]")
		public WebElement edit;
	 @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
		public WebElement firstname;
	 @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
		public WebElement lastname;
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]/div[1]/div[6]/div[6]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[9]/div[1]/div[1]/input[1]")
		public WebElement phone;
	 @FindBy(how = How.XPATH, using = "//input[@id='national-id']")
		public WebElement id;
	 @FindBy(how = How.XPATH, using = "//textarea[@id='insurance-info']")
		public WebElement insurance;
	 @FindBy(how = How.XPATH, using = "//div[@id='person-name-email']//div[@class='col-xs-12']//div[@style='position: relative; float: left; width: 100%;']//div[@id='form']//div[@class='form-pop-body']//div[@class='form-group']//div[@class='col-xs-6']//div[@id='save-btn']")
		public WebElement save;
	 @FindBy(how = How.XPATH, using = "//div[@id='person-name-email']//div[@class='col-xs-12']//div[@style='position: relative; float: left; width: 100%;']//div[@id='form']//div[@class='form-pop-body']//div[@class='form-group']//div[@id='add_more']//div[@class='btn-group dropup']//button[@type='button'][contains(text(),'More')]")
		public WebElement more;
	 @FindBy(how = How.XPATH, using = "//a[@id='a-title']")
		public WebElement title;
	 @FindBy(how = How.XPATH, using = "//select[@id='title']")
		public WebElement title1;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Middle Name')]")
		public WebElement middlename;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Suffix')]")
		public WebElement suffix;
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Previous Name')]")
		public WebElement previousname;
	
	 @FindBy(how = How.CSS, using = "div.col-xs-6.col-xs-offset-right-2")
		public WebElement tooltip ;
	@FindBy(how = How.CSS, using = ".col-xs-8.col-xs-offset-right-2")
		public List<WebElement> tooltip1 ;
	 @FindBy(how = How.XPATH, using = "//div[@id='p_suffix']//div[@class='hover-show col-xs-2']//div[@id='remove-field']")
		public WebElement  remove;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Active data exists, double click to remove field')]")
		public WebElement Activedata;
	/* @FindBy(how = How.XPATH, using = "")
		public WebElement ;*/
	 
}
