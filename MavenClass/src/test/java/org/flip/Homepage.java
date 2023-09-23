package org.flip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Homepage extends BaseClass {
	
	public Homepage ()
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement searchbtn;
	
	@FindBy(xpath=("//*[@class='_2KpZ6l _2doB4z']"))
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public void setSearchbox(WebElement searchbox) {
		this.searchbox = searchbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void setSearchbtn(WebElement searchbtn) {
		this.searchbtn = searchbtn;
	}
	
	public void Home(WebElement x,String y) {
		Click(getCancel());
		sendkeys(getSearchbox(), y);
		Click(getSearchbtn());
		
	}
}
