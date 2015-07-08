package com.yuzhou.test;

public class MinHeap {
	
	public static void minHeapify(int[] heap, int length, int i){
		if (i >=0 && i<length){
			int left = 2*i+1;
			int right = left+1;
			int min = i;
			if (left < length && heap[left]<heap[i]){
				min = left;
			}
			if (right < length && heap[right]<heap[i]){
				min = right;
			}
			if (min!=i){
				int tmp = heap[i];
				heap[i] = heap[min];
				heap[min] = tmp;
				minHeapify(heap, length, min);
			}
		}
	}
	
	public static void printHeap(int[] heap, int length){
		for (int i=0; i<length; i++){
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
	
	public static void buildMinHeap(int[] heap, int length){
		for (int j = (length-1)/2 ; j>=0; j--){
			minHeapify(heap, length, j);
		}
		//printHeap(heap, length);
	}
	
	public static void minHeapSort(int[] heap, int length){
		buildMinHeap(heap, length);
		for (int j=length-1; j>=0; j--){
			int tmp = heap[0];
			heap[0] = heap[j];
			heap[j] = tmp;
			System.out.println("sort:"+heap[j]+" ");
			buildMinHeap(heap, j);
		}
	}
	
	public static void main(String[] args){
		int[] heap = { 6, 3, 1, 5, 4, 2, 0 };
		int length = 7;
		minHeapSort(heap, length);
	}
	
}
