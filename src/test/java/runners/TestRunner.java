package runners;



import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.cli.Main;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "pretty"},
        //tags = {"@runit,@run","~@ignore"},
        features = {"src/test/java/resources/"},
        glue = {"bindings"}
)

public class TestRunner {

}