package org.Samples;

import org.testng.annotations.DataProvider;

public class Dataproviderrrrrr {
	@DataProvider(name="login",indices= {0,1,2})
	private Object [][] data() {
		Object [][] obj=new Object[][] {
			
			{"ram","888"},            //0
			{"nithish","1111"},       //1
		    {"ranjith","2222"}	      //3	
	};
	return obj;
	}

}
