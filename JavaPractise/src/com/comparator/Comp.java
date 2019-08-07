package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;
class Comp1 implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return +1;
		}else {
			return 0;
		}
		
	}
	
	
}

public class Comp {

	public static void main(String[] args) {
		Comp1 k=new Comp1();
		TreeSet<Integer> j=new TreeSet<Integer>(k);
		j.add(10);
		j.add(3);
		j.add(1);
		j.add(9);
		System.out.println(j);
		
		
	}

}
