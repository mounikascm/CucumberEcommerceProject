package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:Features/Orders.feature"},
glue={"classpath:com.stefdefinition"},
plugin={"html:target/cucumber_html_report.html"},
tags = ("@Orders and @One"))



public class Runner {

}
