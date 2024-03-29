package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:Features/Registration.feature"},
glue={"classpath:com.stefdefinition"},
plugin={"html:target/cucumber_html_report.html"},
//running all the scenarios
tags= "@Register")
//running individual scenario
//tag = "Register and @One")
//tag = "Register and @Two")




public class Runner {

}
