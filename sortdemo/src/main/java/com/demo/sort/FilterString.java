package com.demo.sort;

public class FilterString {
	public static void main(String[] args) {
		String inputString="s_b_w_k_u_m";
		String[] strArray=inputString.split("_");
		String result="";
		System.out.println("result.length="+result.length());
		for(int i=0;i<strArray.length;i++) {
			result=result+strArray[i].toUpperCase();
		}
		
		System.out.println(result);
	
	//new
	String anotherString="SBWKUM";
	String secondResult="";
	
	for(int i=0;i<anotherString.length();i++) {
		Character charValue=anotherString.charAt(i);
		secondResult=secondResult+Character.toLowerCase(charValue)+"_";
	}
	if(secondResult.length()>0&&secondResult.charAt(secondResult.length() -1)== '_') {
		secondResult=secondResult.substring(0, secondResult.length() -1);
	}
	
	System.out.println(secondResult);
}

}
