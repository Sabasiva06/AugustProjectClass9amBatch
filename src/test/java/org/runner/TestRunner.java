package org.runner;

import org.base.ReportJVM;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Login.feature" }, glue = {
		"org.stepdef" }, monochrome = true, dryRun = false, plugin = { "pretty", "html:D:\\9pmCucumberBatch\\target",
				"json:D:\\9pmCucumberBatch\\target\\fb.json",
				"junit:D:\\\\9pmCucumberBatch\\\\target\\\\fb.xml","json:D:\\9pmCucumberBatch\\target\\Report\\sample.json" }, 
				snippets = SnippetType.CAMELCASE)
public class TestRunner {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println(System.getProperty("ENV"));
	}
	
	@AfterClass
	public static void afterClass() {
		ReportJVM.generateJVMReport("D:\\9pmCucumberBatch\\target\\Report\\sample.json");

	}

}
