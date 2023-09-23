package org.test;

import java.awt.AWTException;
import java.util.Date;
import org.BaseClass.Base;
import org.PageObjectModel.Page1;
import org.PageObjectModel.Page2;
import org.PageObjectModel.Page3;
import org.PageObjectModel.Page4;
import org.PageObjectModel.Page5;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Lanuch extends Base {
	

	@BeforeClass
	public static void BC() {
		Edge();
		UrlLanuch("https://adactinhotelapp.com");
		timeout(10);
	}
	@AfterClass
	public static void AF() {
	//	driver.quit();
	}
	@Before
	public void BEFORE() {
		Date d = new Date();	
		System.out.println("BEFORE TIME---"+d);
		
		System.out.println("---------------------------PAGE-01--------------------------------");

	}
	@After
	public void AFTER() {
		Date d = new Date();	
		System.out.println("AFTER TIME---"+d);
	}
	
	@Test
	public void testclass() throws AWTException, InterruptedException {
		
		Page1 p1 = new  Page1();
		
		Assert.assertTrue("p1",getText(p1.getP1()).contains("Existing User Login - Build 1"));
		
		String text5 = getText(p1.getP1());
		System.out.println(text5);
		
		sendkeys(p1.getUser(),"Hariharan03");
		Assert.assertEquals("user", "Hariharan03",getatt(p1.getUser()));
		sendkeys(p1.getPass(),"HM4AT1");
		Assert.assertEquals("pass","HM4AT1", getatt(p1.getPass()));
		Click(p1.getLogin());
		
		System.out.println("---------------------------PAGE-02--------------------------------");

		
		Page2 p2 = new Page2();
		
		Assert.assertTrue("p2", getText(p2.getP2()).contains("Search Hotel"));
		String text = getText(p2.getP2());
		System.out.println(text);
		
		SelectIndex(p2.getLoc(),6);
		Assert.assertEquals("loction","New York", getatt(p2.getLoc()));
		SelectIndex(p2.getHotels(),2);
		Assert.assertEquals("hotels","Hotel Sunshine",getatt(p2.getHotels()));
		SelectIndex(p2.getRoomtype(),4);
		Assert.assertEquals("RoomTypes","Super Deluxe",getatt(p2.getRoomtype()));
		SelectIndex(p2.getNumofroom(),2);
		Assert.assertTrue(true);
		sendkeys(p2.getCheckindate(), "01/09/2023");
		Assert.assertTrue(true);
		sendkeys(p2.getCheckoutdate(),"07/09/2023");
		Assert.assertTrue(true);
		SelectIndex(p2.getAdultscount(),2);
		Assert.assertTrue(true);
		SelectIndex(p2.getChildrenscount(),3);
		Assert.assertTrue(true);
		Click(p2.getSearch());
		
		System.out.println("---------------------------PAGE-03--------------------------------");
		
		Page3 p3 = new Page3();
		
		Assert.assertTrue("p3", getText(p3.getP3()).contains("Select Hotel"));
		String text2 = getText(p3.getP3());
		System.out.println(text2);
		
		
		Click(p3.getRadiobutton());
		Click(p3.getCountinue());
		
		System.out.println("---------------------------PAGE-04--------------------------------");

		
		Page4 p4 = new Page4();
		
		Assert.assertTrue("p4",getText(p4.getP4()).contains("Book A Hotel"));
		String text3 = getText(p4.getP4());
		System.out.println(text3);
		
		sendkeys(p4.getFn(),"Hari");
		Assert.assertEquals("fn","Hari",getatt(p4.getFn()));
		sendkeys(p4.getLn(),"haran");
		Assert.assertEquals("ln","haran",getatt(p4.getLn()));
		sendkeys(p4.getBa(),"14/annastreet,trichy,621207");
		Assert.assertEquals("ba","14/annastreet,trichy,621207", getatt(p4.getBa()));
		sendkeys(p4.getCcnum(),"9876543212345678");
		Assert.assertEquals("ccnum","9876543212345678",getatt(p4.getCcnum()));
		SelectIndex(p4.getCctype(),2);
		Assert.assertEquals("cctype", "VISA", getatt(p4.getCctype()));
		SelectIndex(p4.getMonth(),5);
	//	Assert.assertEquals("month","May", getatt(p4.getMonth()));
		SelectIndex(p4.getYear(),18);
	//	Assert.assertEquals("year","2029",getatt(p4.getYear()));
		sendkeys(p4.getCvv(), "666");
		Assert.assertEquals("cvv", "666",getatt(p4.getCvv()));
		Click(p4.getBook());
		
		System.out.println("---------------------------PAGE-05----------------------------------");

		
		Threadsleep(5000);
		
		Page5 p5 = new Page5();
		
		Assert.assertTrue("p5",getText(p5.getP5()).contains("Booking Confirmation"));
		String text4 = getText(p5.getP5());
		System.out.println(text4);
		
		System.out.println("------------------------ORDERNUMBER---------------------------------");
	
		String ordernum = getatt(p5.getOrdernum());
		System.out.println("ordeNumber...."+ordernum);	
		
		System.out.println("-------------------------Completed------------------------------------");

		System.out.println("-----BookingCancel-----");
	//	Way 1 BookingCancel......
		
//		Click(p5.getBookingpnr());
//		
//		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//		for (int i = 0; i < checkbox.size()-1; i++) {
//			WebElement cbox = checkbox.get(i);
//			Click(cbox);
//		}
//		
//		Click(p5.getCancel());
//		
//		org.openqa.selenium.Alert A = driver.switchTo().alert();
//	   	A.accept();
//		
//	   	System.out.println("-----Booking Cancel Done-----");
			
		//Way 2 BookingCancel
		
		Click(p5.getBookingpnr());
		
		WebElement srcbox = driver.findElement(By.xpath("//input[@name='order_id_text']"));
		srcbox.sendKeys(ordernum);
		
		WebElement go = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Click(go);
		
		WebElement ckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		Click(ckbox);
		
		Click(p5.getCancel());
		
		org.openqa.selenium.Alert AA = driver.switchTo().alert();
		AA.accept();
	
		System.out.println("-----Booking Cancel Done-----");
		
		
		
		
		
	
}
}
