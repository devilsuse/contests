package com.nano.core.inheritanceTest;

public class StaticAndInstanceMethod_SameSing_NotAllowed
{
    public static void fun()
    {
	System.out.println("Static fun");
    }

    /*
     * This is not allowed............... .....
     * 
     * public void fun() { System.out.println(""); }
     */

    /**
     * Instance Method can Overload static method
     * 
     * @param a
     */
    public void fun(int a)
    {
	Integer i = new Integer(1);
	String s = "aa";
	System.out.println(a);
    }
}
