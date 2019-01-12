package com.nano.thread;

/**
 * @author LXMRX
 */
public class ThreadJoin
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Main Thread executing....\n\n");

		Thread childThread = new Thread(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100; i++)
					System.out.println("I am child thread and guess what I am running too...");
			}
		});
		childThread.start();

		try
		{
			childThread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("\n\nAnd Parent dies.......");
	}

}
