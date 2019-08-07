package com.singletonclass;

public class SingleTon {
	private static SingleTon j=null;
	private SingleTon() {
		
	}
	public static SingleTon Test() {
		if(j==null) {
			j=new SingleTon();
		}
		return j;
	}
	

	public static void main(String[] args) {
		SingleTon k	=Test();
		

	}

}
