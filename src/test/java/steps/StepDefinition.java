package steps;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountsPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	LoginPage loginPage;
	AccountsPage accountsPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		accountsPage = PageFactory.initElements(driver, AccountsPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String logininfo, String field) {
		if (field.equalsIgnoreCase("username")) {
			loginPage.insertUserName(logininfo);
		} else if (field.equalsIgnoreCase("password")) {
			loginPage.insertPassword(logininfo);
		} else {
			System.out.println("Invalid login information");
		}
	}

	
	@And("User clicks on {string}")
	public void user_clicks_on(String button) {
		if (button.equalsIgnoreCase("login")) {
			loginPage.clickOnSigninButton();
		} else if (button.equalsIgnoreCase("bankCash")) {
			loginPage.clicksonbankCash();
		} else if (button.equalsIgnoreCase("newAccount")) {
			loginPage.clicksonnewAccount();
		}else if (button.equalsIgnoreCase("submit")) {
			accountsPage.clickOnSubmitButton();
		}else {
			System.out.println("Wrong information");
		}
	}

	
	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	
	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountinfo, String field) {
		switch (field) {

		case "accountTitle":
			accountsPage.insertAccountTitle(accountinfo + generatedNum);
			break;

		case "description":
			accountsPage.insertDescription(accountinfo + generatedNum);
			break;

		case "initialBalance":
			accountsPage.insertInitialBalance(accountinfo);
			break;

		case "accountNumber":
			accountsPage.insertAccountNumber(accountinfo);
			break;

		case "contactPerson":
			accountsPage.insertContactPerson(accountinfo + generatedNum);
			break;

		case "Phone":
			accountsPage.insertPhone(accountinfo + generatedNum);
			break;

		case "internetBankingURL":
			accountsPage.insertInternetBankingURL(accountinfo+ generatedNum);
			break;

		default:
			System.out.println("Wrong credentials:" + accountinfo);
		}
	}

	Random rnd = new Random(); //for Random Number generation/generator.
	int generatedNum = rnd.nextInt(999);

	
	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = accountsPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

//	@After
//	public void tearDown() {
//		driver.close();//close the browser
//		driver.quit();//quit the driver
//	}
}
