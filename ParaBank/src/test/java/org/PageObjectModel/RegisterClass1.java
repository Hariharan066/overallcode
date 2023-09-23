package org.PageObjectModel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterClass1 extends BaseClass {
	
	public RegisterClass1() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=("//a[text()='Register']"))
	private WebElement regclc;
	@FindBy(id="customer.firstName")
	private WebElement fn;
	@FindBy(id="customer.lastName")
	private WebElement ln;
	@FindBy(id="customer.address.street")
	private WebElement add;
	@FindBy(id="customer.address.city")
	private WebElement city;
	@FindBy(id="customer.address.state")
	private WebElement state;
	@FindBy(id="customer.address.zipCode")
	private WebElement zipcode;
	@FindBy(id="customer.phoneNumber")
	private WebElement phonenum;
	@FindBy(id="customer.ssn")
	private WebElement ssn;
	@FindBy(id="customer.username")
	private WebElement username;
	@FindBy(id="customer.password")
	private WebElement pass;
	@FindBy(id="repeatedPassword")
	private WebElement cpass;
	@FindBy(xpath=("//input[@type='submit']"))
	private WebElement reg;
	
	
	public WebElement getRegclc() {
		return regclc;
	}
	public void setRegclc(WebElement regclc) {
		this.regclc = regclc;
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
	public WebElement getAdd() {
		return add;
	}
	public void setAdd(WebElement add) {
		this.add = add;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getState() {
		return state;
	}
	public void setState(WebElement state) {
		this.state = state;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
	}
	public WebElement getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(WebElement phonenum) {
		this.phonenum = phonenum;
	}
	public WebElement getSsn() {
		return ssn;
	}
	public void setSsn(WebElement ssn) {
		this.ssn = ssn;
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getCpass() {
		return cpass;
	}
	public void setCpass(WebElement cpass) {
		this.cpass = cpass;
	}
	public WebElement getReg() {
		return reg;
	}
	public void setReg(WebElement reg) {
		this.reg = reg;
	}
	
	public void register() {
		
		RegisterClass1 r = new RegisterClass1();
		Click(r.regclc);
		sendkeys(r.fn, "nithsh");
		sendkeys(r.ln, "kumar");
		sendkeys(r.add,"16.anna street,trichy");
		sendkeys(r.city, "trichy");
		sendkeys(r.state,"tamilnadu");
		sendkeys(r.zipcode,"621206");
		sendkeys(r.phonenum,"8765432198");
		sendkeys(r.ssn, "7534");
		sendkeys(r.username, "nithsh");
		sendkeys(r.pass,"1234");
		sendkeys(r.cpass, "1234");
		Click(r.regclc);	
	}

}
