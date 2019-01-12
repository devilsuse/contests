package com.nano.core.inheritanceTest;

/**
 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.3
 * 
 * @author LXMRX Even if two distinct inherited fields have the same type, the
 *         same value, and are both final, any reference to either field by
 *         simple name is considered ambiguous and results in a compile-time
 *         error. In the program: it is not astonishing that the reference to
 *         GREEN should be considered ambiguous, because class Test inherits two
 *         different declarations for GREEN with different values. The point of
 *         this example is that the reference to RED is also considered
 *         ambiguous, because two distinct declarations are inherited. The fact
 *         that the two fields named RED happen to have the same type and the
 *         same unchanging value does not affect this judgment.
 * 
 * 
 *         It is possible for a class to inherit more than one field with the
 *         same name. Such a situation does not in itself cause a compile-time
 *         error. However, any attempt within the body of the class to refer to
 *         any such field by its simple name will result in a compile-time
 *         error, because such a reference is ambiguous.
 */
public class InheritSameNameVarAndSameType implements Color, TrafficLight
{
    public static void main(String[] args)
    {
	// System.out.println(GREEN); // compile-time error
	// System.out.println(RED); // compile-time error

	System.out.println(Color.GREEN);
	System.out.println(Color.RED);

	System.out.println(TrafficLight.GREEN);
	System.out.println(TrafficLight.RED);
    }
}

interface Color
{
    int RED = 0, GREEN = 1, BLUE = 2;
}

interface TrafficLight
{
    int RED = 0, YELLOW = 1, GREEN = 2;
}
