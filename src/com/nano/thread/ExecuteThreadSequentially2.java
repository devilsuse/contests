package com.nano.thread;

/**
 * @author AMIT
 */
public class ExecuteThreadSequentially2
{

	public static void main(String[] args)
	{
		Thread one = new Thread(new SomeRunnable("one..."));
		one.start();

		Object lockObj = new Object();
		try
		{
			synchronized (lockObj)
			{
				one.wait();
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("One Exceptionnnnnnnnnnnnn");
			e.printStackTrace();
		}
		SomeRunnable two = new SomeRunnable("Two....");
		new Thread(two).start();
		try
		{
			synchronized (lockObj)
			{
				two.wait();
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Two Exceptionnnnnnnnnnnnn");
			e.printStackTrace();
		}
		SomeRunnable three = new SomeRunnable("Three....");
		new Thread(three).start();

	}

}

class SomeRunnable implements Runnable
{
	private String	str	= "default";

	public SomeRunnable(String str)
	{
		this.str = str;
	}

	public void run()
	{
		for (int i = 0; i < 20; i++)
			System.out.println(i + "  " + str);
	}
}