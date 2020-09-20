package com.nano.pramp;

import java.util.PriorityQueue;

public class SortKMessedArray
{
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
		int k = 2;
		int[] sortedArray = sortKMessedArray(arr, k);
		for(int a : sortedArray) {
			System.out.print(a+",");
		}
		System.out.println();
	}
	
	static int[] sortKMessedArray(int[] arr, int k) 
	{
	    // your code goes here
	    if(k==0)
	      return arr;
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for(int i=0;i<arr.length;i++)
	    {
	      pq.offer(arr[i]);
	      if(i>=k)
	      {
	        arr[i-k]=pq.poll();
	      }
	    }
	    while(k>0)
	    {
	      arr[arr.length-k]=pq.poll();
	      k--;
	    }
	    return arr;
	}
}
