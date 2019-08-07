package com.Inheritance;
interface A{
	public abstract void m1();
	public abstract void m2(int i);

}
interface B {
	public abstract void m1();
	public abstract int m2();
}
class Ca implements A,B{
	public void m1() {
		System.out.println("jai");	
	}
	public void m2(int i) {
		
	}
	public int m2() {
		return 10;
	}
}
public class MutipleInheritance {

	public static void main(String[] args) {
		Ca h=new Ca();
		h.m1();
		int j=h.m2();
		System.out.println(j);
	}
}
