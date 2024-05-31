package firstproj.step;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/feature"},glue= {"firstproj.step"},tags = "@Regression", plugin = {"pretty","html:target/RegressionTestcase.html"})

public class RegressionTestRunner {

}
