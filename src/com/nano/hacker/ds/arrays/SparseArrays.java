package com.nano.hacker.ds.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int totalStringCount = Integer.parseInt(scanner.nextLine());
	Map<String, Integer> stringToCountMap = new HashMap<String, Integer>();
	StringBuilder strBuilder = new StringBuilder();

	String str = null;
	Integer count = null;
	for (int i = 0; i < totalStringCount; i++)
	{
	    str = scanner.nextLine();
	    count = stringToCountMap.get(str);
	    if (count != null)
		stringToCountMap.put(str, new Integer(count.intValue() + 1));
	    else
		stringToCountMap.put(str, new Integer(1));
	}

	int queriesCount = Integer.parseInt(scanner.nextLine());
	Integer occurenceCount = null;
	for (int i = 0; i < queriesCount; i++)
	{
	    occurenceCount = stringToCountMap.get(scanner.nextLine());

	    if (occurenceCount == null)
		strBuilder.append(0 + "\n");
	    else
		strBuilder.append(occurenceCount + "\n");
	}
	scanner.close();

	System.out.println(strBuilder);
    }
}
