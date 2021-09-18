package com.nano.leet;

import java.util.Arrays;
import java.util.Comparator;

public class RankTransformationArray
{
	public static void main(String[] args)
	{
		
	}
	
	 public int[] arrayRankTransform(final int[] arr) {
	        int l = arr.length;
	        if(l==0)
	            return arr;
	        int[] result = new int[l];
	        for(int i=0;i<l;i++){
	            result[i]=i+1;
	        }
	        
	        
	        
	        Arrays.sort(result, new Comparator<Integer>(){
	           public int compare(Integer a, Integer b) {
	               return a-b; //arr[a-1]-arr[b-1];
	           }
	        }); 
	        //(a,b)->arr[a-1]-arr[b-1]);
	        return result;
	    }
}
