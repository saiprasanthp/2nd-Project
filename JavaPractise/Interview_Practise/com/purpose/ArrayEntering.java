package com.purpose;

import java.util.Arrays;

public class ArrayEntering {

	public static void main(String[] args) {
		int[] k= {1,3,2,1,2,3,5,7,8};
		Arrays.sort(k); //1,1,2,2,3,3,5,7,8
		int j=0;
		int[] l=new int[k.length];
		for(int i=0;i<k.length-1;i++) {
			if(k[i]!=k[i+1]) {
				l[j]=k[i];
				j++;
			}
			
		}
		l[j]=k[k.length-1];
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}

	}

}
