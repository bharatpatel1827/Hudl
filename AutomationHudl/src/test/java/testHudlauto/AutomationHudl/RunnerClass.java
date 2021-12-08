package testHudlauto.AutomationHudl;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Hudl.feature", glue="testHudlauto.AutomationHudl", 
					tags= 	"@runalltest",
							
					plugin= {"pretty", "html:target/cucumber-reports/cucumber-pretty",
			                		   "json:target/cucumber-reports/CucumberTestReport.json",
			                		   "rerun:target/cucumber-reports/rerun.txt"})
public class RunnerClass extends AbstractTestNGCucumberTests {

}
