package com.yuzhou.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Count1OfBin {
	
	
	public static int countOneBin(int x){
		int count = 0;
		int a = x/2;
		int b = x%2;
		if (b==1) count++;
		while(a >= 2){
			b = a%2;
			a = a/2;
			if (b==1) count++;
		}
		count++;
		return count;
	}
	
	public static void main(String[] args){
		
		System.out.println(countOneBin(10));

		System.out.println(countOneBin(1023));
	}
}
