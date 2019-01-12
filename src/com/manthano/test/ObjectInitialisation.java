package com.manthano.test;

import com.nano.core.InitialisationBlocksTest;

/**
 * @author LXMRX
 */
public class ObjectInitialisation
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		InitialisationBlocksTest classWithDiffInitialisationBlocks = new InitialisationBlocksTest();
		System.out.printf(
				"MAIN METHOD in Different Class......... START........ i_static = %d and i_instance = %d%n%n",
				InitialisationBlocksTest.getI_static(), classWithDiffInitialisationBlocks.getI_instance());
	}

}
