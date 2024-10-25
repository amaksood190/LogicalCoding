package com.tap;
import java.util.Scanner;

public class printEvenOddNagativeElement {
	
	
	static void printDifferentNumber(int arr[]){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 ) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0 && arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0 && arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		printDifferentNumber(arr);

		
	}

}
