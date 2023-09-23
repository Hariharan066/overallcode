package org.PageObjectModel;

import org.BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Base{
	
	public Page4() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("(//*[@class='login_title']) [2]"))
	private WebElement p4;
	
	public WebElement getP4() {
		return p4;
	}

	public void setP4(WebElement p4) {
		this.p4 = p4;
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

	public static void main(String[] args) throws InterruptedException {

		Page4 p4 = new Page4();
		
		Assert.assertTrue("p4",getText(p4.getP4()).contains("Book A Hotel"));
		
		sendkeys(p4.getFn(),"Hari");
		Assert.assertEquals("fn","Hari",getatt(p4.getFn()));
		sendkeys(p4.getLn(),"haran");
		Assert.assertEquals("ln","haran",getatt(p4.getLn()));
		sendkeys(p4.getBa(),"14/annastreet,trichy,621207");
		Assert.assertEquals("ba","14/annastreet,trichy,621207", getatt(p4.getBa()));
		sendkeys(p4.getCcnum(),"9876543212345678");
		Assert.assertEquals("ccnum","9876543212345678",getatt(p4.getCcnum()));
		SelectIndex(p4.getCctype(),2);
		Assert.assertEquals("cctype", "VISA", getatt(p4.getCctype()));
		SelectIndex(p4.getMonth(),5);
	//	Assert.assertEquals("month","May", getatt(p4.getMonth()));
		SelectIndex(p4.getYear(),18);
	//	Assert.assertEquals("year","2029",getatt(p4.getYear()));
		sendkeys(p4.getCvv(), "666");
		Assert.assertEquals("cvv", "666",getatt(p4.getCvv()));
		Click(p4.getBook());
		
		Threadsleep(5000);
		
	}
}
