package com.nano.thread;

public class PollingVariableThread
{

	static boolean	polVariable	= false;
	static int		var			= 2;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println("Start........" + System.getenv());
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				System.out.println("Inside Run......");
				while (!polVariable)
				{
					System.out.println("Polling variable is false;");
					System.out.println("Value of var = " + var);
				}

			}
		});

		t1.start();
		var = 43;
		polVariable = true;

	}

}
