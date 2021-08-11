package org.stepdef;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void beforeScenario() {
		System.out.println("execute before each scenario");
	}

	@After
	public void afterSceanrio() {
		System.out.println("Execute after each scenario");
	}

}
