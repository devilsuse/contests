package com.nano.collection.list;

/**
 * @author LXMRX
 */
public class ValueClass
{
	private String	str	= null;

	/**
	 * @param str
	 */
	public ValueClass(String str)
	{
		this.str = str;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof ValueClass))
			return false;

		ValueClass valueClass = (ValueClass) obj;
		return this.str.equals(valueClass.str);
	}

	/**
	 * @return the str
	 */
	public String getStr()
	{
		return str;
	}

	/**
	 * @param str
	 *            the str to set
	 */
	public void setStr(String str)
	{
		this.str = str;
	}

}