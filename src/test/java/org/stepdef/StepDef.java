package org.stepdef;

import org.base.BaseClass;
import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass{
	LoginPage page ;
	

	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		getDriver();
		launchUrl("https://www.facebook.com/");
		
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		 page =new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		type(txtUserName, string);
		WebElement txtPassword = page.getTxtPassword();
		type(txtPassword, string2);
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement btnLogin = page.getBtnLogin();
		btnClick(btnLogin);
	}

}
