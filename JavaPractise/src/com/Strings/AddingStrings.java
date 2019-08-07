package com.Strings;

public class AddingStrings {

	public static void main(String[] args) {
		String name="";
		char c='a';
		name=name+c;
		System.out.println(name);
		String m="sai";
		m=m.concat("k");
		System.out.println(m);
		StringBuffer bf=new StringBuffer("s");
		bf=bf.append("ai");
		System.out.println(bf);
		char g1='k';
		String nn=Character.toString(g1);
		String kk=nn.toUpperCase();
		System.out.println(kk);
	
		
		Integer i=10;
		String name1=i.toString();
		System.out.println(name1);
		
		

	}

}
