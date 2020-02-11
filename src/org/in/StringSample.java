package org.in;

public class StringSample {
	public static void main(String[] args) {
		String str1 = "Tamizh";
		String str = "green";
		System.out.println(System.identityHashCode(str1));
		String str2 = "Tamizh";
		System.out.println(System.identityHashCode(str2));
		str2 = str1.concat(str2);
		System.out.println(System.identityHashCode(str2));
		//System.out.println(str2);
		//System.out.println(str1);
		//str = str + "tech";
		//System.out.println(str);
		//System.out.println(System.identityHashCode(str));
		
		System.out.println("/************StrinBuffer****************************/");
		StringBuffer str3 = new StringBuffer("Tamizh");
		System.out.println(System.identityHashCode(str3));
		StringBuffer str4 = new StringBuffer("Tamizh");
		System.out.println(System.identityHashCode(str4));
		str3 =str3.append(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(str3);
		
		System.out.println("/******************StringBuilder*****************");
		StringBuilder str5 = new StringBuilder("Tamizh");
		StringBuilder str6 = new StringBuilder("Tamizh");
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		str5 = str5.append(str6);
		System.out.println(System.identityHashCode(str5));
	}

}
