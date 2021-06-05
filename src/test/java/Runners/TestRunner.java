package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/resources/features/EmployeeSearch.feature",
        //glue is where we can find implementations for gherkin steps
        // we provide the path of package for steps
                glue = "steps",

           //if we set dry run to true, it will quickly scan all gherkin steps are implemented or not
            // if it is true, then no actual execution happens
        dryRun = false,
        //it means that the console output for the cucumber test is easily readable
        //it will remove unreadable character
        monochrome = true
        //if strict is set to true then at the time of execution if cucumber encounters any undefined
        //steps, it will give an error and stops execution. Also it gives code snippet for the
        //unimplemented steps
)

public class TestRunner {

}
