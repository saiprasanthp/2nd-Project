package com.purpose;
//getting only the characters in a string while it consists of  both characters and numbers
public class String_and_numbers {

	public static void main(String[] args) {
		String s="sai123h";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			char v=c[i];
			Character h = null;
			if(h.isAlphabetic(v)) {
				System.out.println(v);
			}
		}

	}

}
