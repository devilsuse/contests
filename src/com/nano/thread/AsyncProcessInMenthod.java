package com.nano.thread;

/**
 * @author LXMRX
 */
public class AsyncProcessInMenthod
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	System.out.println("Before new Thread Call");
	Thread t = new Thread(new Runnable() {

	    @Override
	    public void run()
	    {
		for (int i = 0; i <= 100; i++)
		    if (i == 99)
			System.out.println("Thread prints it.");
	    }
	});
	t.start();
	System.out.println("After new Thread Call");
    }

}
