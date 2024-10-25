package com.isPrimePairs;

import java.util.Scanner;

public class FindPairsPrime {

	static boolean isPrime(int num) {
		if(num<=1) {
		return false;
	}
		for(int i=2;i*i<=num;i++) {
        if(num%i==0) {
        	return false;
        }
		}
		return true;
	}
	
	static void findPrimePairs(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(isPrime(arr[i]) && isPrime(arr[j])) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
//		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		findPrimePairs(arr);
//		boolean b=isPrime(num);
//		System.out.println(b);
		}

}

