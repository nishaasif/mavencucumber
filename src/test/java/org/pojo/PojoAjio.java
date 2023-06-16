package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAjio extends BaseClass {
	public PojoAjio() {
		
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath="//span[text()='Sign In / Join AJIO']")
	private WebElement sign;
	
    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement usname;

	public WebElement getSign() {
		return sign;
	}

	public WebElement getUsname() {
		return usname;
	}
    
    
	
	
	
	
	
	

}
