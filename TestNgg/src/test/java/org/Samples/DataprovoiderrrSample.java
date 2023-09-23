package org.Samples;

import org.Baseclass.Basement;
import org.Pom.login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataprovoiderrrSample extends Basement {
	@BeforeClass
	private void bc() {
		edgeLunch();
		UrlLanuch("https://www.facebook.com/");
		timeout(10);
	}
	
	//use the Separate Class with Dataprovider
	
	@Test(priority=1,dataProvider="login",dataProviderClass=Dataproviderrrrrr.class)
	private void loginn(String user,String pass) {
		SoftAssert s = new SoftAssert();
			login l = new login();
			sendkeys(l.getTxtuser(),user);
			sendkeys(l.getTxtpass(), pass);
			Click(l.getbtnlogin());
			s.assertAll();
			
	}
	
	//inside the class with Dataprovider

	@Test(dataProvider="chumma")
	private void A1(String x,String y) {
		System.out.println(x);
		System.out.println(y);
		
	}
	
	@DataProvider(name="chumma",indices=2)
	private Object [][]data() {
		Object [][] obj= new Object [][] {
			{"hari","123"},{"dinesh","1234"},{"ranjith","12345"}
		};
		return obj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
