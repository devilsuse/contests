import java.io.*;
import java.util.*;

public class MoveZerosToEnd {

	static int[] moveZerosToEnd(int[] arr) {
		// your code goes here
    int l = arr.length;
    if(l<2){
      return arr;
    }
    
    int count=0;
    
    for(int i=0;i<l;i++){
      if(arr[i]==0)
        count++;
      else if(count!=0){
        arr[i-count]=arr[i];
      }
      
    }
    
    for(int i=0;i<count;i++){
      arr[l-count+i]=0;
    }
    
    return arr;
	}

	public static void main(String[] args) {
	  int[] a = new int[]{1, 10, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0};
     System.out.println(Arrays.toString(moveZerosToEnd(a)));
     
	}
}
