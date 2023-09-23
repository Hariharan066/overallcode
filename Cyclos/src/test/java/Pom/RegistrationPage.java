package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseClass.Baseclass;

public class RegistrationPage extends Baseclass{
	
	public RegistrationPage () {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=("//div[text()=' Register ']"))
	private WebElement regclc;
	@FindBy(xpath=("//span[contains(text(),'Upload ')]"))
	private WebElement picupload;
	@FindBy(xpath=("(//input[@type='text'])[1]"))
	private WebElement firstname;
	@FindBy(xpath=("(//input[@type='text'])[2]"))
	private WebElement loginname;
	@FindBy(xpath=("(//input[@type='text'])[3]"))
	private WebElement email;
	@FindBy(xpath=("//input[@name='website']"))
	private WebElement website;
	@FindBy(xpath=(" //*[text()=' Male ']"))
	private WebElement gender;
	@FindBy(xpath=("//*[@id='business_type']"))
	private WebElement businestype;
	@FindBy(xpath=("(//input[@type='text'])[4]"))
	private WebElement phnum;
	@FindBy(xpath=("(//input[@type='text'])[5]"))
	private WebElement lanlinenum;
	@FindBy(xpath=("//input[@type='checkbox']"))
	private WebElement addressclc;
	@FindBy(xpath=("addressLine1"))
	private WebElement addressline;
	@FindBy(xpath=("//input[@id='zip']"))
	private WebElement zipcode;
	@FindBy(xpath=("//input[@id='city']"))
	private WebElement city;
	@FindBy(xpath=("//input[@id='region']"))
	private WebElement state;
	@FindBy(xpath=("//button[@title='India']"))
	private WebElement country;
	@FindBy(xpath=("(//button[contains(@class,'btn btn-ico')])[6]"))
	private WebElement visiblitiyclc;
//	@FindBy(xpath=(""))
//	private WebElement map;
	@FindBy(xpath=("//span[text()='Next']"))
	private WebElement next ;
	public WebElement getRegclc() {
		return regclc;
	}
	public void setRegclc(WebElement regclc) {
		this.regclc = regclc;
	}
	public WebElement getPicupload() {
		return picupload;
	}
	public void setPicupload(WebElement picupload) {
		this.picupload = picupload;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLoginname() {
		return loginname;
	}
	public void setLoginname(WebElement loginname) {
		this.loginname = loginname;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getWebsite() {
		return website;
	}
	public void setWebsite(WebElement website) {
		this.website = website;
	}
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getBusinestype() {
		return businestype;
	}
	public void setBusinestype(WebElement businestype) {
		this.businestype = businestype;
	}
	public WebElement getPhnum() {
		return phnum;
	}
	public void setPhnum(WebElement phnum) {
		this.phnum = phnum;
	}
	public WebElement getLanlinenum() {
		return lanlinenum;
	}
	public void setLanlinenum(WebElement lanlinenum) {
		this.lanlinenum = lanlinenum;
	}
	public WebElement getAddressclc() {
		return addressclc;
	}
	public void setAddressclc(WebElement addressclc) {
		this.addressclc = addressclc;
	}
	public WebElement getAddressline() {
		return addressline;
	}
	public void setAddressline(WebElement addressline) {
		this.addressline = addressline;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
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
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getVisiblitiyclc() {
		return visiblitiyclc;
	}
	public void setVisiblitiyclc(WebElement visiblitiyclc) {
		this.visiblitiyclc = visiblitiyclc;
	}
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	
	public void reg() throws InterruptedException {
		Click(regclc);
		Click(picupload);
		sendkeys(picupload, "C:\\Users\\Lenovo\\Pictures\\Camera Roll\\JPG File (.jpg)");
		sendkeys(firstname, "hari");
		sendkeys(loginname, "hari006");
		sendkeys(email, "www.crazyharichutty@gmail.com");
		sendkeys(website, "https://demo.cyclos.org/ui/home");
		Click(gender);
		Click(businestype);
		WebElement cc = driver.findElement(By.xpath("//a[text()=' Clothing ']"));
		Click(cc);
		sendkeys(phnum,"7698564534");
		sendkeys(lanlinenum,"9867545678");
		Click(addressclc);
		Thread.sleep(5000);
		sendkeys(zipcode, "235476");
		sendkeys(city, "chennai");
		sendkeys(state, "tamilnadu");
		sendkeys(country, "india");
		Click(visiblitiyclc);
		
		
		
		
		

	}
	
	
	

}
