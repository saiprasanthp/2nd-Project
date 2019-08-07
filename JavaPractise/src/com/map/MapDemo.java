package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> k=new HashMap<Integer,Integer>();
		k.put(1, 10);
		k.put(2, 20);
		k.put(4, 40);
		k.put(4, 60);
		Set<Integer> ll=k.keySet();
		Iterator<Integer> m=ll.iterator();
		while(m.hasNext()) {
			Integer l=m.next();    
			System.out.println(l);
		}
		Set<Entry<Integer, Integer>> mm=k.entrySet();
		Iterator<Entry<Integer, Integer>> g=mm.iterator();
		while(g.hasNext()) {
			Entry<Integer, Integer> f=g.next();
			System.out.println(f);
		}
	

	}

}
