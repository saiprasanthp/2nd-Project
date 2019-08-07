package com.Inheritance;
class Over{
	public Object m1() {
		return "sai";
	}
	
}
class Override extends Over {
	public String m1() {
		return "manoj";
	}
}

public class OverRidingRules {

	public static void main(String[] args) {
		Override j=new Override();
		Object o=j.m1();
		System.out.println(o);
		

	}

}
