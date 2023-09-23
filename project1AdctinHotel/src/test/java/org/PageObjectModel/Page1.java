package org.PageObjectModel;

import org.BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends Base {
	
	public Page1() {
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath=("//*[text()='Existing User Login - Build 1']"))
	private WebElement p1;
	public WebElement getP1() {
		return p1;
	}
	public void setP1(WebElement p1) {
		this.p1 = p1;
	}

	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement login;
	
	
	
	
	public WebElement getUser() {
		return user;
	}
	public void setUser(WebElement user) {
		this.user = user;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	

	public static void main(String[] args) {

		Page1 p1 = new  Page1();
		
		sendkeys(p1.getUser(),"Hariharan03");
		Assert.assertEquals("user", "Hariharan03",getatt(p1.getUser()));
		sendkeys(p1.getPass(),"HM4AT1");
		Assert.assertEquals("pass","HM4AT1", getatt(p1.getPass()));
		Click(p1.getLogin());
		
	}
	

	

}
