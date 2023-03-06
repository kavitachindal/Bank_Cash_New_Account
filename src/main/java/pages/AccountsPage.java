package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountsPage {
WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]") WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]") WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]") WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]") WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]") WebElement INTERNETBANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/h5") WebElement MANAGE_ACCOUNT_ELEMENT;
	
	
	public void insertAccountTitle(String accountTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(accountTitle);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
}
	
	public void insertInitialBalance(String initialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
}
	
	public void insertAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
}
	
	public void insertContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
}
	
	public void insertPhone(String Phone) {
		PHONE_ELEMENT.sendKeys(Phone);
}
	
	public void insertInternetBankingURL(String internetBankingURL) {
		INTERNETBANKING_URL_ELEMENT.sendKeys(internetBankingURL);
}
	
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}