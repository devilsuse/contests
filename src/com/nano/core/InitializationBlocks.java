package com.nano.core;

public class InitializationBlocks
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	// InitializationBlocks a = new InitializationBlocks();

	// Test aa = new Test();

	Child child = new Child();

	System.out.println("\n ***************** End of Child *********\n");

	SubChild subChild = new SubChild();
    }

    {
	System.out
		.println("Instance Intialization Block of MAIN method Class.....");
    }

    InitializationBlocks()
    {
	this("Constructor Call");
	System.out.println("Constructor One of MAIN method Class........");
    }

    InitializationBlocks(String str)
    {
	System.out.println("Constructor Two of MAIN method Class...........");
    }

    static
    {
	System.out
		.println("Static Intialization Block of MAIN method Class.....");
    }

    {
	System.out
		.println("Instance Intialization Block of MAIN method Class.....");
    }
}

class Test
{
    static
    {
	System.out.println("TEST ----Static Intialization Block.....");
    }

    {
	System.out.println("TEST ----Instance Intialization Block.....");
    }

    Test()
    {
	this("Super Constructor Call");
	System.out.println("TEST ----Constructor One........");
    }

    Test(String str)
    {
	System.out.println("TEST ----Constructor Two..........." + str);
    }
}

class Child extends Test
{
    static
    {
	System.out.println("CHILD static initializer..........");
    }

    {
	System.out.println("CHILD Instance Initializer");
    }

    public Child()
    {
	super("CHILD constructor call..........");
	System.out.println("CHILD Constructor .............");
    }
}

class SubChild extends Child
{
    static
    {
	System.out.println("SUBCHILD static initializer..........");
    }

    {
	System.out.println("SUBCHILD Instance Initializer");
    }

    public SubChild()
    {
	System.out.println("SUBCHILD Constructor .............");
    }
}
