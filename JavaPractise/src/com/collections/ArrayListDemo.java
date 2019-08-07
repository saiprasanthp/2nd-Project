package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		al.add(a[i]);
		}
		System.out.println(al);
		Object[] kk=al.toArray();
		for(int i=0;i<kk.length;i++) {
			Object l=kk[i];
			Integer all=(Integer)l;
			al.set(i, 9999);
		}
		System.out.println(al);
	}
	
}