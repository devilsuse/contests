package com.nano.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class InvokeRunNotStartOnThread
{
    public static void main(String[] args)
    {
	ReadWriteLock a = new ReentrantReadWriteLock();
	Task task = new Task();
	Thread t = new Thread(task);
	t.run();
	System.out.println("Running Main-------------. -> "
		+ Thread.currentThread().getName());

	System.out.println("Invoking start()........");
	t.start();
    }

}

class Task implements Runnable
{
    @Override
    public void run()
    {
	System.out.println("Running Task-------------. -> "
		+ Thread.currentThread().getName());

    }

}