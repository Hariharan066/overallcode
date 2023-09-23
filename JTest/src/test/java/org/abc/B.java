package org.abc;

import org.junit.Assert;
import org.junit.Test;

public class B {

	@Test
	public void b1() {
		System.out.println("b1");
	}
	@Test
	public void b2() {
		Assert.assertTrue(false);
		System.out.println("b2");
	}
	@Test
	public void b3() {
		System.out.println("b3");
}

}
