package org.Arrays;

public class Arraysss {

	public static void main(String[] args) {
		
	int[] a= new int[5];
	a[0]=11;
	a[1]=22;
	a[2]=33;
	a[3]=44;
	a[4]=55;
	
	//normal for loop
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);	
	}
	
	//enhanced for loop
	
    for (int i : a) {
	System.out.println(i);
	
}	
	
}}