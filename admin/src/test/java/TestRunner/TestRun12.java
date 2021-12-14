package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
   //features="C:/Users/Shreya/eclipse-workspace/admin/src/test/java/Features/login12.feature",
		features = "C:/Users/Shreya/eclipse-workspace/admin/src/test/java/Features/Customer.feature",
   glue = "StepDefinations",
   dryRun = false,
   monochrome= true,
   plugin= {"pretty","html:test-output"}
)


public class TestRun12
{
	
} 


