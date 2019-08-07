package com.purpose;

public class PrimeNumbers {

	public static void main(String[] args) {
		int k=7;
		int counter=0;

		for(int i=2;i<=k-1;i++) {
			if(k%i==0) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println("it is prime number");
		}else {
			System.out.println("not prime");
		}

	}

}
