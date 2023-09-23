package org.flipkart;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page3 extends BaseClass{
	
	public page3() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getBuy() {
		return buy;
	}

	public void setBuy(WebElement buy) {
		this.buy = buy;
	}

	@FindBy(xpath=("//button[text()='Buy Now']"))
	public WebElement buy;

}


