package testRunner;

import io.cucumber.junit.CucumberOptions;


	@CucumberOptions(
					features="C:\\Users\\kinga\\eclipse-workspace\\Maven-project\\src\\test\\java\\Feature\\Inadev.feature",
					
					glue="stepdefinations",
					dryRun=false,
					monochrome=true
				)
	public class InadevTestRunner {
	
}
