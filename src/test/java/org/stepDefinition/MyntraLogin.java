package org.stepDefinition;

import org.pojo.BaseClass;
import org.pojo.PojoAjio;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraLogin extends BaseClass {
	public static PojoAjio a;
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
		launchBrow();
	}

	@When("To launch the ajio url")
	public void to_launch_the_ajio_url() {
		launchUrl("https://www.ajio.com/");
	}

	@When("To Click new account field")
	public void to_Click_new_account_field() throws InterruptedException {
		a=new PojoAjio();
		click(a.getSign());
		Thread.sleep(5000);
		
	}

	@When("To enter mobile number{string}or email")
	public void to_enter_mobile_number_or_email(String em) {
		a=new PojoAjio();
		passValue(em, a.getUsname());
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		closeBrow();
	}



}
