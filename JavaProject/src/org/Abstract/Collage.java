package org.Abstract;

public class Collage extends University{
	//overriding
	@Override
	public void ug() {
		System.out.println("ug is 80%");
	}
	@Override
	public void pg() {
		System.out.println("pg is 85%");
	}
	//overLoading
	public void phoneInfo(String name,int pass,float imei) {
		System.out.println("my phone name is "+name);
		System.out.println("my phone pass is "+pass);
		System.out.println("my phone imei is "+imei);
	}
	
	public static void main(String[] args) {

		University u = new Collage();
		u.ug();
		u.pg();
		
		Collage c = new Collage();
		c.phoneInfo("redmi",9566,876523459876f);
		
		
		
		
	}

}
