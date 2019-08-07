package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractise {

	public static void main(String[] args) {
		HashMap<Integer,String> kk=new HashMap<Integer,String>();
		kk.put(10, "sai");
		if(kk.containsKey(10)) {
			Set<Entry<Integer, String>> m=kk.entrySet();
			Iterator<Entry<Integer, String>> ll=m.iterator();
			while(ll.hasNext()) {
				Entry<Integer, String> j=ll.next();
				System.out.println(j);
				String a=j.getValue();
				System.out.println(a);
			}
		}else {
			System.out.println(kk);
		}
	}

}
