package com.nano.core;

public class FieldAccessByObjDirectly
{
	private int	x;
	private int	y;

	public FieldAccessByObjDirectly(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof FieldAccessByObjDirectly))
			return false;

		FieldAccessByObjDirectly obj = (FieldAccessByObjDirectly) o;
		return obj.x == x && obj.y == y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		FieldAccessByObjDirectly obj = new FieldAccessByObjDirectly(1, 2);
		obj.y = 8;
		FieldAccessByObjDirectly obj2 = new FieldAccessByObjDirectly(1, 2);
		obj.aMethod(obj2);

	}

	public void aMethod(FieldAccessByObjDirectly a)
	{
		System.out.println(a.y);
	}
}
