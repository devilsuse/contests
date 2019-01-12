package com.nano.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_With_Mutable_Key
{

    /**
     * This example show that if the key is changed then HashMap shows wrong
     * results. Already existing keys may not be found(like k1) or show other
     * wrong value(like kZ).
     * 
     * @param args
     */
    public static void main(String[] args)
    {
	HashMap<KeyClass, String> map = new HashMap<KeyClass, String>();
	KeyClass k1 = new KeyClass("A");
	KeyClass k2 = new KeyClass("B");
	KeyClass k3 = new KeyClass("C");
	KeyClass kZ = new KeyClass("Z");

	System.out.println("Before Change, HashCode of K1 = " + k1.hashCode());
	map.put(k1, "A-Value");
	map.put(k2, "B-Value");
	map.put(k3, "C-Value");
	map.put(null, "null-Value-1");
	map.put(null, "null-Value-2");
	map.put(kZ, "Z-Value...");

	k1.setStr("D");
	System.out.println("After Change, HashCode of K1 = " + k1.hashCode());

	System.out.println(map.containsKey(k1));
	System.out.println("Value of NULL-mapped key : " + map.get(null));
	kZ.setStr("C"); // doing this makes to key with C value to be the key.
			// i.e duplicate key..
	// which can be verified by interating over the map
	System.out.println("Value of Z-mapped key : " + map.get(kZ));

	System.out.println("Size of Map - " + map.size());

	for (Map.Entry<KeyClass, String> entry : map.entrySet())
	{
	    System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
    }

}
