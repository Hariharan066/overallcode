package org.practice;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

import java.util.Date;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.pageobjectmodel.Login;

import Basement.Basement;

public class TestClass extends Basement {
	

	@BeforeClass
	public static void Bc() {
		 driver = new EdgeDriver();
		UrlLanuch("https://www.facebook.com/");
		timeout(10);
	}
	@AfterClass
	public static void Ac() {
		driver.quit();
	}
	@Before
	public void before() {
		 Date d = new Date();
		System.out.println("before......"+d);
	} 
	@After
	public void after()  {
		 Date d = new Date();
			System.out.println("after......."+d);
	}
	@Test
	public void Test() {
		UrlLanuch("https://www.facebook.com/");
//	
//		String u = getCurrentUrl();
//		boolean c = u.contains("facebook");
//		Assert.assertTrue(c);
		
		Assert.assertTrue("after login",getCurrentUrl().contains("facebook"));
		Login l = new Login();
		
		sendkeys(l.getTxtuser(), "hariharan");
		Assert.assertEquals("user","hariharan",getatt(l.getTxtuser()));
		
		sendkeys(l.getTxtpass(), "6533456");
		Assert.assertEquals("user","6533456",getatt(l.getTxtpass()));
		
		Click(l.getbtnlogin());
		Assert.assertTrue("login",getCurrentUrl().contains("www_first_password_failure"));
		
	}
//	@Test
//	public void Test2() {
//
//		driver.get("https://www.facebook.com/");
//		WebElement user = driver.findElement(By.id("email"));
//		sendkeys(user, "hari0987");
//		WebElement pass  = driver.findElement(By.id("pass"));
//		sendkeys(pass, "765433456");
//		WebElement login = driver.findElement(By.name("login"));
//		Click(login);
//	}
//	@Test
//	public void Test3() {
//
//		driver.get("https://www.facebook.com/");
//		WebElement user = driver.findElement(By.id("email"));
//		sendkeys(user, "hari7892");
//		WebElement pass  = driver.findElement(By.id("pass"));
//		sendkeys(pass, "1234567");
//		WebElement login = driver.findElement(By.name("login"));
//		Click(login);
//	}
//	@Test
//	public void test4() {
//		System.out.println("complete");
	}
	
	
	
	
	

