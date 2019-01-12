package com.nano.core.nestedClass;

public class InnerClass
{

	private int	a	= 9;
	private int	b	= this.a + 1;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		InnerClass innerClass = new InnerClass();
		FirstLevelInnerClass obj = innerClass.new FirstLevelInnerClass();
		obj.printA(1);

	}

	class FirstLevelInnerClass
	{
		int	a	= 10;

		public void printA(int a)
		{
			System.out.println("a = " + a);
			System.out.println("this.a = " + this.a);
			System.out.println("InnerClass.this.a = " + InnerClass.this.a);
			System.out.println("InnerClass.this.getClass() = " + InnerClass.this.getClass());
		}

	}

}
