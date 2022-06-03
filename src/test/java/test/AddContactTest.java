package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 loginPage.insertUserName("demo@techfios.com");
		 loginPage.insertPassword("abc123");
		 loginPage.performSignin();
		 
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage("Dashboard");
		 dashboardPage.clickCustomerMenuButton();
		 dashboardPage.clickAddCustomerMenuButton();
		 
		 AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		 addContactPage.valiadateAddContactPage("Add Contact");
		 addContactPage.insertFullName("December Selenium");
		 addContactPage.selectCompany("Techfios");
		 addContactPage.insertEmail("abc@techfios.com");
		 addContactPage.insertPhone("1234567");
		 addContactPage.insertaddress(" CountryManorWay");
		
	}

	
}
