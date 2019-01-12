package com.nano.core;

public class BitwiseExclusiveAndInclusiveOR
{

	// http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.22.2
	/**
	 * 15.22.2. Boolean Logical Operators &, ^, and |
	 * When both operands of a &, ^, or | operator are of type boolean or
	 * Boolean, then the type of the bitwise operator expression is boolean. In
	 * all cases, the operands are subject to unboxing conversion (§5.1.8) as
	 * necessary.
	 * For &, the result value is true if both operand values are true;
	 * otherwise, the result is false.
	 * For ^, the result value is true if the operand values are different;
	 * otherwise, the result is false.
	 * For |, the result value is false if both operand values are false;
	 * otherwise, the result is true.
	 */
	/**
	 * 15.22.1. Integer Bitwise Operators &, ^, and |
	 * When both operands of an operator &, ^, or | are of a type that is
	 * convertible (§5.1.8) to a primitive integral type, binary numeric
	 * promotion is first performed on the operands (§5.6.2).
	 * The type of the bitwise operator expression is the promoted type of the
	 * operands.
	 * For &, the result value is the bitwise AND of the operand values.
	 * For ^, the result value is the bitwise exclusive OR of the operand
	 * values.
	 * For |, the result value is the bitwise inclusive OR of the operand
	 * values.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a = 10;
		int b = 8;
		System.out.println("Bitwise Exclusive OR -> " + (a ^ b));
		System.out.println("Bitwise Inclusive OR -> " + (a | b));
	}

}
