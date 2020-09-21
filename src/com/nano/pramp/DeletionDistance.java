package com.nano.pramp;

/**
 * 
 * Deletion Distance
The deletion distance of two strings is the minimum number of characters you need to delete in the two strings in order to get the same string. For instance, the deletion distance between "heat" and "hit" is 3:

By deleting 'e' and 'a' in "heat", and 'i' in "hit", we get the string "ht" in both cases.
We cannot get the same string from both strings by deleting 2 letters or fewer.
Given the strings str1 and str2, write an efficient function deletionDistance that returns the deletion distance between them. Explain how your function works, and analyze its time and space complexities.

Examples:

input:  str1 = "dog", str2 = "frog"
output: 3

input:  str1 = "some", str2 = "some"
output: 0

input:  str1 = "some", str2 = "thing"
output: 9

input:  str1 = "", str2 = ""
output: 0
Constraints:

[input] string str1
[input] string str2
[output] integer


 * @author NanoUser
 *
 */
public class DeletionDistance
{
	  public static void main(String[] args) {
	  String str1 = "dog", str2 = "frog";
	    System.out.println(deletionDistance(str1,str2));
	  }
	  
	 static int deletionDistance(String str1, String str2) {
		    // your code goes here
		    if(str1==null || str2==null)
		      return 0;
		    
		   
		    if(str1.isEmpty()){
		      return str2.length();
		    }
		    
		    if(str2.isEmpty()){
		      return str1.length();
		    }
		    
		    return helper(str1,str2);
		    
		  }

		  private static int helper(String str1, String str2){
		    if(str1.isEmpty())
		       return str2.length();
		      
		    if(str2.isEmpty()){
		      return str1.length();
		    }
		    
		    if(str1.equals(str2))
		      return 0;
		    
		  /*  if(s1>str1.length()-1)
		      return str2.length();
		    
		    if(s2>str2.length()-1)
		      return str1.length(); */
		   //if(str1.length()==1){
		     
		  // }
		    
		    if(str1.charAt(0)==str2.charAt(0)){
		      if(str1.length()>1 && str2.length()>1)
		        return helper(str1.substring(1),str2.substring(1));
		      else{
		        if(str1.length()==1)
		          return str2.length()-1;
		        else if (str2.length()==1)
		          return str1.length()-1;
		      }
		    }
		    else{
		       if(str1.length()>1 && str2.length()>1)
		        return 1 + Math.min(helper(str1.substring(1),str2),helper(str1,str2.substring(1)));
		      else{
		        if(str1.length()==1)
		          //return str2.length();
		          return 1 + Math.min(helper("",str2),helper(str1,str2.substring(1)));
		        else if (str2.length()==1)
		          //return str1.length();
		          return 1 + Math.min(helper(str1,""),helper(str1.substring(1),str2));
		      }
		    }
		    
		    return 0;
		  }
}
