package com.demo.sort;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr=new int[] {5,1,8};
		
		HeapSort heapSort=new HeapSort();
		heapSort.sort(arr);
		heapSort.printArray(arr);

	}
	
	private static void printArray(int[] arr) {
		System.out.println("sorted array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	private int[] sort(int[] arr) {
		//Build heap (rearrange array)
		for(int i=arr.length/2-1;i>=0;i--) {
			heapify(arr,arr.length,i);
			//checking how max heap is being built by calling printarray
			//printArray(arr);
		}
		
		//extracting elements from heap one by one
		for(int i=arr.length-1;i>=0;i--)
		{
			// Move current root to end
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			//call max heapify on the reduced heap
			heapify(arr,i,0);
			//printArray(arr);
			
		}
		return arr;
	}
	
	//to heapify a subtree rooted with node i which is an index in arr
	
	private void heapify(int[] arr,int size,int i) {
		int tempRoot=i; // initialize tempRoot to the root
		int left=2*i+1; //left=2*i+1;
		int right=2*i+2; // right=2*i+2
		
		// if left child is larger than root
		if(left<size && arr[left]>arr[tempRoot] ){
			tempRoot=left;
		}
		
		// if right child is larger than root
		if(right<size && arr[right]>arr[tempRoot] ){
			tempRoot=right;
		}
		
		// if tempRoot is not root
		if(tempRoot!=i) {
			int swap=arr[tempRoot];
			arr[tempRoot]=arr[i];
			arr[i]=swap;
			
			//recursively heapify the affected sub-tree
			heapify(arr,size,tempRoot);
		}
		
		
	}

}
