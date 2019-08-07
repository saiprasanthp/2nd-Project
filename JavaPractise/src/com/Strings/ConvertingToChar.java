package com.Strings;
//converting string to character
public class ConvertingToChar {

	public static void main(String[] args) {
		String name="hello world";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
