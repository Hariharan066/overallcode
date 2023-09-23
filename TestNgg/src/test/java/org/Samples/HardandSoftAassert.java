package org.Samples;

import org.Baseclass.Basement;
import org.Pom.login;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardandSoftAassert extends Basement{
	
	@BeforeClass
	private void bc() {
		edgeLunch();
		UrlLanuch("https://www.facebook.com/");
		timeout(10);

	}
	@Parameters({"username","password"})
	@Test(priority=1)
	public void hardAssert(String user,String pass) {
		UrlLanuch("https://www.facebook.com/");

		//Hard Assert
		//Assert.assert("message',"Exp","actual")
		
		Assert.assertTrue(getCurrentUrl().contains("facebook"));
		login l = new login();
		sendkeys(l.getTxtuser(),user);
		Assert.assertEquals( "Hariharan", getatt(l.getTxtuser()));
		sendkeys(l.getTxtpass(),pass);
		Assert.assertEquals( "123456",getatt(l.getTxtpass()));
		Click(l.getbtnlogin());
		
	}
	@Test(priority=2)
	private void SoftAssert() {
		//Soft Assert
		//s.assertTrue("actual","Exp","message)
		UrlLanuch("https://www.facebook.com");
		SoftAssert s = new SoftAssert();
		s.assertTrue(getCurrentUrl().contains("facebook"),"login");
		login l = new login();
		sendkeys(l.getTxtuser(),"hariharan");
		s.assertEquals(getatt(l.getTxtuser()),"hariharan", "user");
		sendkeys(l.getTxtpass(),"123456");
		s.assertEquals(getatt(l.getTxtpass()),"123456","pass");
		Click(l.getbtnlogin());
		s.assertAll();
		

		
		
		
	}

}
