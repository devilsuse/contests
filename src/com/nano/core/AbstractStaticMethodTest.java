package com.nano.core;

public abstract class AbstractStaticMethodTest
{
    // putting static here gives compile-time error as below:
    // The abstract method fun in type AbstractStaticMethodTest can only set a
    // visibility modifier, one of public or protected
    public abstract void fun();
}
