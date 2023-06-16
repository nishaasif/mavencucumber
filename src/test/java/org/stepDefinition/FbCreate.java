package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.pojo.BaseClass;
import org.pojo.PojoLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FbCreate extends BaseClass{
	public static PojoLogin p;
	
	@Given("To launch the browser and maximize the window")
	public void toLaunchTheBrowserAndMaximizeTheWindow() {
		
		launchBrow();
	 
	}

	@When("To launch amazon url")
	public void toLaunchAmazonUrl() {
		launchUrl("https://www.amazon.com/");
	   
	}

	@When("To click the Acccount and List field")
	public void toClickTheAcccountAndListField() {
		
		p=new PojoLogin();
		click(p.getCreate());
	
	}

	@When("To click create new account field")
	public void toClickCreateNewAccountField() throws InterruptedException {
		click(p.getFname());
		Thread.sleep(5000);
	   
	}

	@When("To pass username in yourname Field")
	public void toPassUsernameInYournameField(DataTable d) {
		List<String> l = d.asList();
		p=new PojoLogin();
		passValue(l.get(1), p.getSecond());
		System.out.println(l);
		}

	@When("To pass mobile number in mobile number field")
	public void toPassMobileNumberInMobileNumberField(DataTable d) {
		Map<String, String> k = d.asMap(String.class, String.class);
		p=new PojoLogin();
		passValue(k.get("mobilenumber1"), p.getPemail());
		System.out.println(k);
	   
	}

	@When("To pass email in email field")
	public void toPassEmailInEmailField(DataTable d) {
		List<Map<String, String>> n = d.asMaps();
		p=new PojoLogin();
		passValue(n.get(1).get("email2"),p.getPasword());
		System.out.println(n);
	}

	@When("To pass password in password field")
	public void toPassPasswordInPasswordField(DataTable d) {
		List<List<String>> h = d.asLists();
		p=new PojoLogin();
		passValue(h.get(0).get(2), p.getPsw());
		System.out.println(h);
	  
	}


		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



