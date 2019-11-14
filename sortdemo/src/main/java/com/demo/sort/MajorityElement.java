package com.demo.sort;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;


public class MajorityElement {
	
public static void main(String[] args) {
	int[] inputArray=new int[] {7,3,5,3,5,7,3,2,3,3,3};
	Map<Integer,Integer> map=new HashMap<>();
	int maxKey=Integer.MIN_VALUE;
	int maxValue=0;
	
	
	for(int i=0;i<inputArray.length;i++) {
		Integer occurrenceCount=map.get(inputArray[i]);
		if(occurrenceCount==null) {
			map.put(inputArray[i], 1);
			occurrenceCount=1;
		}else {
			map.put(inputArray[i], ++occurrenceCount);
		}
		if(occurrenceCount>maxValue) {
			maxValue=occurrenceCount;
			maxKey=inputArray[i];
		}
			

	}
	
	if(maxValue>inputArray.length/2) {
		System.out.println("majority element is "+maxKey+" with occurrence count "+maxValue);
	}else {
		System.out.println("-1");
	}
	
	map.forEach((k,v)->System.out.println("Key="+k+" value="+v));

//	for(Iterator<Map.Entry<Integer, Integer>> iter=map.entrySet().iterator();
//			iter.hasNext();) {
//		Map.Entry<Integer, Integer> entry=iter.next();
//		System.out.println("Key="+entry.getKey()+" value="+entry.getValue());
//
//	}
//	
//	while(iter.hasNext()) {
//		Map.Entry<Integer, Integer> entry=iter.next();	
//		System.out.println("Key="+entry.getKey()+" value="+entry.getValue());
//	}
	

}

}
