package com.manthano.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeListFromArraySortListWillSortArrayAlso
{
	public static void main(String[] args)
	{
		// No sorting happens in case of 1-d array
		int[] arr = {2,3,1,2,88,5,6,4,7,8,5,3};
		printArray(arr);
		List<Integer> l = toList(arr);
		Collections.sort(l,(a,b)->a-b);
		System.out.println();
		printArray(arr);
		
		// now for 2-d array when Arrays.asList(a) is used
		int[][] arr2 = createArray();
		print2DArray(arr2);
		//List<Integer> l = toList(arr2);
		Collections.sort(Arrays.asList(arr2),(a,b)->a[0]-b[0]);
		System.out.println();
		print2DArray(arr2);
	}

	private static void printArray(int[] a)
	{
		for(int i : a) {
			System.out.print(i + ",");
		}
	}
	
	private static void print2DArray(int[][] a)
	{
		for(int[] ar : a) {
			for(int i : ar)
			System.out.print(i + ",");
		}
	}
	
	private static List<Integer> toList(int[] a)
	{
		List<Integer> l = new ArrayList<>();
		for(int i : a) {
			l.add(i);
		}
		return l;
	}
	
	private static int[][] createArray(){
		int[][] arr2 = new int[5][];
		int[] e0 = new int[2];
		e0[0]=100;
		e0[2]=200;
		arr2[0]=e0;
		int[] e1 = new int[2];
		e1[0]=1;
		e1[2]=2;
		arr2[1]=e1;
		int[] e2 = new int[2];
		e2[0]=1;
		e2[2]=5;
		arr2[2]=e2;
		int[] e3 = new int[2];
		e3[0]=8;
		e3[2]=10;
		arr2[3]=e3;
		int[] e4 = new int[2];
		e4[0]=3;
		e4[2]=4;
		arr2[4]=e4;
		int[] e5 = new int[2];
		e5[0]=4;
		e5[2]=7;
		arr2[5]=e5;
		int[] e6 = new int[2];
		e6[0]=4;
		e6[2]=7;
		arr2[6]=e6;
		
		return arr2;
	}
}
