package com.nano.inter.goldmansachs.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.ericleschinski.com/c/java_permutations_recursion/
 * http://stackoverflow
 * .com/questions/4240080/generating-all-permutations-of-a-given-string
 * 
 * @author LXMRX
 *
 */
public class PermuteString
{
    static List<String> list = new ArrayList<String>();

    public static void main(String[] args)
    {
	permutation("", "ABCD");

	for (int i = 0; i < list.size(); i++)
	    System.out.println((i + 1) + " -> " + list.get(i));
    }

    private static void permutation(String prefix, String str)
    {
	int n = str.length();
	if (n == 0)
	    list.add(prefix);// System.out.println(prefix);
	else
	{
	    for (int i = 0; i < n; i++)
	    {
		System.out.println(i + "  **************************prefix "
			+ " -> " + prefix);
		System.out.println("prefix + str.charAt(i)" + " -> " + prefix
			+ str.charAt(i));
		System.out.println("str.substring(0, i)  -> "
			+ str.substring(0, i));
		System.out.println(" str.substring(i + 1) ->"
			+ str.substring(i + 1));
		System.out
			.println("str.substring(0, i) + str.substring(i + 1) -> "
				+ str.substring(0, i) + str.substring(i + 1));
		permutation(prefix + str.charAt(i),
			str.substring(0, i) + str.substring(i + 1));
	    }
	}
    }
}
