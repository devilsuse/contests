package com.manthano.test;

public class GenericRestictionTEst
{
	// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createStatic
	public static void main(String[] args)
	{
		Object[] a = new String[2];
		a[0] = "11ss";
		a[1]=1;
		for(Object o : a) {
			System.out.println(o);
		}
		
		ArrayStoreException ase;
	}

}
