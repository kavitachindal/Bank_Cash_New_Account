package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features\\BankandCashNewAccount.feature",
		glue ="steps",
		//tags = "",
		monochrome =true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/reports/cucumber.html",
				   "json:target/reports/cucumber.json"
		}
		)
public class LoginRunner {

}
