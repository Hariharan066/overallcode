package org.LunchClass;

import org.Baseclass.Basement;
import org.Pom.createnewAccount;
import org.Pom.login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lunchclass extends Basement{

	@BeforeClass
	public void bc() {
		edgeLunch();
		UrlLanuch("https://www.facebook.com/");
		timeout(10);
	}	
	@Test
	public  void test1() {	
		login l = new login();
		l.Login();
	}
	@Test
	public void test2() {
	
		UrlLanuch("https://www.facebook.com/");
		createnewAccount C = new createnewAccount();
		C.Signup();
	}
	
	
	
	
	
	
	
}
