package com.nano.core.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveAllOcuurenceOfElementArrayList
{

    public static void main(String[] args)
    {
	// Set<String> linkedHashSet = new LinkedHashSet<String>();

	Map<String, String> linkedHashMap = new LinkedHashMap<String, String>(
		16, 0.75f, true);

	linkedHashMap.put("a", "A");
	linkedHashMap.put("b", "B");
	linkedHashMap.put("c", "C");
	linkedHashMap.put("d", "D");
	// linkedHashMap
	printMap(linkedHashMap);
	System.out.println("**************************");
	System.out.println(linkedHashMap.get("c"));

	printMap(linkedHashMap);
	System.out.println(linkedHashMap.get("a"));
	printMap(linkedHashMap);
	System.out.println("**************************");

	List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("a");
	list.add("a");

	System.out.println(list.size());

	/*
	 * list.remove(0); printList(list);
	 * 
	 * System.out.println(list.size());
	 */

	Iterator<String> iterator = list.iterator();
	while (iterator.hasNext())
	{
	    if ("a".equals(iterator.next()))
		iterator.remove();
	}

	// After removing
	System.out.println("After removing");
	printList(list);
    }

    private static void printList(List<String> list)
    {
	for (String s : list)
	    System.out.println(s);

    }

    private static void printMap(Map<String, String> map)
    {
	for (Entry<String, String> entry : map.entrySet())
	    System.out.println("key - > " + entry.getKey() + " Value - > "
		    + entry.getValue());
    }
}
