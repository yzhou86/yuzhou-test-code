package com.yuzhou.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	public static void main(String[] args){
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = dtf.format(new Date(((new Date()).getTime()-999L*3600L*1000L)));
		System.out.println(((new Date()).getTime()));
		System.out.println(999L*3600L*1000L);
		System.out.println( dtf.format(new Date()));
		System.out.println(time);
		
		List<String> list = new ArrayList();
		list.add("test");
		if (!list.contains("a")){
			list.add("a");
		}
		if (!list.contains("test")){
			list.add("test");
		}
		
	}
}
