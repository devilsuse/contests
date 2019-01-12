package com.nano.core.reflection;

import java.lang.reflect.Field;

public class MutableStrings
{
    static void mutate(String s) throws Exception
    {
	Field value = String.class.getDeclaredField("value");
	value.setAccessible(true);
	value.set(s, s.toUpperCase().toCharArray());
    }

    public static void main(String args[]) throws Exception
    {
	final String s = "Hello world!";
	System.out.println(s); // "Hello world!"
	mutate(s);
	System.out.println(s); // "HELLO WORLD!"
    }
}
