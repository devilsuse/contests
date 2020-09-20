package com.manthano.test;

public class StringSplitSpaceTest
{
	public static void main(String[] args)
	{
		String s = "   3paces  2spaces 1space";
		String[] a = s.split("\\s+");
		System.out.println(a.length);
		for(String ss : a) {
			 if(ss.startsWith(" ") || ss.isEmpty()) {
				 System.out.println("loud:" + ss);
				 continue;
			 }
			 else       
				System.out.println(ss);
		}
		
		
		String[] splitWithoutPlus = s.split("\\s");
		System.out.println(splitWithoutPlus.length);
		for(String ss : splitWithoutPlus) {
			 if(ss.startsWith(" ") || ss.isEmpty()) {
				 System.out.println("loudWithoutPlus:" + ss);
				 continue;
			 }
			 else       
				System.out.println(ss);
		}
		
		String ip="..."; 
		String[] ar = ip.split("\\.");
		System.out.println(ip + ":"  + ar.length);
		
		ip=".2.."; 
		ar = ip.split("\\.");
		System.out.println(ip + ":"  + ar.length);
		for(String ss : ar) {
			 if(ss.startsWith(" ") || ss.isEmpty()) {
				 System.out.println("IPWithoutPlus:" + ss);
				 continue;
			 }
			 else       
				System.out.println(ss);
		}
		
		ip=".2.3.4"; 
		ar = ip.split("\\.");
		System.out.println(ip + ":"  + ar.length );
		for(String ss : ar) {
			 if(ss.startsWith(" ") || ss.isEmpty()) {
				 System.out.println("IPWithoutPlus:" + ss);
				 continue;
			 }
			 else       
				System.out.println(ss);
		}
	}
}
