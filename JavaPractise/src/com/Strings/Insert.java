package com.Strings;
//Given a List of String, the task is to convert the List to a comma separated String in 
public class Insert {

	public static void main(String[] args) {
		String name="sai";
		String h="prasanth";
		name=name.concat(h);
		System.out.println(name);
		
		StringBuffer bf=new StringBuffer("manoj");
		StringBuffer bf1=new StringBuffer("kumar");
		System.out.println(bf.append(bf1));
		
		String gree="greek for greeks";
		gree=gree.replaceAll(" ", ",");
		System.out.println(gree);



	}

}
