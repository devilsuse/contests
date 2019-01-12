package com.nano.core.inheritanceTest;

public class SynchronizeInheritedMethod extends Super
{
    @Override
    public synchronized void fun()
    {
	System.out.println("This is in SUBclass");
    }

    @Override
    public void display()
    {
	System.out.println("This is in SUBclass - display UNsynchronized");
    }

    public static void main(String[] args)
    {
	Super s = new SynchronizeInheritedMethod();
	s.fun();
	s.display();
    }
}

class Super
{
    public void fun()
    {
	System.out.println("This is in SUPER -  fun");
    }

    public synchronized void display()
    {
	System.out.println("This is in SUPER - display SYNCHRONIZED");
    }
}
