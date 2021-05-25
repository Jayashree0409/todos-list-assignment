package com.wolterskluwer.todos.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Runner class to glue all the relevant feature / step definition to be run
 */

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src/test/resources/features"},
	glue = { "com.wolterskluwer.todos.steps" }, 
	tags = {"@todoslist"},
	plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 	
	dryRun = false,
	monochrome = true
	)
public class TodosListRunner {

}
