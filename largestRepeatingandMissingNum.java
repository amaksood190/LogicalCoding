package com.tap;

import java.util.Arrays;
import java.util.Scanner;
public class largestRepeatingandMissingNum {
	
	
	static void  printRepeating(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				
				System.out.println(arr[i]);
			}			
		}
	}
//------------------------------------------------------------------------------------------------------	
	static void printLargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
	}
//------------------------------------------------------------------------------------------------------	
	
	static void printSumPositiveORNagative(int arr[]) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=1) {
				sum1=sum1+arr[i];
              System.out.println(sum1);
		
		}
	}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				sum2=sum2+arr[i];
			}
			System.out.println(sum2);
		}
	}
	
//	-----------------------------------------------------------------------------------------------------------------
		
	static int countMaxelementOccurence(int arr[]) {	
	int max=Integer.MIN_VALUE;
	        int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}else if(max==arr[i]) {
				count++;
			}
		}
		return count;
	}
//	------------------------------------------------------------------------------------------------------------------------------
	
	static int findMissingNumber(int arr[]){
		
		int n=arr.length+1;
		int sum1=n*(n+1)/2;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum2=sum2+arr[i];
		}
		return sum1-sum2;	
	}
//-----------------------------------------------------------------
//	============== if given array is sorted orders than this code it will be work ========================== 
	static int minimumRepeatingNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return 0;
	}
	                                                                                                                                                                                         
//----------=============================================================================
//	============== if given array is sorted orders than this code it will be work ========================== 
	static int largestReapetingNumber(int arr[]) {
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]==arr[i+1]) {
			
			return arr[i];
				
			}
		}
		return 0;
		
	}
	//  OR
	
//	static int largestReapetingNumber(int arr[]) {
//		for(int i=arr.length-1;i>=1;i--) {
//			if(arr[i]==arr[i-1]) {
//				return arr[i];
//			}
//		}
//		return 0;
//	}
//	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scan.nextInt();
        }
	
//       int res= largestReapetingNumber(arr);
//       System.out.println(res);
 
//        int res=minimumRepeatingNumber(arr);
//        System.out.println(res);
        
//       int res= findMissingNumber(arr);
//       System.out.println(res);
        
//        int res=countMaxelementOccurence(arr);
//        System.out.println(res);
        
//        printSumPositiveORNagative(arr);
        
        printLargest(arr);
//        printRepeating(arr);
      
	}

}
