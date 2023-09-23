package org.lanuch;

import org.PageObjectModel.LoginClass;
import org.PageObjectModel.RegisterClass1;
import org.baseclass.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class launch extends BaseClass {
	@BeforeClass
	private void url() {
		edgeLunch();
		UrlLanuch("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		timeout(10);
	}
	@Test
	private void test1() {
		RegisterClass1 r = new RegisterClass1();
		r.register();	
	}
	@Test
	private void test2() {
		LoginClass l = new LoginClass();
		l.login();

	}
	

}
