package com.nano.core.nestedClass;

/**
 * @author LXMRX
 */
public class StaticNestedClassExample
{

	static int	i	= 1;
	int			j	= 2;

	public int getJ()
	{
		return this.j;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		StaticClass a = new StaticClass();
		a.aMethod();
		StaticClass.staticMethodOfStaticClass();
	}

	static class StaticClass
	{
		/**
		 * instance variable of static class.
		 */
		int	var;

		/**
		 * Instance method of sattic class
		 */
		public void aMethod()
		{
			System.out.println("i = " + i);
		}

		/**
		 * Static method of static class
		 */
		public static void staticMethodOfStaticClass()
		{
			System.out.println("i = " + i);
		}

		/**
		 * javadoc:
		 * And like static class methods, a static nested class cannot refer
		 * directly to instance variables or methods defined in its enclosing
		 * class: it can use them only through an object reference.
		 */
		public void cannotDirectlyAccessNonStaticMemberofOuterClass()
		{
			StaticNestedClassExample outerClassInstance = new StaticNestedClassExample();
			System.out.println(outerClassInstance.getJ());
		}
	}
}
