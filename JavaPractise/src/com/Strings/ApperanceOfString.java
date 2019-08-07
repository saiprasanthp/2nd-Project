package com.Strings;

import java.util.Arrays;

//apperance of string
public class ApperanceOfString {

	public static void main(String[] args) {
		String name="greekforgreeks";
		char[] k=name.toCharArray();
		Arrays.sort(k);
		for(int i=0;i<k.length;i++) {
			int count=1;
			for(int j=i+1;j<k.length;j++) {
				if(k[i]==k[j]) {
					count++;
				}else {
					break;
				}
			}
			System.out.println(k[i]+" "+" occurance"+count);
			i=i+count-1;
		}

	}

}
