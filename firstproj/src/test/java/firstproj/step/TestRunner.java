package firstproj.step;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/feature"},glue= {"firstproj.step"},monochrome = true, plugin = {"pretty","html:target/cucumberReport.html"})

public class TestRunner {

}
