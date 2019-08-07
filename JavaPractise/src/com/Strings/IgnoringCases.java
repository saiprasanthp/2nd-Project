package com.Strings;
//equalsignorecase
public class IgnoringCases {

	public static void main(String[] args) {
		String name="greekforgreeks";
		String name1="GREEKFORGREEKS";
		boolean h=name.equalsIgnoreCase(name1);
		if(h) {
			System.out.println("same");
		}

	}

}
