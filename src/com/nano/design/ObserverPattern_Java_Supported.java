package com.nano.design;

import java.util.Observable;
import java.util.Observer;

/**
 * @author LXMRX
 */
public class ObserverPattern_Java_Supported
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Declare Subjects
		Subject subject = new Subject();

		// Declare Observers
		A_Observer aObserver = new A_Observer();
		B_Observer bObserver = new B_Observer();
		C_Observer cObserver = new C_Observer();

		// register observers
		subject.addObserver(aObserver);
		subject.addObserver(bObserver);
		subject.addObserver(cObserver);

		subject.notify_The_Observers();
		subject.notify_The_Observers();

	}
}

class Subject extends Observable
{
	public void notify_The_Observers()
	{
		setChanged();
		notifyObservers();
	}
}

class A_Observer implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("A --- got the notification..........");

	}

}

class B_Observer implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("B --- got the notification..........");

	}

}

class C_Observer implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("C --- got the notification..........");

	}

}
