package org.stepDefinition;


import org.pojo.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{
	
	@Before
	private void precond() {
		launchBrow();
		driver.manage().window().maximize();
		
	}
	@After
	private void postcond() {
		
		closeBrow();
		
	}
	
	

}
