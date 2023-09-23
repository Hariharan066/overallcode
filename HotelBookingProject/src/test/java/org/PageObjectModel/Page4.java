package org.PageObjectModel;

import org.BaseClass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Base{
	
	public Page4() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement ba;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;

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

	public WebElement getBa() {
		return ba;
	}

	public void setBa(WebElement ba) {
		this.ba = ba;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public void setCcnum(WebElement ccnum) {
		this.ccnum = ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
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

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

}
