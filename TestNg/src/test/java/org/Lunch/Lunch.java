package org.Lunch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.edge.EdgeDriver;
import org.page.createnewAccount;
import org.page.login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Basement.Basement;

public class Lunch extends Basement {
	
	@BeforeClass
	public  void bc() {
		driver = new EdgeDriver();
		UrlLanuch("https://www.facebook.com");
		timeout(10);
	}

	@Test(priority=1)
	public void Test() {
		
		UrlLanuch("https://www.facebook.com/");
		
		login l = new login();
		l.Login();
	}
	
	@Test(priority=2,invocationCount=3,enabled=true)
	public void test2() {
		UrlLanuch("https://www.facebook.com/");
		createnewAccount c = new createnewAccount();
		c.createAccount();

	}
	
	

}
