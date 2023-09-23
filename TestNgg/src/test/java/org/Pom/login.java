package org.Pom;

import org.Baseclass.Basement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends Basement{
	
	
	public login() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement txtuser;
	@FindBy(id="pass")
	private WebElement txtpass;
	@FindBy(name="login")
	private WebElement btnlogin;
	@FindBy(xpath=("//a[text()='Sign up for Facebook']"))
 	private WebElement createaccount;

	
	public WebElement getTxtuser() {
		return txtuser;	
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getbtnlogin() {
		return btnlogin;
	}
	public WebElement getCreateaccount() {
		return createaccount;
	}
	public void Login() {
		sendkeys(txtuser, "hari");
		sendkeys(txtpass, "123");
		Click(btnlogin);
		
	}

}


