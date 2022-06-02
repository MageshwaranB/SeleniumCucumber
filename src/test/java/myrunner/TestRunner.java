package myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	monochrome = true,
					features = "./src/test/java/features/swaglogin.feature", 
					plugin = {"pretty", "html:target/html-reports", "json:target/cucumber.json"},
					glue = "stepdefinition",
					dryRun = false
					
					
									)
public class TestRunner 
{

}
