package org.PageObjectModel;

import org.BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 extends Base{
	
	public Page5() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=("//*[@class='login_title']"))
	private WebElement p5;
	
	public WebElement getP5() {
		return p5;
	}

	public void setP5(WebElement p5) {
		this.p5 = p5;
	}

	@FindBy(id="order_no")
	private WebElement ordernum;

	public WebElement getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(WebElement ordernum) {
		this.ordernum = ordernum;
	}
	
	@FindBy(xpath=("//a[text()='Booked Itinerary']"))
	private WebElement bookingpnr;
	
	@FindBy(xpath=("//input[@type='checkbox']"))
	private WebElement checkbtn;
	
	@FindBy(xpath=("//input[@name='cancelall']"))
	private WebElement cancel;
	
	
    public WebElement getBookingpnr() {
		return bookingpnr;
	}

	public void setBookingpnr(WebElement bookingpnr) {
		this.bookingpnr = bookingpnr;
	}

	public WebElement getCheckbtn() {
		return checkbtn;
	}

	public void setCheckbtn(WebElement checkbtn) {
		this.checkbtn = checkbtn;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	public static void main(String[] args) {
	Page5 p5 = new Page5();
	
	Assert.assertTrue("p5",getText(p5.getP5()).contains("Booking Confirmation"));
	
	String ordernum = getatt(p5.getOrdernum());
	System.out.println("ordeNumber...."+ordernum);	
}
}

