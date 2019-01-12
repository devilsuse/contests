package com.nano.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Override_GenericsMethod_Typed_RAW
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/**
		 * Below example -- Parent is Typed and Child is RAW
		 */
		Overrider overrider = new Overrider();
		overrider.toList(new ArrayList());

		/**
		 * Below example -- Parent is RAW and Child is Typed
		 */
		ChildClassTyped childClassTyped = new ChildClassTyped();
		childClassTyped.toList(new ArrayList());

		/**
		 * Both Workds
		 */
	}

}

class CollectionConverter<T>
{
	List<T> toList(Collection c)
	{
		System.out.println("Base Class..........");
		return new ArrayList<T>();
	}

}

class Overrider extends CollectionConverter
{
	List toList(Collection c)
	{
		System.out.println("Child Class..........");
		return new ArrayList();
	}
}

class SuperClassRAW
{

	List toList(Collection c)
	{
		System.out.println("SuperRAW Class..........");
		return new ArrayList();
	}
}

class ChildClassTyped<T> extends SuperClassRAW
{
	List<T> toList(Collection c)
	{
		System.out.println("CHILD SAYS---------SuperRAW Class..And Child Class TYPEd Works ........");
		return new ArrayList<T>();
	}
}