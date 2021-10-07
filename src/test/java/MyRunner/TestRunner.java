package MyRunner;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;


//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		stepNotifications = true,
//		monochrome = true,
//		dryRun = false,
//		features = "./src/test/java/Features",  // we can pass a file name if we want to only execute a file else 
//												// pass the package level directory to execute all the 
//		glue = "StepDefinition",	// a parameter to define where your stepdefinition file is located
//		plugin = {"pretty", "html:Reports/HTMLReport.html", "json:Reports/JSON Report.json", "junit: Reports/Junit Report.xml"}
//
//)
//
//public class TestRunner {
//
//}


//For cucumber testng
//@CucumberOptions(
//	features = "./src/test/java/Features",
//	dryRun = false,// checks if each step is mapped with a method
//	glue = "stepDefinition"
//)
//public class RunnerTest extends AbstractTestNGCucumberTests {
//
//}


@CucumberOptions(
		//stepNotifications = true,
		monochrome = true,
		dryRun = false,
		features = "./src/test/java/Features", 
		glue = "StepDefinition",
		plugin = {"pretty", "html:Reports/HTMLReport.html", "json:target/cucumber.json", "junit: Report/Junit Report.xml"}

)

public class TestRunner  extends AbstractTestNGCucumberTests  {

//	@DataProvider
//	public Object[][] getScenarios() {
//		return super.scenarios();
//	}
}
