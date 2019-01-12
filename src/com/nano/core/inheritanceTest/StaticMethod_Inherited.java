package com.nano.core.inheritanceTest;

public class StaticMethod_Inherited extends SuperClass
{
    public static void main(String[] args)
    {
	SuperClass a = new StaticMethod_Inherited();
	SuperClass superClass = new SuperClass();

	System.out.println(superClass.getJ());
	System.out.println(a.getJ());
	System.out.println(StaticMethod_Inherited.getJ());

    }

    @Override
    public int getI()
    {
	return 11;
    }

    // @Override -> here this @Override clause cannot be added and results in
    // compile-time error.
    // So actually there is NO Overriding BUT offcourse Hiding
    // But no compile-time error.
    public static int getJ()
    {
	return 22;
    }
}

class SuperClass
{
    int	i = 1;
    static int j = 2;

    public int getI()
    {
	return i;
    }

    public void setI(int i)
    {
	this.i = i;
    }

    public static int getJ()
    {
	return j;
    }

    public static void setJ(int j)
    {
	SuperClass.j = j;
    }

}