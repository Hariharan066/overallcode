package org.String;

import java.util.Arrays;

public class Stringg {
	
	public static void main(String[] args) {
		//literal String
		String s1 = "   Welcome   ";
		String s2 = "hari";
		String s4 = "HARI";
		String s3 = "my name is HARI";
		String s5="hello";
		String s6="hello world welcome";
		int length = s1.length();
		System.out.println("lenth count->"+length);
		//isEmpty
		boolean empty = s1.isEmpty();
		System.out.println("empty or not empty check-> "+empty);
		//chart
		char charAt = s1.charAt(2);
		System.out.println("get particular char-> "+charAt);
		//indexof
		int indexOf = s1.indexOf("e");
		System.out.println("first index count-> "+indexOf);
		//lastindexof
		int lastIndexOf = s1.lastIndexOf("e");
		System.out.println("last index count-> "+lastIndexOf);
		//touppercase
		String upperCase = s1.toUpperCase();
		System.out.println("uppercase-> "+upperCase);
		//lowercase
		String lowercase = s1.toLowerCase();
		System.out.println("lowercase-> "+lowercase);
		//Stratwith
		boolean startsWith = s1.startsWith("We");
		System.out.println("start check-> "+startsWith);
		//Endwith
		boolean endsWith = s1.endsWith("me");
		System.out.println("end check-> "+endsWith);
		//contains
		boolean contains = s3.contains("name is");
		System.out.println("check the contant->"+contains);
		//Equalmethod
		boolean equals = s1.equals(s2);
		System.out.println("equal check-> "+equals);
		//EqualIgnoreCase
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s4);
		System.out.println("with out case-> "+equalsIgnoreCase);
		//concat
		String concat = s1.concat(" hari");
		System.out.println("joining ton string-> "+concat);
		
		String replace = s1.replace('W','H' );
		System.out.println("char replace-->"+replace);
		
		String replaceAll = s5.replaceAll("hello", "Thankyou");
		System.out.println("string replaceall-->"+replaceAll);
		
		String trim = s1.trim();
		System.out.println(trim);
		
		String[] split = s6.split(" ");
		System.out.println(Arrays.toString(split));
		
		String s7="hariharan";
		String s8=s7.substring(0,4);
		System.out.println("sub string : "+s8);
		
		
	}

}
