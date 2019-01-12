package com.nano.core.algo.graphtheory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS
{
    private Queue<Integer> queue;
    private int[]	  parent;

    public BFS()
    {
	queue = new LinkedList<Integer>();
    }

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int vertices = scanner.nextInt();
	int edgesCount = scanner.nextInt();
	int[][] edges = new int[edgesCount][2];

	for (int i = 0; i < edgesCount; i++)
	{
	    for (int j = 0; j < 2; j++)
		edges[i][j] = scanner.nextInt();
	}
	scanner.close();
    }
}
