package com.nano.algo;

import java.util.Arrays;

public class BinarySearchTree
{
    public static void main(String[] args)
    {
	int[] a = { 1, 3, 2, 5, 4 };
	// printArray(a);
	Arrays.sort(a);
	// printArray(a);

	TreeNode root = sortedArrayToBST(a, 0, a.length - 1);
	printBST(root);
    }

    private static void printBST(TreeNode root)
    {
	/*
	 * while (root != null) { System.out.println("Left of " +
	 * root.getValue() + " is " + printBST(root.getLeft()));
	 * System.out.println("Right of " + root.getValue() + " is " +
	 * printBST(root.getRight())); }
	 */

	if (root.getLeft() != null)
	{
	    System.out.println("Left of " + root.getValue() + " is "
		    + root.getLeft().getValue());
	    printBST(root.getLeft());
	}

	if (root.getRight() != null)
	{
	    System.out.println("Right of " + root.getValue() + " is "
		    + root.getRight().getValue());
	    printBST(root.getRight());
	}
	/*
	 * while (root.getLeft() != null) { System.out.println("Left of " +
	 * root.getValue() + " is " + root.getLeft().getValue()); root =
	 * root.getLeft(); }
	 * 
	 * while (root.getRight() != null) { System.out.println("Right of " +
	 * root.getValue() + " is " + root.getRight().getValue()); root =
	 * root.getRight(); }
	 */
    }

    private static void printArray(int[] a)
    {
	for (int i = 0; i < a.length; i++)
	    System.out.print(a[i] + " ");
	System.out.println();
    }

    private static TreeNode sortedArrayToBST(int[] a, int start, int end)
    {
	TreeNode root = null;

	if (start > end)
	    return null;

	int midIndex = (start + end) / 2;

	root = new TreeNode(a[midIndex]);
	root.setLeft(sortedArrayToBST(a, start, midIndex - 1));
	root.setRight(sortedArrayToBST(a, midIndex + 1, end));
	return root;
    }
}

class TreeNode
{
    int	      value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value)
    {
	this.value = value;
    }

    public int getValue()
    {
	return value;
    }

    public void setValue(int value)
    {
	this.value = value;
    }

    public TreeNode getLeft()
    {
	return left;
    }

    public void setLeft(TreeNode left)
    {
	this.left = left;
    }

    public TreeNode getRight()
    {
	return right;
    }

    public void setRight(TreeNode right)
    {
	this.right = right;
    }
}