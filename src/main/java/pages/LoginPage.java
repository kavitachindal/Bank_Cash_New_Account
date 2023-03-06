package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH , using = "/html/body/div/div/div/form/div[3]/button") WebElement LOGIN_BUTTON_ELEMENT;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BANKCASH_ELEMENT;
	@FindBy(how = How.XPATH , using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement NEWACCOUNT_ELEMENT;
	
	
	//Intractable methods
	public void insertUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnSigninButton() {
		LOGIN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle(); //dashboard page
	}
	
	public void clicksonbankCash() {
		BANKCASH_ELEMENT.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clicksonnewAccount() {
		NEWACCOUNT_ELEMENT.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


