package testrunners;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Featurefiles/",
        monochrome = true,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/report.json", "html:target/cucumber-reports/report.html"},
        tags =  " @LoginPage "
)
public class MyTestRunner {

}
