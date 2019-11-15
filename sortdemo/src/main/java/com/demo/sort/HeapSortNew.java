package com.demo.sort;

public class HeapSortNew{
	public static void main(String[] args) {
		int[] arr= {5,13,1,6,89,8,3};
		
		//build heap first
		for(int i=arr.length/2-1;i>=0;i--) {
			heapify(arr,arr.length,i);
		}
		
		// extract elements of the heap one by one
		for(int i=arr.length-1;i>=0;i--) {
			int temp=arr[0]; // move the first element to the end
			arr[0]=arr[i];
			arr[i]=temp;
			
			// call minHeapify on the reduced heap
			heapify(arr,i,0);
		}
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}

	}

	private static void heapify(int[] arr, int size, int i) {
		int tempRoot=i; // assign root to tempRoot first
		int left=2*i+1; //position of left child= 2* <position of root> +1
		int right=2*i+2; //position of right child= 2* <position of root> +2
		
		if(left<size && arr[left] < arr[tempRoot]) { //if left is greater assign it to tempRoot
			tempRoot=left;
		}
		
		if(right<size && arr[right] < arr[tempRoot]) { //if right is greater assign it to tempRoot
			tempRoot=right;
		}
		
		if(tempRoot!=i) { //if tempRoot is not equal to i
			
			int swap=arr[tempRoot];
			arr[tempRoot]=arr[i];
			arr[i]=swap;
			
			// recursively heapify affected subtrees
			heapify(arr,size,tempRoot);
			
		}
	}
}