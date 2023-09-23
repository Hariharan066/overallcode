package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createnewAccount extends BaseClass {

	
	public createnewAccount() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("(//a[@role='button'] ) [2]"))
 	private WebElement createaccount;

	@FindBy(name="firstname")
	private WebElement fn;
	
	@FindBy(name="lastname")
	private WebElement ln;
	
	@FindBy(name="reg_email__")
	private WebElement pn;
	
	@FindBy(name="reg_passwd__")
	private WebElement rp;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath=("//input[@value='2']"))
	private WebElement radiobutton;
	
	@FindBy(xpath=("//button[@name='websubmit']"))
	private WebElement signup;
	 
	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public void setCreateaccount(WebElement createaccount) {
		this.createaccount = createaccount;
	}

	public WebElement getFn() {
		return fn;
	}

	public void setFn(WebElement fn) {
		this.fn = fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public void setLn(WebElement ln) {
		this.ln = ln;
	}

	public WebElement getPn() {
		return pn;
	}

	public void setPn(WebElement pn) {
		this.pn = pn;
	}

	public WebElement getRp() {
		return rp;
	}

	public void setRp(WebElement rp) {
		this.rp = rp;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getClc() {
		return clc;
	}

	public void setClc(WebElement clc) {
		this.clc = clc;
	}

	public WebElement getSc() {
		return sc;
	}

	public void setSc(WebElement sc) {
		this.sc = sc;
	}
	@FindBy(xpath=("//input[@value='2']"))
	private WebElement clc;
	
	@FindBy(xpath=("(//button[@type='submit']) [2]"))
	private WebElement sc;		
	

	public void createAccount() {
		sendkeys(fn, "Hari");
		sendkeys(ln, "haran");
		sendkeys(pn, "9876543232");
		sendkeys(rp, "9876567");
		SelectIndex(day, 5);
		SelectIndex(month, 5);
		SelectIndex(year, 20);
		Click(radiobutton);
		Click(signup);
		
	}
	














}













































