package com.nano.inter.pramati;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoiTest
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int discNum = scanner.nextInt();
	scanner.close();
	TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
	towerOfHanoi.setDiscNum(discNum);
	towerOfHanoi.fillSource(towerOfHanoi.getSourceStack(), discNum);

	// Check initial state of towers
	System.out.println("********* Inital State of Towers *************");
	printStack("Source stack : ", towerOfHanoi.getSourceStack());
	printStack("Aux    stack : ", towerOfHanoi.getAuxStack());
	printStack("Dest   stack : ", towerOfHanoi.getDestinationStack());

	towerOfHanoi.solve(discNum, towerOfHanoi.getSourceStack(),
		towerOfHanoi.getAuxStack(), towerOfHanoi.getDestinationStack());

	// verify stacks after solving
	System.out
		.println("******* Final State of Towers after running algo *********");
	printStack("Source stack : ", towerOfHanoi.getSourceStack());
	printStack("Aux    stack : ", towerOfHanoi.getAuxStack());
	printStack("Dest   stack : ", towerOfHanoi.getDestinationStack());

    }

    private static void printStack(String stackName, Stack<Integer> stack)
    {
	System.out.print(stackName);
	int size = stack.size();
	for (int i = 0; i < size; i++)
	    System.out.print(stack.get(size - i - 1) + " ");
	System.out.println();
    }

}
