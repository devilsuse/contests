package com.nano.core.generics;

/**
 * @author LXMRX
 * @param <T>
 */
public class DiamondOperator<T>
{

	/**
	 * @param t
	 */
	public DiamondOperator(T t)
	{
	}

	/**
	 * @return T
	 */
	public T get()
	{
		return null;
	}

	/**
	 * @param s
	 * @return int
	 */
	public static int func(String s)
	{
		return 1;
	}

	/**
	 * @param o
	 * @return int
	 */
	public static int func(Object o)
	{
		return 2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Note- the method call func() in which object is created. I wasted
		// some time becoz I missed to see func() call.
		System.out.println(func(new DiamondOperator<>("").get()));
		System.out.println(func(new DiamondOperator("").get()));

	}

}
