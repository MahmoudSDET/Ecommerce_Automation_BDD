package testrunners;




import driverhandling.DriverFactory;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepDefinitions", "AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

				
		}
		
		)

public class MyTestRunner extends DriverFactory{
	
	

}
