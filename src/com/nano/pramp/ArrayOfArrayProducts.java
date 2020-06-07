package com.nano.pramp;

/**
 * 
 * https://www.pramp.com/challenge/7Lg1WA1nZqfoWgPbgM0M
 * Array of Array Products
Given an array of integers arr, you’re asked to calculate for each index i the product of all integers except the integer at that index (i.e. except arr[i]). Implement a function arrayOfArrayProducts that takes an array of integers and returns an array of the products.

Solve without using division and analyze your solution’s time and space complexities.

Examples:

input:  arr = [8, 10, 2]
output: [20, 16, 80] # by calculating: [10*2, 8*2, 8*10]

input:  arr = [2, 7, 3, 4]
output: [84, 24, 56, 42] # by calculating: [7*3*4, 2*3*4, 2*7*4, 2*7*3]
Constraints:

[time limit] 5000ms

[input] array.integer arr

0 ≤ arr.length ≤ 20
[output] array.integer


 * @author NanoUser
 *
 */
public class ArrayOfArrayProducts
{

	public static void main(String[] args)
	{
		
	}
	//better than first one - as its just requires one additional array
	//instead of 2 arrays
	static int[] arrayOfArrayProducts1(int[] arr) {
	    // your code goes here
	    if(arr.length==0)
	        return arr;
	    
	    if(arr.length==1)
	      return new int[]{};
	    
	    int l = arr.length;
	    int[] result = new int[l];
	    int product=1;
	    int i;
	    for(i=0;i<l;i++)
	    {
	       result[i]=product;
	       product *= arr[i];      
	    }
	    
	    product=1;
	    for(i=l-1;i>=0;i--)
	    {
	      result[i]=result[i]*product;
	      product *= arr[i];
	    }
	    return result;
	  }
	
	static int[] arrayOfArrayProducts2(int[] arr) {
		// your code goes here
		if(arr.length==0)
			return arr;

		if(arr.length==1)
			return new int[]{};

		int l = arr.length;
		int[] result = new int[l];
		int productLeft=1;
		int productRight=1;
		int[] leftArr = new int[l];
		int[] rightArr = new int[l];
		int i;
		for(i=0;i<l;i++)
		{
			leftArr[i]=productLeft;
			productLeft *= arr[i];

			rightArr[l-i-1]=productRight;
			productRight *= arr[l-i-1];      
		}

		//leftArr[l-1] = productLeft;
		//rightArr[l-1]=productRight;

		for(i=0;i<l;i++)
		{
			result[i]=leftArr[i]*rightArr[i];
		}

		return result;
	}
}

/**
Test Case #1
Input:
 
[]
Expected:
 
[]
Actual:
 
[]
Test Case #2
Input: [1],Expected: [],Actual: []
Test Case #3
Input: [2,2],Expected: [2,2],Actual: [2, 2]
Test Case #4
Input: [2,7,3,4],Expected: [84,24,56,42],Actual: [84, 24, 56, 42]
Test Case #5
Input: [2,3,0,982,10],Expected: [0,0,58920,0,0],Actual: [0, 0, 58920, 0, 0]
Test Case #6
Input: [-3,17,430,-6,5,-12,-11,5],Expected: [-144738000,25542000,1009800,-72369000,86842800,-36184500,-39474000,86842
*/