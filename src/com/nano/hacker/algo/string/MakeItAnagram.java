package com.nano.hacker.algo.string;

import java.util.Scanner;

/**
 * Alice recently started learning about cryptography and found that anagrams
 * are very useful. Two strings are anagrams of each other if they have same
 * character set and same length. For example strings "bacdc" and "dcbac" are
 * anagrams, while strings "bacdc" and "dcbad" are not.
 * 
 * Alice decides on an encryption scheme involving 2 large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. She need your help in finding out this
 * number.
 * 
 * Given two strings (they can be of same or different length) help her in
 * finding out the minimum number of character deletions required to make two
 * strings anagrams. Any characters can be deleted from any of the strings.
 * 
 * Input Format Two lines each containing a string.
 * 
 * Constraints 1 <= Length of A,B <= 10000 A and B will only consist of
 * lowercase latin letter.
 * 
 * Output Format A single integer which is the number of character deletions.
 * 
 * Sample Input #00: cde abc
 * 
 * Sample Output #00:
 * 
 * 4
 * 
 * Explanation #00: We need to delete 4 characters to make both strings anagram
 * i.e. 'd' and 'e' from first string and 'b' and 'a' from second string.
 * 
 * @author LXMRX
 *
 */
public class MakeItAnagram
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);

	String input1 = in.nextLine();
	String input2 = in.nextLine();
	in.close();

	int str1CharCountArray[] = new int[26];
	int str2CharCountArray[] = new int[26];

	for (int i = 0; i < input1.length(); i++)
	{
	    // minus 97 is used as ques says that all characters are in
	    // lowercase. So below stmt stores the count of that character at
	    // corresponding array position
	    // and increments each time it finds it is appearing multiple times.
	    str1CharCountArray[input1.charAt(i) - 97] += 1;
	}

	for (int i = 0; i < input2.length(); i++)
	{
	    str2CharCountArray[input2.charAt(i) - 97] += 1;
	}

	int deletionsRequired = 0;
	for (int i = 0; i < 26; i++)
	{
	    deletionsRequired += Math.abs(str1CharCountArray[i]
		    - str2CharCountArray[i]);
	}

	System.out.println(deletionsRequired);
    }
}
