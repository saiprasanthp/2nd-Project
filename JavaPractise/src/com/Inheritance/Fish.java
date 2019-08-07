package com.Inheritance;

public class Fish {
	Fish(int i){
		System.out.println(i);
		System.out.println("hai");
	}
	public void m1() {
		System.out.println("m1 method");
		this.m2();
	}
	public void m2() {
		System.out.println("m2 method");
	}
}