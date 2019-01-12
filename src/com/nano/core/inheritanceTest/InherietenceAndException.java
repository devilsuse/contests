package com.nano.core.inheritanceTest;

public class InherietenceAndException extends A
{
    public void f()
    {

    }

    public void fun() // Compiletime error: throws Exception
    {

    }

    public void funny() throws RuntimeException
    {

    }

    public void someMorefunny() // Compiletime error: throws Exception
    {

    }

    public static void main(String[] args)
    {

    }

}

class A
{
    public void f() throws Exception
    {

    }

    public void fun()
    {

    }

    public void funny() throws Exception
    {

    }

    public void someMorefunny() throws RuntimeException
    {

    }
}