package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportJVM {

	public static void generateJVMReport(String json) {

		File file = new File("D:\\9pmCucumberBatch\\target\\Report");

		Configuration configuration = new Configuration(file, "SampleJVMReport");
		configuration.addClassifications("Browser-Type", "Chrome Browser");
		configuration.addClassifications("Platform", "Win-10");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Sprint No", "32");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
	}
}
