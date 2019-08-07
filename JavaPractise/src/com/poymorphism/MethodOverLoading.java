package com.poymorphism;

public class MethodOverLoading {
	
	public void m1(int i,double j) {
		
		System.out.println(j);
	}
	public void m1(double j,int k) {
		System.out.println(j);	
	}
	public static void main(String[] args) {
		MethodOverLoading h=new MethodOverLoading();
		h.m1(10.21f, 10);
		h.m1(10, 10d);
	}

}
