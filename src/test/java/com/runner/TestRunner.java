package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.pojoclass.JVM_Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target", }, features = { "src/test/resources" }, glue = {"com.steps" }, monochrome = true)
public class TestRunner {

}
