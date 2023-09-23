package org.Abc;

import org.testng.annotations.Test;

public class C {
	
	@Test
	private void c1() {
		System.out.println("c1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void c2() {
		System.out.println("c2");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void c3() {
		System.out.println("c3");
		System.out.println(Thread.currentThread().getId());

	}

}
