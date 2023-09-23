package org.PageObjectModel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass extends BaseClass {
	
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("(//input[@type='text'])[1]"))
	private WebElement user;
	@FindBy(xpath=("//input[@name='password']"))
	private WebElement pass;
	@FindBy(xpath=("(//input[@class='button'])[1]"))
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
	public void login() {
		LoginClass l = new LoginClass();
		sendkeys(l.user,"hari");
		sendkeys(l.pass, "123456");
		Click(l.login);

	}
}

