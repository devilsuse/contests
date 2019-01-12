package com.manthano.test;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveListOfBoolean
{
	public static void main(String[] a)
	{
		List<Boolean> booleanList = new ArrayList<Boolean>();
		booleanList.add(null);
		booleanList.add(null);
		booleanList.add(false);

		while (booleanList.remove(""))
			;
		System.out.println(booleanList);
	}
}
