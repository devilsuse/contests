package com.nano.hacker.ds.linkedList;

/**
 * Problem Statement
 * 
 * This challenge is part of a tutorial track by MyCodeSchool and is accompanied
 * by a video lesson.
 * 
 * You�re given the pointer to the head node of a linked list and an integer to
 * add to the list. Create a new node with the given integer, insert this node
 * at the head of the linked list and return the new head node. The head pointer
 * given may be null meaning that the initial list is empty.
 * 
 * Input Format You have to complete the Node* Insert(Node* head, int data)
 * method which takes two arguments - the head of the linked list and the
 * integer to insert. You should NOT read any input from stdin/console.
 * 
 * Output Format Insert the new node at the head and return the head of the
 * updated linked list. Do NOT print anything to stdout/console.
 * 
 * Sample Input
 * 
 * NULL , data = 1 1 --> NULL , data = 2
 * 
 * Sample Output
 * 
 * 1 --> NULL 2 --> 1 --> NULL
 * 
 * Explanation 1. We have an empty list, on inserting 1, 1 becomes new head. 2.
 * We have a list with 1 as head, on inserting 2, 2 becomes the new head.
 * 
 * @author LXMRX
 *
 */
public class InsertNodeAtHead
{
    public static void main(String[] args)
    {
	Node head = null;
	insertAtHead(head, 1);

    }

    /*
     * Insert Node at the end of a linked list head pointer input could be NULL
     * as well for empty list Node is defined as
     */
    static class Node
    {
	int  data;
	Node next;
    }

    // This is a "method-only" submission.
    // You only need to complete this method.
    static Node insertAtHead(Node head, int x)
    {
	Node node = new Node();
	node.data = x;
	node.next = head;

	head = node;
	return head;
    }
}
