package com.cg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="stepdef", dryRun=true, plugin= {"pretty", "json:target/cumcumber.json"})

public class TestRunner {

}
