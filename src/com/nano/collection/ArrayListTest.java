package com.nano.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.nano.collection.list.ValueClass;

/**
 * @author LXMRX
 */
public class ArrayListTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ValueClass a = new ValueClass("A");
		ValueClass b = new ValueClass("B");
		ValueClass c = new ValueClass("C");
		ValueClass d = new ValueClass("D");

		ArrayList<ValueClass> list = new ArrayList<ValueClass>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);

		// Adding duplicate
		list.add(a);

		System.out.println("list Size = " + list.size());
		Iterator<ValueClass> listItr = list.iterator();

		while (listItr.hasNext())
			System.out.println(listItr.next().getStr());
	}

}
