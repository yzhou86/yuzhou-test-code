package com.yuzhou.test;

public class BstTrav {
	public static boolean check(int[] array, int left, int right){
		
		for (int i=left; i<right+1; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		if (right == left){
			return true;
		}
		if (right < left || (right-left+1)%2 == 0){
			return false;
		}
		int left_root = left+(right-left)/2-1;
		int right_start = left_root+1;
		for (int j = left; j<= left_root; j++){
			if (array[j]>array[right]){
				return false;
			}
		}
		for (int j = left_root+1; j<= right-1; j++){
			if (array[j]<array[right]){
				return false;
			}
		}
		return check(array, left, left_root)&&check(array, right_start, right-1);
	}
	
	public static void main(String[] args){
		int[] a = {5,7,6,9,11,10,8};
		System.out.println(check(a,0,6));
	}
}
