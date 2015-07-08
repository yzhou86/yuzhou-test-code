package com.yuzhou.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchOrder {
			
	public static void main(String[] args){
		int  w[][] = {{0,1,2,3},{1,0,2,3},{2,2,0,2},{3,3,2,0}};
		int order[] = {1,3,2,0};
		int result[] = {1,3,2,0};
		int n = 4;
		int m = n;

		while(m>1){
			//System.out.println("**round"+m);
			for (int k=0;k<m/2;k++){
				//System.out.print("set"+k+",");
				int p1 = order[2*k];
				int p2 = order[2*k+1];
				//System.out.print("p1="+p1+",p2="+p2+",");
				order[k] = w[p1][p2];
				//System.out.print("order["+k+"]="+w[p1][p2]+",");
				result[k+m/2] = p1+p2-order[k];
				//System.out.print("result["+(k+m/2)+"]="+(p1+p2-order[k])+",");
			}
			
			m = m/2;
			//System.out.println();
		}

		result[0] = order[0];
		
		for (int j=0; j<n ; j++){
			System.out.print(result[j]+" ");
		}
	}
}
