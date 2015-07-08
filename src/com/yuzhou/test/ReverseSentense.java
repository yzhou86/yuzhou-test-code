package com.yuzhou.test;

public class ReverseSentense {
	public static void main(String[] args){
		String sent = "this is a sentense.";
		
		int y = sent.length()-1;
		
		for(int i=sent.length()-1; i>=0; i--){
			if (sent.charAt(i)==' ' || i==0){
				if (i<y){
					System.out.print(sent.substring(i!=0?i+1:i,y+1)+" ");
				}
				y = i-1;
			}
		}
		
	}
}
