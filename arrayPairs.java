package com.array;

import java.util.Scanner;


public class arrayPairs {
	
	static void firstValueSmsller(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
         if(arr[i]<arr[j]) {
         System.out.println(arr[i]+" "+arr[j]);
		}
		
	}
	}
	}
//	----------------------------------------------------------------------------------------------------------
	static void printAllPair(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+" "+arr[j]+")");


			}
		}
		
	}
	
//	--------------------------------------------------------------------------------------------------
	static int maxProduct(int arr[]) {
		int firstLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		int firstSmallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstSmallest) {
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
				
			}
			else if(arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		int p1=firstLargest*secondLargest;
		int p2=firstSmallest*secondSmallest;
		return p1>p2?p1:p2;
		
	}
//	-------------------------------------------------------------------------------------------------------
	
	
	static int addFirstandSecondSmallestElement(int arr[]) {
		int firstSmallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstSmallest) {
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}else if(arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		return firstSmallest+secondSmallest;
		
	}
//	-----------------------------------------------------------------------------
	
	static int addFirstandSecondLargestElement(int arr[]){
		
		int firstLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
				
			}
		}
		return firstLargest+secondLargest;
	}

	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int arr[]=new int [N];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	
//	int res=addFirstandSecondLargestElement(arr);
//	System.out.println(res);
	
//	int res=addFirstandSecondSmallestElement(arr);
//	System.out.println(res);
	
//	int res=maxProduct(arr);
//	System.out.println(res);
	
//	printAllPair(arr);
	
	firstValueSmsller(arr);
	
	}

}
