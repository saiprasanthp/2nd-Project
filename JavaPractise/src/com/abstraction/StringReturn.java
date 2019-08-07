package com.abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringReturn {

	public static void main(String[] args) {
		
		String[][] k=new String[3][2];
		LinkedHashMap<String,String> j=new LinkedHashMap<String,String>();
		j.put("sai", "123");
		j.put("manu", "456");
		j.put("man", "789");
		Set<Entry<String, String>> mm=j.entrySet();
		Iterator<Entry<String, String>> ss=mm.iterator();
		int counter=0;
		while(ss.hasNext()) {
			Entry<String, String> d=ss.next();
			for(int i=0;i<j.size();i++) {
				for(int j1=0;j1<=1;j1++) {
					if(j1>=1) {
						k[i][j1]=d.getValue();
						counter++;
						break;
					}else {
						k[i][j1]=d.getKey();
					}	
				}
				if(counter>1) {
					i=i+counter-1;
				}
			}
			
			}
		for(String[] c:k) {
			for(String a:c) {
				System.out.println(a);
			}
		}
			
		} 	
		}