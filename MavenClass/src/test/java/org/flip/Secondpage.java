package org.flip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Secondpage extends BaseClass {
	
	public Secondpage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath=("//*[ text()='Nothing Phone (2) (White, 512 GB)']"))})
	private WebElement clc2;

	public WebElement getClc2() {
		return clc2;
	}

	public void setClc2(WebElement clc2) {
		this.clc2 = clc2;
	}
	
	

}
