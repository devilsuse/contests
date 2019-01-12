package com.nano.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;

import com.nano.annotation.ClassPreamble;

@ClassPreamble(author = "Amit", createdDate = "22-July-2014", reviewers = {
	"A", "B" })
public class HashMapKeyHashCodeModification
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	Thread aThead = new Thread();

	LinkedList<String> linkedList = new LinkedList<String>();
	Stack<String> stack = new Stack<String>();

	ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
	Object obj = new Object();
	Map syncMap = Collections.synchronizedMap(concurrentMap);
	Hashtable<String, String> hashtable = new Hashtable<String, String>();
	Vector<String> vector = new Vector<String>();

	CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
	CopyOnWriteArraySet<String> cpoyOnWriteArraySet = new CopyOnWriteArraySet<String>();

	BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(9);
	LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>();

	// Following are additions to Concurrent API in JDK 1.6
	ConcurrentSkipListMap<String, String> concurrentSkipListMap = new ConcurrentSkipListMap<String, String>();
	ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<String>();

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

	k1.setStr("Z");
	System.out.println("After Change, HashCode of K1 = " + k1.hashCode());

	System.out.println(map.containsKey(k1));
	System.out.println("Value of NULL-mapped key : " + map.get(null));
	System.out.println("Value of Z-mapped key : " + map.get(k1));
	/*
	 * KeyClass kA = new KeyClass("A");
	 * System.out.println("kA.equals(k1) =  " + kA.equals(k1));
	 * System.out.println(map.containsKey(kA));
	 */
    }
}

class KeyClass
{
    private String str = null;

    public KeyClass(String str)
    {
	this.str = str;
    }

    @Override
    public int hashCode()
    {
	int hashCode = 31;
	hashCode = hashCode + 17 * str.hashCode();
	return hashCode;
    }

    @Override
    public boolean equals(Object obj)
    {
	if (!(obj instanceof KeyClass))
	    return false;

	KeyClass keyClass = (KeyClass) obj;

	return this.str.equals(keyClass.str);
    }

    /**
     * @return the str
     */
    public String getStr()
    {
	return str;
    }

    /**
     * @param str
     *            the str to set
     */
    public void setStr(String str)
    {
	this.str = str;
    }

    @Override
    public String toString()
    {
	return str;
    }
}
