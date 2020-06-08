package com.nano.core.inheritanceTest;

import java.util.List;

public class TypeErasureInSubsignature extends MySuper
{

    public static void main(String[] args)
    {

    }

    @Override
    public void fun(List listString)
    {
	System.out.println("This is in SUBclass");
    }

    @Override
    public void display(List listString)
    {
	System.out.println("This is in SUBclass - display UNsynchronized");
    }

    @Override
    public void f(List listInteger)
    {
	System.out.println("This is in SUBclass - display UNsynchronized");
    }
    
	/*
	 * @Override public void f(List<Integer> listInteger) {
	 * System.out.println("This is in SUPER - f UNsynchronized"); }
	 */
}

class MySuper
{
    public void fun(List<String> listString)
    {
	System.out.println("This is in SUPER -  fun");
    }

    public void display(List listString)
    {
	System.out.println("This is in SUPER - display SYNCHRONIZED");
    }

    public void f(List<Integer> listInteger)
    {
	System.out.println("This is in SUPER - f UNsynchronized");
    }
}