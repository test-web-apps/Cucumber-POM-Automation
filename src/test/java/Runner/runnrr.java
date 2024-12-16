package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "/BDDFramework/src/test/java/Feature/task.feature",
		glue="stepDefinitions",
		dryRun=true,
		plugin={"pretty", "html:target/cucumber.reports", "json:target/cucumber.json"},
		monochrome= true,
		publish = true
	)
	public class runnrr extends AbstractTestNGCucumberTests{
	}
	
