package NaukriStepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/NaukriAppFeature", glue = {
		"NaukriStepDefinition" }, monochrome = true, tags = "@smoke", plugin = { "json:target/cucumber.json" })
public class NaukriTestRunner {

}
