package com.manthano.sort;

import java.util.Arrays;

public class Sort
{
	public int[] merge(int[] a, int[] b){

		int i=0;
		int j=b.length-1;
		int k=0;
		int[] result = new int[a.length+b.length];
		while(i<a.length && j>=0){
			if(a[i]<b[j]){
				result[k]=a[i];
				//System.out.println("a");
				i++;
				k++;
			}
			else if(a[i]==b[j]) {
				result[k]=a[i];
				i++;
				k++;
				j--;
			}
			else{
				result[k]=b[j];
				//System.out.println("b");
				j--;
				k++;
			}
		}

		while(i<a.length){
			result[k++]=a[i];
			i++;
		}

		while(j>=0){
			result[k++]=b[j];
			j--;
		}

		return result;
	}

	public static void main(String[] a){
		Sort s = new Sort();
		int[] A1 = {2,3,4,5}; //{2};//{2,3,4,5};
		int[] A2={9,8,7,5}; ; //{3};//{9,8,7,5};
		//System.out.println(Arrays.toString(s.merge(A1,A2)));
		System.out.println(Arrays.toString(s.merge(A1,A2))); int[] A3={0,1}; int[]
				A4={}; System.out.println(Arrays.toString(s.merge(A3,A4))); int[]A5={}; int[]
						A6={3,2}; System.out.println(Arrays.toString(s.merge(A5,A6)));

	}

}
