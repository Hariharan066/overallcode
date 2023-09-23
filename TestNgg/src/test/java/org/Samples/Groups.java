package org.Samples; 

import org.testng.annotations.Test;
                                
public class Groups {
	
	//Smoke,Sanity,Regression,Retest
	
	@Test(groups="smoke")
	private void a1() {
		System.out.println("a1");
	}
	
	@Test(groups="smoke")
	private void a2() {
		System.out.println("a2");
	}
	
	@Test(groups="smoke")
	private void a3() {
		System.out.println("a3");
	}
	
	@Test(groups="sanity")
	private void a4() {
		System.out.println("a4");
	}
	
	@Test(groups="sanity")
	private void a5() {
		System.out.println("a5");
	}
	
	@Test(groups="sanity")
	private void a6() {
		System.out.println("a6");
	}
	
	@Test(groups="regression")
	private void a7() {
		System.out.println("a7");
	}
	
	@Test(groups="regression")
	private void a8() {
		System.out.println("a8");
	}
	@Test(groups="regression")
	private void a9() {
		System.out.println("a9");
	}
	@Test(groups= {"smoke","retest"})
	private void a10() {
		System.out.println("a10");
	}
	
	
}
