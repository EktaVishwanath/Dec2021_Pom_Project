package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//need constructor to get LoginTest WebDriver to this class driver
	public LoginPage(WebDriver driver) {
		
	//to establish relationship between loginTest driver & loginPage driver
		this.driver = driver;
	
	}
	
	//Element list
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	
	//Interactable methods
	public void insertUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void performSignin() {
		SIGNIN_ELEMENT.click();
	}
	
	public void performLogin(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();
	}

}
