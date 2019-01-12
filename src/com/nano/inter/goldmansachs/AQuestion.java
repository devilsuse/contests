package com.nano.inter.goldmansachs;

public interface AQuestion
{
    public abstract void someMethod() throws Exception;
}

class ConcreteClass implements AQuestion
{

    // The method need not throw any exception
    @Override
    public void someMethod()
    {
	// TODO Auto-generated method stub

    }

}