package org.PageObjectModel;

import org.BaseClass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 extends Base{
	
	public Page5() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="order_no")
	private WebElement ordernum;

	public WebElement getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(WebElement ordernum) {
		this.ordernum = ordernum;
	}

}

