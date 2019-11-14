package com.demo.sort;

public class CountingSort {
	public static void main(String[] args) {
		
		String inputString="joygurusdfjofygrwurtu";
		int[] alphabets=new int[26];
		
		for(int i=0;i<inputString.length();i++) {
			char tempChar=inputString.charAt(i);
			int asciiIndex=(int)(tempChar-'a');
			alphabets[asciiIndex]++;
		}
		
		for(int i=0;i<alphabets.length;i++) {
			if(alphabets[i]>0) {
				char c=(char)(i+'a');
				System.out.print(c+" "+alphabets[i]+",");
			}
		}
		
		System.out.println();
		
		for(int i=alphabets.length-1;i>=0;i--) {
			if(alphabets[i]>0) {
				char c=(char)(i+'a');
				System.out.print(c+" "+alphabets[i]+",");
			}
		}
		
		
		
		
	}


}
