package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddContactPage extends BasePage{
	
WebDriver driver;
	
	//need constructor to get LoginTest WebDriver to this class driver
	public AddContactPage(WebDriver driver) {
		//to establish relationship between loginTest driver & Dashboard driver
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using = "//h5[contains(text(),'Add Contact')]") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@id='cid']") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@id='phone']") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
	
	public void valiadateAddContactPage(String addContact) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong Page!!");
	}
	
	public void insertFullName(String fullname) {
		FULL_NAME_ELEMENT.sendKeys(fullname + generateRandomNo(999));
	}
	
	public void selectCompany(String company)  {
		selectFromDropdown(COMPANY_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999) + email);
	}
	
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(generateRandomNo(999) + phone);
	}
	
	public void insertaddress(String address) {
		ADDRESS_ELEMENT.sendKeys(generateRandomNo(999) + address);
	}
	
	
}
