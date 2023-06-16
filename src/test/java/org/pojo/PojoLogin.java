package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends BaseClass {
	
	public PojoLogin() {
		
	PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement create;
	@FindBy(id="createAccountSubmit")
	private WebElement fname;
	@FindBy(xpath="//input[@type='text']")
	private WebElement second;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement pemail;
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement pasword;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement psw;
	public WebElement getCreate() {
		return create;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getSecond() {
		return second;
	}
	public WebElement getPemail() {
		return pemail;
	}
	public WebElement getPasword() {
		return pasword;
	}
	public WebElement getPsw() {
		return psw;
	}
	
	
	
	

}
