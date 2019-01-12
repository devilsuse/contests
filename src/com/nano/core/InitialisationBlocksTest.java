package com.nano.core;

/**
 * @author LXMRX
 */
public class InitialisationBlocksTest
{
	private static int	i_static	= 11;
	private int			i_instance	= 11;

	/**
	 * 
	 */
	public InitialisationBlocksTest()
	{
		System.out.println("in Constructor ---------%n");
		/*
		 * This first print statement is TO CHECK AT WHAT STAGE is Value of
		 * instance and static field equal to 11 as set during declaration OR is
		 * Default value 0.
		 */
		System.out.printf("START........ i_static = %d and i_instance = %d%n", i_static, i_instance);
		i_static = 33;
		i_instance = 33;

		System.out.printf("END........ i_static = %d and i_instance = %d%n%n", i_static, i_instance);
	}

	static
	{
		System.out.println("in Static Block---------%n");
		System.out.printf("START........ i_static = %d%n ", i_static);
		i_static = 22;
		System.out.printf("END........ i_static = %d %n%n", i_static);
	}

	{
		System.out.println("in object initializer Block--------%n");
		System.out.printf("START........ i_static = %d and i_instance = %d%n", i_static, i_instance);
		i_instance = 44;
		i_static = 44;
		System.out.printf("END........ i_static = %d and i_instance = %d%n%n", i_static, i_instance);
	}

	/**
	 * @return the i_static
	 */
	public static int getI_static()
	{
		return i_static;
	}

	/**
	 * @param i_static
	 *            the i_static to set
	 */
	public static void setI_static(int i_static)
	{
		InitialisationBlocksTest.i_static = i_static;
	}

	/**
	 * @return the i_instance
	 */
	public int getI_instance()
	{
		return i_instance;
	}

	/**
	 * @param i_instance
	 *            the i_instance to set
	 */
	public void setI_instance(int i_instance)
	{
		this.i_instance = i_instance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out
				.printf("%n%n *******Let's see if its first to get printed...Or anything CAN RUN BEFORE MAIN METHOD.....%n%n");
		InitialisationBlocksTest classWithDiffInitialisationBlocks = new InitialisationBlocksTest();
		System.out.printf("MAIN METHOD........ START........ i_static = %d and i_instance = %d%n%n", getI_static(),
				classWithDiffInitialisationBlocks.getI_instance());
	}
}
