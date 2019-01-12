package com.nano.inter.bankofAmerica;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RunMethodAtMostForGivenTime
{
    public static void main(String[] args)
    {
	RunMethodAtMostForGivenTime obj = new RunMethodAtMostForGivenTime();
	System.out.println(obj.sum());
    }

    private int sum()
    {
	int sum = 1;
	ExecutorService service = Executors.newFixedThreadPool(1);
	int returnedInt = 0;
	Future<Integer> calculatedIntFuture = service
		.submit(new Callable<Integer>() {
		    @Override
		    public Integer call() throws Exception
		    {
			Thread.currentThread().sleep(110);
			return new Integer(1);
		    }
		});
	try
	{
	    returnedInt = calculatedIntFuture.get(10, TimeUnit.MILLISECONDS);
	    sum += returnedInt;
	}
	catch (InterruptedException e)
	{
	    e.printStackTrace();
	}
	catch (ExecutionException e)
	{
	    e.printStackTrace();
	}
	catch (TimeoutException e)
	{
	    e.printStackTrace();
	}
	return sum;
    }
}
