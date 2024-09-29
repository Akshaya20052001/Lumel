package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\org\\Feature\\Lumel.feature",
		glue ="org.Step_Def",
		dryRun=!true,
		monochrome = true,
		publish= true		
		)


public class Lumel_Runner {
	
	

}
