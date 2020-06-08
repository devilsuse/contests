package com.nano.pramp;

public class BusiestTimeInTheMall
{
	public static void main(String[] args) {
	    int[][] data = new int[9][3];  
	    int[] t1 = new int[]{1487799425, 14, 1};
	    int[] t2 = new int[]{1487799425, 4,  0};
	    int[] t3 = new int[]{1487799425, 2,  0};
	    int[] t4 = new int[]{1487800378, 10, 1};
	    int[] t5 = new int[]{1487801478, 18, 0};
	    int[] t6 = new int[]{1487801478, 18, 1};
	    int[] t7 = new int[]{1487901013, 1,  0};
	    int[] t8 = new int[]{1487901211, 7,  1};
	    int[] t9 = new int[]{1487901211, 7,  0};
	    data[0]=t1;
	    data[1]=t2;
	    data[2]=t3;
	    data[3]=t4;
	    data[4]=t5;
	    data[5]=t6;
	    data[6]=t7;
	    data[7]=t8;
	    data[8]=t9;

	    System.out.println(findBusiestPeriod2(data));
	  }
	
	//will 
	static int findBusiestPeriod(int[][] data) {
	    // your code goes here
	    int maxTimestamp = data[0][0];//time where count is max
	    int maxCount = 0;
	    int count=0;
	    int l = data.length;
	    
	    int[] t;
	    int prevTime = 0;
	    for(int i=0;i<l;)
	    {
	      t=data[i];
	      prevTime = t[0];
	      int c = t[2]==0? -t[1] : t[1];
	      //int j=i+1;
	      while(++i<l)
	      {
	        int[] t2 = data[i];
	        if(t2[0]==prevTime)
	        {
	          if(t2[2]==0)
	          {
	            c -=t2[1];//18
	          }
	          else
	          {
	            c += t2[1];
	          }
	        } 
	        else
	          break;
	      }
	      count +=c;
	      System.out.println(c + " : " + maxCount + " : " + t[0] );
	      
	      if(count>maxCount)
	      {
	        maxCount=count;//18
	        maxTimestamp=prevTime; //t[0];
	      }
	    }
	     
	    return maxTimestamp;
	    }
	
	//Below is wrong as PER the question because it returns timestamp at which number of people is max 
	// but ques is to find time at which MAX people ENTER Not total count but diff
	static int findBusiestPeriod2(int[][] data) {
	    // your code goes here
	    int maxTimestamp = data[0][0];//time where count is max
	    int maxCount = 0;
	    int count=0;
	    int l = data.length;
	    
	    int[] t;
	    int prevTime = 0;
	    for(int i=0;i<l;i++)
	    {
	      t=data[i];
	      if(t[2]==0)
	      {
	        count -=t[1];//18
	      }
	      else
	      {
	        count += t[1];
	      }
	      System.out.println(count + " : " + maxCount + " : " + t[0] );
	      
	      if(count>maxCount)
	      {
	        maxCount=count;//18
	        maxTimestamp=t[0];
	        System.out.println("Max updated : " + maxCount + " : " + t[0] );
	      }
	    }
	     
	    return maxTimestamp;
	    }
}
