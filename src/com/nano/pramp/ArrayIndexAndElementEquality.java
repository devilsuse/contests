package com.nano.pramp;

/**
 * Array Index & Element Equality
Given a sorted array arr of distinct integers, write a function indexEqualsValueSearch that returns the lowest index i for which arr[i] == i. Return -1 if there is no such index. Analyze the time and space complexities of your solution and explain its correctness.

Examples:

input: arr = [-8,0,2,5]
output: 2 # since arr[2] == 2

input: arr = [-1,0,3,6]
output: -1 # since no index in arr satisfies arr[i] == i.
Constraints:

[time limit] 5000ms

[input] array.integer arr

1 ≤ arr.length ≤ 100
[output] integer

 * @author NanoUser
 *
 */
public class ArrayIndexAndElementEquality
{
	  public static void main(String[] args) {

	  }
	static int indexEqualsValueSearch(int[] arr) {
	    // your code goes here
	    int l=0, r = arr.length-1;
	    int result = -1;
	    while(l<=r){
	      int mid = (l+r)/2;
	      if(mid==arr[mid]){
	        result=mid;
	        r=mid-1;
	        
	       /**
	        linearly going back
	        int i=mid-1;
	        while(i>-1 && i==arr[i]){
	          i--;
	        }
	        return arr[i+1];
	        */
	      }
	      else if(arr[mid]>mid){
	        r=mid-1;
	      }
	      else{
	        l=mid+1;
	      }
	    }
	    return result;
	  }
}
