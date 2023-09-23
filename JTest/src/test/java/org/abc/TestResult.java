package org.abc;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {

	public void test() {
		
		Result Rs = JUnitCore.runClasses(A.class,B.class,C.class);
		
		System.out.println("Run Count...."+Rs.getRunCount());
		System.out.println("Failure Count....."+Rs.getFailureCount());
		System.out.println("Run Time......"+Rs.getRunTime());
		System.out.println("Ignore Count......"+Rs.getIgnoreCount());
		
		List<Failure> f = Rs.getFailures();
		
		for(Failure x:f) {
			
			System.out.println(x);
			System.out.println(x.getMessage());
			System.out.println(x.getTestHeader());
			System.out.println(x.getException());
			
		
	}
}
}