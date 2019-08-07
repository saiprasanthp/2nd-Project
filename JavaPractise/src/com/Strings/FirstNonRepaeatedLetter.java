package com.Strings;

import java.util.Arrays;

public class FirstNonRepaeatedLetter {

	public static void main(String[] args) {
		
		String name="Morning";
	char[] l= name.toCharArray();
	Arrays.sort(l);
	int count=0;
	for(int i=0;i<l.length;i++) {
		int counter=1;
		for(int j=i+1;j<l.length;j++) {
			if(l[i]==l[j]) {
				counter++;
			}else {
				count++;
				System.out.println(count);
				if(count>0) {
					System.out.println(l[i]);
					break;
				}
			}
		}
		break;
	}
	}

}
