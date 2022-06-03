package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	 
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		//create object or by name of the class
		//to interact driver with BrowserFactory 
		 driver = BrowserFactory.init();
		 
		 //to interact with loginpage
		 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 loginPage.insertUserName("demo@techfios.com");
		 loginPage.insertPassword("abc123");
		 loginPage.performSignin();
		 
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage("Dashboard");
		 
		 BrowserFactory.tearDown();
			 
		 
		
	}

}
