package org.coderunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FlipkartSearch.feature",
					glue="org.testingCode",
					monochrome=true,
					dryRun=false)

public class CodeRunner {

}
