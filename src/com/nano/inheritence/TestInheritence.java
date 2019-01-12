package com.nano.inheritence;

public class TestInheritence
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SubClass a = new SubClass();
		// a.di

	}
}

class SuperClass
{

	public void display(String str)
	{
		System.out.println("Super Class Display method - String : " + str);
	}

}

class SubClass
{
	private void display(String n)
	{
		System.out.println("Sub Class Display method - int : " + n);
	}

}