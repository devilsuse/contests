package com.nano.inter;

import java.io.Serializable;

public class TestTemplate
{

	/*
	 * static String m(int i)
	 * {
	 * return "int";
	 * }
	 * static String m(float f)
	 * {
	 * return "float";
	 * }
	 * public static void main(String[] args)
	 * {
	 * long l = 1;
	 * double d = 1;
	 * System.out.print(m(l) + ","); // Error + m(d)
	 * }
	 */

	/*
	 * public static void main(String[] args)
	 * {
	 * Integer integer = new Integer(10);
	 * Vector vector = new Vector();
	 * java.util.LinkedList list = new java.util.LinkedList();
	 * vector.add(integer);
	 * list.add(integer);
	 * if (vector.equals(list))
	 * System.out.println("equal");
	 * else
	 * System.out.println("not equal");
	 * }
	 */

	/*
	 * public static void main(String[] args)
	 * {
	 * byte x = 10;
	 * switch (x)
	 * {
	 * case 10:
	 * System.out.print("10");
	 * case 100:
	 * System.out.print("100");
	 * break;
	 * case 1000:
	 * System.out.print("1000");
	 * }
	 * }
	 */

	/*
	 * public static void main(String[] args)
	 * {
	 * TreeSet aSet = new TreeSet();
	 * JustAClass a = new JustAClass("a");
	 * JustAClass b = new JustAClass("b");
	 * aSet.add(b);
	 * aSet.add(a);
	 * for (Object aObj : aSet)
	 * System.err.println(((JustAClass) aObj).getStr());
	 * }
	 */
	/*
	 * public static void main(String[] args)
	 * {
	 * int i = -3;
	 * System.out.println("i%2 == 1 -> " + (i % 2 == 1));
	 * System.out.println("isOdd -> " + isOdd(i));
	 * }
	 * public static boolean isOdd(int i)
	 * {
	 * return i % 2 == 1;
	 * }
	 */

	public static void main(String[] args)
	{

		double result = 10.0 / 0.0;
		System.out.println(result);

		Serializable s = new int[10];
		Cloneable c = new int[12];
		Object o = new int[11];

		// HashMap<K, V>
		int arr[] = { 1, 2, 3, 4, };

	}
}

class JustAClass
{
	String	str;

	public JustAClass(String str)
	{
		this.str = str;
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

}
