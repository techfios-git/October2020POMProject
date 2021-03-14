package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Lib
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHOME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement CUNTRY_FIELD_LOCATOR;


	// Interactive methods
	public void insertFullName(String fullName) {
		
		int generatedNubmer = randomGenerator(999);
		USERNAME_FIELD_LOCATOR.sendKeys(fullName + generatedNubmer);
	}


	public void chooseCompanyOption(String company) {
			
		selectDropDown(COMPANY_FIELD_LOCATOR, company);
		
	}
	
	public void insertEmail(String email) {
		int generatedNubmer = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatedNubmer + email);
	}
	
	public void insertPhoneNumber(String phone) {
		int generatedNubmer = randomGenerator(999);
		PHOME_FIELD_LOCATOR.sendKeys(generatedNubmer + phone);
	}
	
	public void chooseCountryOption(String country) {
		selectDropDown(CUNTRY_FIELD_LOCATOR, country);
	}
	

}
