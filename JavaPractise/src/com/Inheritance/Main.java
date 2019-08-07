package com.Inheritance;
class Parent{
	int b=19;
	static int k=10;
}
class Child extends Parent{
	public void m1() {
		System.out.println(b);
		System.out.println(k);
		System.out.println(super.b);
	}
	public static void m3() {
		System.out.println(new Parent().b);
	}
}

public class Main {

	public static void main(String[] args) {
		Child h=new Child();
		h.m1();
	}
}
