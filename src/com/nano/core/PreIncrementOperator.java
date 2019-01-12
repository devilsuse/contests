package com.nano.core;

public class PreIncrementOperator
{

    /**
     * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html. The
     * increment/decrement operators can be applied before (prefix) or after
     * (postfix) the operand. The code result++; and ++result; will both end in
     * result being incremented by one. The only difference is that the prefix
     * version (++result) evaluates to the incremented value, whereas the
     * postfix version (result++) evaluates to the original value. If you are
     * just performing a simple increment/decrement, it doesn't really matter
     * which version you choose. But if you use this operator in part of a
     * larger expression, the one that you choose may make a significant
     * difference.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
	int i = 0;

	if (++i == 1)
	    System.out
		    .println("PreIncrement Operator first increments the value and then is applied.....");

	System.out.println(i);

	i = 0;
	if (i++ == 1)
	    System.out
		    .println("No OUTPUT ----- Post Operator is applied later .....");

	System.out.println(i);

	int a = 5;
	i = 0;

	i = ++a + ++a + a++;
	System.out.println("i = ++a + ++a + a++ -- > " + i);
	i = a++ + ++a + ++a;
	a = ++a + ++a + a++;

	System.out.println(a);
	System.out.println(i);
    }
}
