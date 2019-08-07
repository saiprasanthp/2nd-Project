package com.purpose;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] k= {10,9,8,7,6,5,3,2,1};
		int temp=0;
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i]>k[j]) {
					temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
		}
		for(int l:k) {
			System.out.println(l);
		}

	}

}
