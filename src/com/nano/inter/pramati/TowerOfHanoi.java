package com.nano.inter.pramati;

import java.util.Stack;

/**
 * NanoUser http://www.sanfoundry.com/java-program-implement-solve-tower-
 * of-hanoi-using-stacks/
 * 
 * @author
 */
public class TowerOfHanoi
{
    private Stack<Integer> sourceStack      = new Stack<Integer>();
    private Stack<Integer> auxStack	 = new Stack<Integer>();
    private Stack<Integer> destinationStack = new Stack<Integer>();
    private int	    discNum	  = 0;

    /**
     * @param discNum
     * @param stackA
     * @param stackB
     * @param stackC
     */
    public void solve(int discNum, Stack<Integer> stackA,
	    Stack<Integer> stackB, Stack<Integer> stackC)
    {
	move(discNum, stackA, stackB, stackC);
    }

    /**
     * @param discNum
     * @param stackA
     * @param stackB
     * @param stackC
     */
    private static void move(int discNum, Stack<Integer> stackA,
	    Stack<Integer> stackB, Stack<Integer> stackC)
    {
	if (discNum > 0)
	{
	    move(discNum - 1, stackA, stackC, stackB);
	    int d = stackA.pop();
	    stackC.push(d);
	    move(discNum - 1, stackB, stackA, stackC);
	}
    }

    /**
     * call this method to bring towers to initial state by filling source stack
     * 
     * @param stackA
     * @param discNum
     */
    public void fillSource(Stack<Integer> stackA, int discNum)
    {
	for (int i = discNum; i > 0; i--)
	{
	    stackA.push(i);
	}
    }

    public Stack<Integer> getSourceStack()
    {
	return sourceStack;
    }

    public void setSourceStack(Stack<Integer> sourceStack)
    {
	this.sourceStack = sourceStack;
    }

    public Stack<Integer> getAuxStack()
    {
	return auxStack;
    }

    public void setAuxStack(Stack<Integer> auxStack)
    {
	this.auxStack = auxStack;
    }

    public Stack<Integer> getDestinationStack()
    {
	return destinationStack;
    }

    public void setDestinationStack(Stack<Integer> destinationStack)
    {
	this.destinationStack = destinationStack;
    }

    public int getDiscNum()
    {
	return discNum;
    }

    public void setDiscNum(int discNum)
    {
	this.discNum = discNum;
    }
}
