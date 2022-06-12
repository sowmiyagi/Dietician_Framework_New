package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/FeatureFiles/Login.feature"},
				glue= {"StepDefinitions", "Hooks"},
		plugin = {"pretty", "html:target/cucumber.html"})


public class LoginTestRunner extends AbstractTestNGCucumberTests {
	

		
		/*@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	       return super.scenarios();
	    }
*/


}
