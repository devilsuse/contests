package com.nano.core.inheritanceTest;

/**
 * The following variation uses the field access expression super.v to refer to
 * the field named v declared in class SuperTest and uses the qualified name
 * Frob.v to refer to the field named v declared in interface Frob
 * 
 * @author LXMRX
 *
 */
public class InheritSameNameVarButDiffType extends SuperTest implements Frob
{
    public static void main(String[] args)
    {
	new InheritSameNameVarButDiffType().printV();
    }

    void printV()
    {
	System.out.println((super.v + Frob.v) / 2);
    }
}

interface Frob
{
    float v = 2.0f;
}

class SuperTest
{
    int v = 3;
}
