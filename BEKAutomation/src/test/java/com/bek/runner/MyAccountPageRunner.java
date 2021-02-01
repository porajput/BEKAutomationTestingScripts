package com.bek.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features/"},
    glue = {"com.bek.stepdefinitions"},
    tags ={"@MyAccountPage"}, dryRun = false 
    )

public class MyAccountPageRunner {

}
