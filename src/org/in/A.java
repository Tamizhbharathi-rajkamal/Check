package org.in;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {

		String str = "hello to java class";
		String[] sp = str.split(" ");
		String res="";
		for (String s : sp) {
			
			char c = s.charAt(0);
			String sub = s.substring(1);
			res=res+Character.toUpperCase(c)+sub+" ";
			
		}
		System.out.println(res);
	}
}
