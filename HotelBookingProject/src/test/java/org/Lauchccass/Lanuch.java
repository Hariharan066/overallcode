package org.Lauchccass;

import org.BaseClass.Base;
import org.PageObjectModel.Page1;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Lanuch extends Base{
	
	@BeforeClass
	public static void bc() {
		driver = new EdgeDriver();
		UrlLanuch("https://adactinhotelapp.com");
		timeout(10);
	}
	
	@AfterClass
	public static void ac() {
		driver.quit();
	}
	@Test
	private void test() {
		
		Page1 p1 = new  Page1();
		
		sendkeys(p1.getUser(),"Hariharan03");
		Assert.assertEquals("user", "Hariharan03",getatt(p1.getUser()));
		sendkeys(p1.getPass(),"HM4AT1");
		Assert.assertEquals("pass","HM4AT1", getatt(p1.getPass()));
		Click(p1.getLogin());
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
