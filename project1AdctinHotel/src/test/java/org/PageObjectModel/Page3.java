package org.PageObjectModel;

import org.BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Base {
	
	public Page3() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=("//*[@class='login_title']"))
	private WebElement p3;
	
	public WebElement getP3() {
		return p3;
	}

	public void setP3(WebElement p3) {
		this.p3 = p3;
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
	
	public static void main(String[] args) {

		Page3 p3 = new Page3();
		
		Assert.assertTrue("p3", getText(p3.getP3()).contains("Select Hotel"));
		
		Click(p3.getRadiobutton());
		Click(p3.getCountinue());
		
	}
	
	}


