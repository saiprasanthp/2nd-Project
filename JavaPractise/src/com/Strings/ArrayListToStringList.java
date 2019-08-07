package com.Strings;
//Given an ArrayList of String, the task is to convert the ArrayList to
//String array in java. Examples: Input: ArrayList = [ “Geeks”, “for”, “Geeks”… Read More »


import java.util.ArrayList;

public class ArrayListToStringList {

	public static void main(String[] args) {
		ArrayList<String> j=new ArrayList<String>();
		j.add("h");
		j.add("h1");
		j.add("h2");
		j.add("h4");
		j.add("h5");
		j.add("h6");
		String[] k=new String[j.size()];
		for(int i=0;i<j.size();i++) {
			String j1=j.get(i);
			
			k[i]=j1;
		}
		for(String mm:k) {
			System.out.println(mm);
		}
		double d=0;
		String name="sai";
		byte[] g=name.getBytes();
		for(int i=0;i<g.length;i++) {
			d=d+g[i];
		}
		System.out.println(d);
		String m="123.4";
		double i=Double.parseDouble(m);
		System.out.println(i);
		Integer kk=10;
		String s1=kk.toString();
		System.out.println(s1);
		StringBuffer bf=new StringBuffer("sai");
		bf=bf.reverse();
		System.out.println(bf);
		


	}

}
