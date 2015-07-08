package com.yuzhou.test;

import java.util.ArrayList;
import java.util.List;

public class DevideNum {
	
	public static List<Integer> devide(int num){
		
		if (num <= 1) {
			return new ArrayList();
		}
		else {
			List<Integer> ret = new ArrayList();
			int count=0;
		    for (int i=2;i <= num;i++){  
		        while(num != i){ 
		            if(num%i != 0){  
		                break;
		            }
		            ret.add(i); 
		            num = num/i;
		        }
		        
		    }
		    if (num>1) {
		    	ret.add(num);
		    }
		    return ret;
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(devide(1));
		System.out.println(devide(2));
		System.out.println(devide(12));
		System.out.println(devide(233));
		System.out.println(devide(256));
		//System.out.println(devide(Integer.MAX_VALUE));
	}
	
}
