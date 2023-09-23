package org.Samples;

import org.Baseclass.Basement;
import org.Pom.login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Para extends Basement{
	
	@BeforeClass
	private void bc() {
		edgeLunch();
		UrlLanuch("https://www.facebook.com/");
		timeout(10);
		
	}

	@Parameters({"username","passname"})
	@Test(priority=1)
	public void parameter1(String user,String pass) {
		SoftAssert s = new 	SoftAssert();
		UrlLanuch("https://www.facebook.com");
		login l = new login();
		sendkeys(l.getTxtuser(),user);
		s.assertEquals(getatt(l.getTxtuser()),"crazyharichutty@gmail.com","user");
		sendkeys(l.getTxtpass(), pass);
		s.assertEquals(getatt(l.getTxtpass()),"123456","pass");
		Click(l.getbtnlogin());
	}	
	//Optionals Samples
	@Parameters({"username","passname"})
	@Test(priority=2)
	private void parameter(@Optional("Hari")String user,@Optional("66666")String pass) {
		SoftAssert s = new 	SoftAssert();
		UrlLanuch("https://www.facebook.com/");
		login l = new login();
		sendkeys(l.getTxtuser(),user);
		s.assertEquals(getatt(l.getTxtuser()),"crazyharichutty@gmail.com","user");
		sendkeys(l.getTxtpass(), pass);
		s.assertEquals(getatt(l.getTxtpass()),"123456","pass");
		Click(l.getbtnlogin());
		
	}

}
