package org.flip;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class pagefour extends BaseClass{
	
	public pagefour() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=("//input[@type='text']"))
	private WebElement phnum;
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement cuntclc;
	
	@FindBy(xpath=("(//input[@type='text']) [2]"))
	private WebElement otpnum;
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement login;

	public WebElement getPhnum() {
		return phnum;
	}

	public void setPhnum(WebElement phnum) {
		this.phnum = phnum;
	}

	public WebElement getCuntclc() {
		return cuntclc;
	}

	public void setCuntclc(WebElement cuntclc) {
		this.cuntclc = cuntclc;
	}

	public WebElement getOtpnum() {
		return otpnum;
	}

	public void setOtpnum(WebElement otpnum) {
		this.otpnum = otpnum;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	public void buy(String x,String y) throws InterruptedException {
		sendkeys(getPhnum(),x);
		Click(getCuntclc());
		Thread.sleep(10000);
		sendkeys(getOtpnum(), y);
		Click(getLogin());
		
		
		
		
		
		
	}
}

