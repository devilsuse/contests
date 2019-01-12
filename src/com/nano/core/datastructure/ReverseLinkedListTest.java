package com.nano.core.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ReverseLinkedListTest
{
    public static void main(String[] args)
    {
	List<String> list = new LinkedList<>();
	list.iterator();
	list.listIterator();
	list.listIterator(0);

	List<String> arrayList = new ArrayList<>();
	arrayList.iterator();
	arrayList.listIterator();
	arrayList.listIterator(0);

	MySinglyLinkedList<String> myLinkedList = new MySinglyLinkedList<String>();
	Iterator<String> myNodeIteratorForEmptyList = myLinkedList.iterator();

	try
	{
	    while (myNodeIteratorForEmptyList.hasNext())
		System.out.println(myNodeIteratorForEmptyList.next());
	}
	catch (NoSuchElementException e)
	{
	    e.printStackTrace();
	}

	myLinkedList.add("First");
	myLinkedList.add("Second");
	myLinkedList.add("Third");
	myLinkedList.add("Fourth");
	myLinkedList.add("Fifth");

	Iterator<String> myNodeIterator = myLinkedList.iterator();
	while (myNodeIterator.hasNext())
	    System.out.println(myNodeIterator.next());

	// reverse
	System.out.println("After calling reverse..........");
	myLinkedList.reverse();
	myNodeIterator = myLinkedList.iterator();
	while (myNodeIterator.hasNext())
	    System.out.println(myNodeIterator.next());
    }
}

class MySinglyLinkedList<E>
{
    private transient Node<E> head = null;

    // This is needed if Iterator has to be implemented as while traversing
    private transient int     size = 0;

    private static class Node<E>
    {
	E    data;
	Node next;

	Node(E data, Node next)
	{
	    this.data = data;
	    this.next = next;
	}
    }

    public boolean add(E e)
    {
	linkLast(e);
	return true;
    }

    public E getHead()
    {
	final Node<E> h = head;
	if (head == null)
	    throw new NoSuchElementException();
	return h.data;
    }

    public void reverse()
    {
	Node<E> currentNode = head;
	// For first node, previousNode will be null
	Node<E> prevNode = null;
	Node<E> nextNode = null;

	while (currentNode != null)
	{
	    nextNode = currentNode.next;
	    currentNode.next = prevNode;

	    prevNode = currentNode;
	    currentNode = nextNode;
	}

	// set head to last Element
	head = prevNode;
    }

    private void linkLast(E e)
    {
	Node<E> newNode = new Node(e, null);
	// if LinkedList is empty, So assign head to new Element and RETURN
	if (head == null)
	{
	    head = newNode;
	    return;
	}

	Node<E> tempHead = head;
	Node<E> secondLast = null;

	while (tempHead != null)
	{
	    secondLast = tempHead;
	    tempHead = tempHead.next;
	}

	secondLast.next = newNode;
    }

    public Iterator<E> iterator()
    {
	return new ItrNodeImpl<E>();
    }

    private class ItrNodeImpl<E> implements Iterator<E>
    {
	/**
	 * This Itr impl is created with 0 cursor value Index of element to be
	 * returned by subsequent call to next.
	 */
	// int cursor = 0;

	private Node<E> headRef = (Node<E>) head;

	@Override
	public boolean hasNext()
	{
	    if (headRef == null)
		return false;
	    else
		return true;

	}

	@Override
	public E next()
	{
	    if (headRef == null)
		return null;
	    else
	    {
		E data = headRef.data;
		headRef = headRef.next;
		return data;
	    }

	}

	@Override
	public void remove()
	{
	    // TODO Auto-generated method stub

	}

    }

}