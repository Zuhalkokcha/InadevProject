package testRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {
        "C:\\Users\\kinga\\eclipse-workspace\\Maven-project\\src\\test\\java\\Feature\\Inadev.feature",
        "C:\\Users\\kinga\\eclipse-workspace\\Maven-project\\src\\test\\java\\Feature\\Inadev1.feature",
        "C:\\Users\\kinga\\eclipse-workspace\\Maven-project\\src\\test\\java\\Feature\\Inadev2.feature",
        "C:\\Users\\kinga\\eclipse-workspace\\Maven-project\\src\\test\\java\\Feature\\Inadevfeature3.feature"
    },
    glue = "stepdefinations",
    dryRun = false,
    monochrome = true
)
public class InadevTestRunner {
}