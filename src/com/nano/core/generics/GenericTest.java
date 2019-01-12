package com.nano.core.generics;

import java.util.List;

public class GenericTest
{

}

class Generic<K extends Comparable<K>> implements Comparable<Generic<K>>
{
    // code

    public static List<Generic<String>> factory1()
    {
	System.out.println("c");
	return null;
    }

    public static List<Generic<Integer>> factory2()
    {
	System.out.println("d");
	return null;
    }

    private K mKey;

    @Override
    public int compareTo(Generic<K> another)
    {
	return mKey.compareTo(another.mKey);
    }
}

class Anothter
{
    private List<? extends Generic<? extends Comparable>> mList;

    private void method1()
    {
	// Type mismatch: cannot convert from List<Generic<String>> to
	// List<Generic<? extends Comparable>>
	mList = Generic.factory1();
    }

    private void method2()
    {
	// Type mismatch: cannot convert from List<Generic<Integer>> to
	// List<Generic<? extends Comparable>>
	// mList = Generic.factory2();
    }
}