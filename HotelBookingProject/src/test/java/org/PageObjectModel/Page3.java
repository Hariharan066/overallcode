package org.PageObjectModel;

import org.BaseClass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Base {
	
	public Page3() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement countinue;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}

	public WebElement getCountinue() {
		return countinue;
	}

	public void setCountinue(WebElement countinue) {
		this.countinue = countinue;
	}
	
	
	}


