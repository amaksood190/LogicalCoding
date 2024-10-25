package com.tap;

import java.util.Scanner;

public class SortedArrays {
	
	
	
	
	
//-------------------------------------------------------------------------------------	
	static void printWithoutReapetElement(int arr[]) {
		int count=1;
		int uniqueCount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					uniqueCount++;
				}
				count=1;
			}
			
		}
		if(count==1) {
			uniqueCount++;
		}
		System.out.println(uniqueCount);
	}
//	-------------------------------------------------------------------------------
	static void printUniqueValues(int arr[]) {
		
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					System.out.println(arr[i]+" ");
				}
				count++;
			}
		}
		if(count==1) {
			System.out.println(arr[arr.length-1]);
		}
	
	}
//	---------------------------------------------------------------------------
	static void printElementWithoutRepating(int arr[]) {
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length-1]);
		
		
	}
//-------------------------------------------------------------------------------------------------
	static void occurenceOfEachElement(int arr[]) {
		int count =1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]+"-"+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+count);
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int arr[]=new int [n];
         for(int i=0;i<arr.length;i++) {
        	 arr[i]=scan.nextInt();
         }
//         occurenceOfEachElement(arr);
//         printElementWithoutRepating(arr);
         printUniqueValues(arr);
//         printWithoutReapetElement(arr);
         
	}

}
