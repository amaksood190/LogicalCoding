package com.tap;

import java.util.Scanner;


public class reversePalindromeCountSpaceCountConsonentRemoveSubString {
	static int countLowerCaseLatter(String s){
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') {
				count++;
			}
			
		}
		return count;
	}
//----------------------------------------------------------------	
	static int countUpperCaseLatter(String s){
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				count++;
			}
			
		}
		return count;
	}
	
//	-----------------------------------------------------------------------------------
	static int countConsonent(String s){
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				count++;
				
			}
			
		}
		return count;
	}
//-------------------------------------------------------------------	
	static int countVowel(String s){
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='o' || ch=='i' || ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
				
				
			}
		}
		return count;
		
	}
	static int countWords(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
			
		}
		return count;
	}
	
	
//	--------------------------------------------------------
 	static int countSpace(String s) {
 		int count=0;
 		for(int i=0;i<s.length();i++) {
 			if(s.charAt(i)==' ') {
 				count++;
 			}
 		}
 		return count;
 	}
	
//--------------------------------------------------------------------------------------	
	static String checkPalindrome(String s) {
		 int j=s.length()-1;
		 int i=0;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return "No";
			}
		}
		return "Yes";	
		
	}
	
//	-----------------------------------------------------------------------------------------------------------------
	static void printReverse(String s){
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
//			char ch=s.charAt(i);
//			System.out.print(ch);
			t=t+s.charAt(i);
		}
		System.out.print(t);
	}
//	----------------------------------------------------------------------------------
	static void printCharecter(String s) {
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
//	System.out.print(s.charAt(i)+" ");
	System.out.println(ch+" ");
}
}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
//	System.out.println("Enter some charecter:");
//	printCharecter(s);
//	printReverse(s);
	
    String res =checkPalindrome(s);
	System.out.println(res);  

//	int res=countSpace(s);
//	System.out.println(res);
	
//	int res=countWords(s);
//	System.out.println(res);
	
//	int res=countVowel(s);
//	System.out.println(res);
	
//	int res=countConsonent(s);
//	System.out.println(res);
	
//	int res=countUpperCaseLatter(s);
//	System.out.println(res);
	
//	int res=countLowerCaseLatter(s);
//	System.out.println(res);
	
	}

}
