package org.Abc;

import org.testng.annotations.Test;

public class B {
	
	
	@Test
	public void b1() {
		System.out.println("b1");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test
	private void b2() {
		System.out.println("b2");
		System.out.println(Thread.currentThread().getId());

	}
	
	
	
	@Test
	private void b3() {
		System.out.println("b3");
		System.out.println(Thread.currentThread().getId());

	}

}
