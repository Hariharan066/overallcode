package org.Day1Tasks;

import java.util.Date;

import org.Baseclass.Basement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lunch extends Basement {
	
	@BeforeClass
	private void urllunch() {
		edgeLunch();
		UrlLanuch("https://www.flipkart.com/");
		timeout(10);
	}
	@BeforeMethod
	private void date() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	private void code() {
		Task1 t = new Task1();
		t.t1();
		System.out.println("------------------Mobile Name-------------------------");
	    Task2 tt = new Task2();
		tt.t2();
		System.out.println("------------------Mobile Price-------------------------");
		Task3 ttt = new Task3();
		ttt.t3();
		System.out.println("----------Mobile--> min , max <--Price-------------------------");
		Task4 tttt = new Task4();
		tttt.t4();
		System.out.println("----------MobileName   =   Mobile Price---------------------------------");
		Task5 ttttt = new Task5();
	    ttttt.t5();
		
	}

	
		

	}


