package com.purpose;
//arraysChecking for duplicates

import java.util.Arrays;

public class ArrayChecking {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,2,3};
		Arrays.sort(a); //1,1,2,2,3,3,4
		for(int i=0;i<a.length;i++) {
			int counter=1;

			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					counter++;
					
				}else {
					break;
				}
			}
			System.out.println(a[i]+" "+counter);
			i=i+counter-1;
		}

	}

}
