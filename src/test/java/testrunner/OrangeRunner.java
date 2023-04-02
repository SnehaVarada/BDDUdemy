package testrunner;

    import org.junit.runner.RunWith;
    import io.cucumber.junit.Cucumber;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions (
	plugin = {"pretty", "html:target/ds1.html","json:target/BDD.json","junit:target/BDd.xml","rerun:target/rerun.txt"},//reporting purpose
	monochrome=true,  //to remove unnecessary characters
	dryRun=false,
	tags="@tag",//tags from feature file
	features = {"C:\\Users\\saisn\\eclipse-workspace\\BDDUdemy\\src\\test\\resources\\Features\\LoginPage.feature"}, //location of feature files
	glue= {"stepDefinition", "AppHooks"})


	public class OrangeRunner extends AbstractTestNGCucumberTests {

	}

