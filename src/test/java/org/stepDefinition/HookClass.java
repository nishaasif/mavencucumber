package org.stepDefinition;


import org.pojo.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{
	@Before
	private void precond() {
		launchBrow();
		
		
	}
	@After
	private void postcond() {
		
		closeBrow();
		
	}
	

}
