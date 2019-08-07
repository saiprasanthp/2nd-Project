package com.Strings;
//Given a string, move all Uppercase alphabets char to the end of the String. Examples: Input : 
//Geeksforgeeks A Computer Science Portal for Geeks!! Output… Read More »



public class EndOfTheString {

	public static void main(String[] args) {
		String j="";
		String h="";
		String n="Geeksforgeeks A Computer Science Portal for Geeks";
		for(int i=0;i<n.length();i++) {
			char c=n.charAt(i);
			if(c>='A' && c<='Z') {
				j=j+c;
				int k=n.indexOf(c);
				if(k>=0) {
					n.replace(c, ' ');
					
				}
			}else {
			char h1=n.charAt(i);
			h=h+h1;
		}
		

	}
		 n=h.concat(j);
			System.out.println(n);

}
}
