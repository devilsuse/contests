package com.nano.algo;

public class PermutationsOfArray
{

    /**
     * http://vasanthexperiments.wordpress.com/tag/algorithm-to-find-permutation
     * -of-given-array/
     * 
     * @param args
     *            the command line arguments
     */
    void printArray(int[] a)
    {
	for (int i = 0; i < a.length; i++)
	{
	    System.out.print(a[i] + " ");

	}
	System.out.println("");
    }

    void permute(int[] a, int k)
    {
	if (k == a.length)
	    printArray(a);
	else
	    for (int i = k; i < a.length; i++)
	    {
		int temp = a[k];
		a[k] = a[i];
		a[i] = temp;
		permute(a, k + 1);
		temp = a[k];
		a[k] = a[i];
		a[i] = temp;
	    }
    }

    public static void main(String[] args)
    {
	PermutationsOfArray p = new PermutationsOfArray();
	int a[] = { 1, 2, 3, 4, 5, 6 };
	p.permute(a, 0);
    }

}
