package org.in;

public class Childclass implements Parent1,Parent2 {

	@Override
	public void method() {
		System.out.println("in method");
		
	}

	@Override
	public void method2() {
		System.out.println("in method2");
	}
	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.method();
		obj.method2();
	}

}
