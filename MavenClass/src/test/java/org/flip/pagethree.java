package org.flip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class pagethree extends BaseClass {
	
	public pagethree() {
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
