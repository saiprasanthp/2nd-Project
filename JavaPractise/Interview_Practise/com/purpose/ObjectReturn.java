package com.purpose;
class Inject{
	
	public Jeep1 m1() {
		System.out.println("l");
		return new Jeep1();
	}
	
}

public class ObjectReturn {

	public static void main(String[] args) {
		Inject k=new Inject();
		Jeep1 a =k.m1();
		a.m2();
	}
}
