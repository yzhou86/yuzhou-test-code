package com.yuzhou.test;

public class SumOne2N {
	public static int sum(int n){
		return (n == 0) ? 0 : n+sum(n-1);
	}
	
	public static void main(String[] args){
		System.out.println(sum(10));
	}
}
