package org.Samples;

import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Withoutnownfailed.class)
public class Retest {
	
	@Test
	private void a1() {
		System.out.println("a1");
	}
	@Test(retryAnalyzer=Withnownfailed.class)
	private void a2() {
		Scanner s= new Scanner(System.in);
		Assert.assertTrue(s.nextBoolean());
		System.out.println("a2");
	}
	@Test
	private void a3() {
		Assert.assertTrue(false);
		System.out.println("a3");

	}
	
	

}
