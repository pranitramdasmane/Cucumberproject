package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features="src/test/java/FeatureFiles",
		  glue="StepDefinations",
		  monochrome=true,
		  tags="@smoke"
		//plugin= {"pretty","html:target/cucumber-reports/report.html"}
		//dryrRun=true;
		)
public class TestRunner {

}
