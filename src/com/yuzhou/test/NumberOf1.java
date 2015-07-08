package com.yuzhou.test;

public class NumberOf1 {
	
	public static int calcNumOf1(String num){
		System.out.println("calc="+num);
		int len = num.length();
		if (len == 0) return 0;
		if (len == 1){
			if (Integer.valueOf(num.charAt(0))==0) return 0;
			if (Integer.valueOf(num.charAt(0))>0) return 1;
		}		
		
		int numOfFirst = 0;
		int numberOfOther = (num.charAt(0)-'0')*(len-1)*PowerTen(len-2);
		System.out.println("numberOfOther="+numberOfOther);
		int numberOfBatch1 = calcNumOf1(num.substring(1));
		System.out.println("numberOfBatch1="+numberOfBatch1);
		if ((num.charAt(0)-'0')>1){
			numOfFirst = PowerTen(len-1);
		}else if ((num.charAt(0)-'0')==1){
			numOfFirst = Integer.valueOf(num.substring(1))+1;
		}
		System.out.println("numOfFirst="+numOfFirst);
		return numOfFirst+numberOfOther+numberOfBatch1;
		
	}
	
	public static int PowerTen(int x){
		int total = 1;
		for (int i=0; i<x; i++){
			total *= 10;
		}
		return total;
	}
	
	public static void main(String[] args){		
		System.out.println(calcNumOf1("88888"));
	}
}
