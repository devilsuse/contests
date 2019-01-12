package com.nano.inter.adobe;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author NanoUser You are given a function areBracketMatching which takes a
 *         string s (an arithmetic expression) as its parameter. Complete the
 *         function to check if the arithmetic expression contains matching
 *         braces, braces includes square brackets and paranthesis as well.
 *         Return 1 if it exists else 0.
 */
public class BracketMatching
{
    public static void main(String[] args)
    {
	String expr = "[(5+4)*{(5/7)-(5+(8/4))}]";
	System.out.println(areBracketsMatched(expr));
    }

    private static int areBracketsMatched(String expr)
    {
	Stack<Character> stack = new Stack<Character>();
	char c;
	for (int i = 0; i < expr.length(); i++)
	{
	    c = expr.charAt(i);
	    if (isStartingBrace(c))
		stack.push(c);
	    else if (isEndingBrace(c))
	    {
		char topChar = stack.pop();
		if (!areBracesMatching(c, topChar))
		    return 0;
	    }
	}
	return 1;
    }

    private static boolean areBracesMatching(char c, char topChar)
    {
	if ((c == ')' && topChar == '(') || (c == ']' && topChar == '[')
		|| (c == '}' && topChar == '{'))
	    return true;
	return false;

    }

    private static boolean isEndingBrace(char c)
    {
	if (c == ')' || c == ']' || c == '}')
	    return true;
	return false;
    }

    private static boolean isStartingBrace(char c)
    {
	if (c == '(' || c == '[' || c == '{')
	    return true;
	return false;
    }

    /**
     * Below impl is copied from
     * http://www.sanfoundry.com/java-program-implement
     * -check-balanced-parenthesis-using-stacks/
     */
    public static void main1(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	/* Creating Stack */
	Stack<Integer> stk = new Stack<Integer>();
	System.out.println("Parenthesis Matching Test\n");
	/* Accepting expression */
	System.out.println("Enter expression");
	String exp = scan.next();
	scan.close();
	int len = exp.length();
	System.out.println("\nMatches and Mismatches:\n");
	for (int i = 0; i < len; i++)
	{
	    char ch = exp.charAt(i);
	    if (ch == '(')
		stk.push(i);
	    else if (ch == ')')
	    {
		try
		{
		    int p = stk.pop() + 1;
		    System.out.println("')' at index " + (i + 1)
			    + " matched with ')' at index " + p);
		}
		catch (Exception e)
		{
		    System.out.println("')' at index " + (i + 1)
			    + " is unmatched");
		}
	    }
	}
	while (!stk.isEmpty())
	    System.out.println("'(' at index " + (stk.pop() + 1)
		    + " is unmatched");
    }
}
