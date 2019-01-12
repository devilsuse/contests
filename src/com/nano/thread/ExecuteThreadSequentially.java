package com.nano.thread;

/**
 * @author LXMRX
 */
public class ExecuteThreadSequentially
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Thread one = new Thread(new SomeRunnable("one..."));
		one.start();

		try
		{
			one.join();
		}
		catch (InterruptedException e1)
		{
			e1.printStackTrace();
		}

		Thread two = new Thread(new SomeRunnable("Two......"));
		two.start();

		try
		{
			two.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		Thread three = new Thread(new SomeRunnable("Three...."));
		three.start();

		/*
		 * try
		 * {
		 * one.wait();
		 * }
		 * catch (InterruptedException e)
		 * {
		 * System.out.println("One Exceptionnnnnnnnnnnnn");
		 * e.printStackTrace();
		 * }
		 * SomeRunnable two = new SomeRunnable("Two....");
		 * new Thread(two).start();
		 * try
		 * {
		 * two.wait();
		 * }
		 * catch (InterruptedException e)
		 * {
		 * System.out.println("Two Exceptionnnnnnnnnnnnn");
		 * e.printStackTrace();
		 * }
		 * SomeRunnable three = new SomeRunnable("Three....");
		 * new Thread(three).start();
		 */

	}

}

class TheThread implements Runnable
{
	private String	str	= "default";

	public TheThread(String str)
	{
		this.str = str;
	}

	public void run()
	{
		for (int i = 0; i < 20; i++)
			System.out.println(i + "  " + str);
	}
}