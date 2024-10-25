package com.tap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class ElementOccurence {
	static String greaterThen(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>k) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		return "sknfkf";
	
	}
//	------------------------------------------------------------------------
	static void minSum(int arr[]) {
		
	int smallest=Integer.MAX_VALUE;
//	int secondSmallest=Integer.MAX_VALUE;
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]<smallest) {
				System.out.println(arr[i]+" "+arr[j]);
				
				
//			}else if(arr[i]+arr[j]<secondSmallest) {
//				secondSmallest=arr[i]+arr[j];
//			}
		}
		
	} 
	}
	}
	
	
	
//	---------------------------------------------------------------------------
	static int missingElement(int []arr) {
		int n=arr.length+1;
		int sum1=n*(n+1)/2;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum2=sum2+arr[i];
		}
		return sum1-sum2;

	}
//	-------------------------------------------------------------------------------------
	
	static void repeatingElement(int arr[]) {
		HashMap<Integer, Integer> FrequencyMap=new HashMap<>();
		for(int num : arr) {
			FrequencyMap.put(num, FrequencyMap.getOrDefault(num, 0)+1);
			for(int num1 : FrequencyMap.keySet()) {
           if(FrequencyMap.get(num1)>1) {
               System.out.println(num1);
		}
	}
		}
	}
//	-----------------------------------------------------------------------------------------
	static void swappingIndex(int arr[]) {
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	System.out.println();
	}
//	---------------------------------------------------------
	static void countLagestElement(int arr[]) {
		int count=0; int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				count=1;
			}
			
			else if(arr[i]==max){
				count++;
			}
		}
		System.out.println(count);
		
	}
//	---------------------------------------------------------------
	static int repeatingLargestElement(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
//-----------------------------------------------------------------------	
	static void replaceEvenElement(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print("0"+" ");
			}
			else if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
//	------------------------------------------------------------------------------
	
static void printincreasSubarry(int arr[]) {
	int count=1, max=0, end=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]>=arr[i]) {
			count++;
		}
		else {
			if(count>max) {
				max=count;
				end=i;
			}
			count=1;
		}
		
		}
	if(count>max) {
		max=count;
		end=arr.length-1;
	}
	for(int i=end-max+1;i<=end;i++) {
		System.out.print(arr[i]+" ");
	}
}
	
	
	
	
//	/----------------------------------------------------------------------------------------------
	static void printSumPositiveNagative(int arr[]){
		        int sumPositive=0;
		        int sumNegative=0;
		        for(int i=0;i<arr.length;i++) {
		        	if(arr[i]>=0) {
		        		sumPositive=sumPositive+arr[i];
		        	}
		        	else if(arr[i]<0) {
		        		sumNegative=sumNegative+arr[i];	
		        	}
		        }
		        System.out.println(sumPositive);
		        System.out.print(sumNegative);
	}
	
	
	
//	----------------------------------------------------------------------------------------------------
	static void reverseOddArray(int arr[]){
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}

//	-------------------------------------------------------------------------------------
	static void printnegativeOddEvenElement(int arr[]) {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
			
	}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0 && arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
//	------------------------------------------------------------------------------------------
	
//	--------------------------------------------------------------------------
	static int lagestRepeatingElement(int arr[]) {
		for(int i=arr.length-2;i>=0;i--) {
                 if(arr[i]==arr[i+1]) {
                	 return arr[i];
                	 }
                 }
		return -1;
	}
	
//	-----------------------------------------------------------------------------------------------------------------------
	static void printElementWithoutReapiting(int arr[]){
//		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);	
//				count++;
			}
			else {
				System.out.println(arr[i]);	
			}
			}
			
			System.out.println(arr[arr.length-1]);
		
	}
//	----------------------------------------------------------------------------------------------------------------------------------
	static void printElementsOccurence(int arr[]){
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				System.out.println(arr[i]+"-"+count);
				count= 1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+count);
		
	}
//-----------------------------------------------------------------------------------------------------------------------------	
	static void printDiffrencePair(int arr[],int k){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] - arr[j]==k || arr[j]-arr[i]==k) {
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
			
		}
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------
	static void countPair(int arr[],int k){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					
					System.out.println(arr[i]+","+arr[j]);
				}
			}
			
		}
		
	}
//	------------------------------------------------------------------------------------------------------------------------
static void	allPair(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
					
					System.out.println(arr[i]+","+arr[j]);
				
				
			}
		}
	}
	
//--------------------------------------------------------------------------------------------------------------------------	
	static int negativeNumberMinimumPairProduct(int arr[]){
		int firstLargest=Integer.MAX_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstLargest) {
				secondLargest=firstLargest;
			}
			else if(arr[i]<secondLargest) {
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
//--------------------------------------------------------------------------------------------------------------------------------	
static int occurenceOfSmallestNumber(int arr[]){
		
		int min=Integer.MAX_VALUE;
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			else if(arr[i]==min) {
				count++;
			}
		}
		return count;
	
    }
	
//-----------------------------------------------------------------------------------------------------------------------------	
  static int occurenceOfLargestNumber(int arr[]){
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
//----------------------------------------------------------------------------------------------------------------------------------	
	static int findNagativePairProduct(int arr[]){
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
//---------------------------------------------------------------------------------------------------------------------------
	static int maximumPairProduct(int arr[]){
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
		return firstLargest*secondLargest;
		
	}
//----------------------------------------------------------------------------------------------------------------------------	
	static int minimmumPair(int arr[]){
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
		return firstSmallest+secondSmallest;
		
	}
//-----------------------------------------------------------------------------------------------------------------------------	
	static int maxPair(int arr[]){
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
		return firstLargest+secondLargest;
		
	}
//------------------------------------------------------------------------------------------------------------------------------
static int secondLargest(int arr[]){
	int firstLargest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>firstLargest) {
			secondLargest=firstLargest;
			firstLargest=arr[i];
		}else if(arr[i]>secondLargest) {
			secondLargest=arr[i];
			
		}
		
	}
	return secondLargest;
	
}
//-----------------------------------------------------------------------------------------------------------------------------------	
	static int max(int arr[]){
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
	return max;
	}
		static int countElement(int arr[]){
			int count=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==max) {
					count++;
				}
				
			}
			return count;
			
		}	
//	---------------------------------------------------------------------------------------------------------------------------
	int index=0;
	static int findIndexNumber(int arr[], int k){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {				
				return i;				
			}
		}
		return -1;
	}

//	--------------------------------------------------------------------------------------------------------------------------
	static int findElementOccurence(int arr[], int k){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int [n];
//		int k=scan.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		int k=scan.nextInt();
//		int res= findElementOccurence(arr,k);
//		System.out.println(k+"-"+res);
		
//	int res=	findIndexNumber(arr,k);
//	System.out.println(res);
		
//	int max=max(arr);
//	int res=countElement(arr,max);
//			System.out.println(res);
		
//		int res=secondLargest(arr);
//		System.out.println(res);
//		
//	  int res=maxPair(arr);
//		System.out.println(res);
		
//		int res=minimmumPair(arr);
//		System.out.println("Minimmum Pair = "+res);
		
//		int res=maximumPairProduct(arr);
//		System.out.println("maximumPairProduct = "+res);
		
//	int res=findNagativePairProduct(arr);
//	System.out.println(res);
	
//	int res=occurenceOfLargestNumber(arr);
//	System.out.println(res);
	
		
//		int res=occurenceOfSmallestNumber(arr);
//		System.out.println(res);
//		
//		int res=negativeNumberMinimumPairProduct(arr);
//		System.out.println(res);
		
//		allPair(arr);
//		int k=scan.nextInt();
//		countPair(arr,k);
		
//		int k=scan.nextInt();
//		printDiffrencePair(arr,k);
		
//		printElementsOccurence(arr);
		
//		printElementWithoutReapiting(arr);
//		int res=lagestRepeatingElement(arr);
//    System.out.println(res);
		
		
		
		
//		printnegativeOddEvenElement(arr);
		
//		reverseOddArray(arr);
		
//		printSumPositiveNagative(arr);
//		int res=max1(arr);
//	    System.out.println(res);
		
//		printincreasSubarry(arr);
//		replaceEvenElement(arr); 
		
//		int res=repeatingLargestElement(arr);
//		System.out.println(res);
		
//		countLagestElement(arr);
		
//		swappingIndex(arr);
		
		
//		repeatingElement(arr);
		
//		int res=missingElement(arr);
//		System.out.println(res);
		
//		minSum(arr);
		
	String res=greaterThen(arr,k);
	System.out.println(res);
		
	}
}
