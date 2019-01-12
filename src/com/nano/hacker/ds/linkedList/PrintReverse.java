package com.nano.hacker.ds.linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement
 * 
 * This challenge is part of a tutorial track by MyCodeSchool and is accompanied
 * by a video lesson.
 * 
 * You are given the pointer to the head node of a linked list and you need to
 * print all its elements in reverse order from tail to head, one element per
 * line. The head pointer may be null meaning that the list is empty - in that
 * case, do not print anything!
 * 
 * Input Format You have to complete the void ReversePrint(Node* head) method
 * which takes one argument - the head of the linked list. You should NOT read
 * any input from stdin/console.
 * 
 * Output Format Print the elements of the linked list in reverse order to
 * stdout/console (using printf or cout) , one per line.
 * 
 * Sample Input
 * 
 * 1 --> 2 --> NULL 2 --> 1 --> 4 --> 5 --> NULL
 * 
 * Sample Output
 * 
 * 2 1 5 4 1 2
 * 
 * Explanation 1. First list is printed from tail to head hence 2,1 2. Similarly
 * second list is also printed from tail to head.
 * 
 * @author LXMRX
 *
 */
public class PrintReverse
{
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub

    }

    static class Node
    {
	int  data;
	Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.
    void ReversePrint(Node head)
    {
	List<Integer> list = new ArrayList<Integer>();

	while (head != null)
	{
	    list.add(new Integer(head.data));
	    head = head.next;
	}

	for (int i = (list.size() - 1); i >= 0; i--)
	{
	    System.out.println(list.get(i));
	}
    }
}