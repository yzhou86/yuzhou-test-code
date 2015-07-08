package com.yuzhou.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaxNumStr {
	
	public static String numChars = "0123456789";
	
	public static int maxNumStr(String str){
		if (str==null || str.length()==0){
			return 0;
		}
		boolean count = false;
		int len = 0;
		int maxLen = 0;
		for (int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if (numChars.indexOf(ch)>=0){
				if (!count) count = true;
				len++;
			}else{
				if (len > maxLen) maxLen = len;
				count = false;
				len = 0;
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args){
		String s = "ax2saf231312654642we0rwf5621234754afawer456wr";
		System.out.println(maxNumStr(s));
	}
}
