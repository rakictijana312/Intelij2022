package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/APIFeatures",
        //glue is where we can find implementations for gherkin steps
        // we provide the path of package for steps
        glue = "APISteps",
        //if we set dry run to true, it will quickly scan all gherkin steps are implemented or not
        // if it is true, then no actual execution happens
        dryRun = false,
        //it means that the console output for the cucumber test is easily readable
        //it will remove unreadable character
        monochrome = true,
        strict = true,
        //if strict is set to true then at the time of execution if cucumber encounters any undefined
        //steps, it will give an error and stops execution. Also it gives code snippet for the
        //unimplemented steps
        //tags will identify the scenarios based on the tags we will provide such as @smoke, @regression etc
        // we can add multiple tags in the runner class to execute scenarios belong to different tags such
        //as and or ,
        tags = "@APIWorkflow",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/failed.txt"}
)

public class APIRunner {
}
