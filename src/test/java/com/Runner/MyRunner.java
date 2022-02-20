package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature/",
		glue = {"com.stepDefinition","com.hooks"},
		plugin = {"json:target/myreport.json"},
		monochrome = true,
		dryRun = false,
		tags = "@Smoke" //only running hotwirelogin.feature smoke tag on senerio 
)

public class MyRunner extends AbstractTestNGCucumberTests{

}
