package com.nano.pramp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Shortest Cell Path
In a given grid of 0s and 1s, we have some starting row and column sr, sc and a target row and column tr, tc. Return the length of the shortest path from sr, sc to tr, tc that walks along 1 values only.

Each location in the path, including the start and the end, must be a 1. Each subsequent location in the path must be 4-directionally adjacent to the previous location.

It is guaranteed that grid[sr][sc] = grid[tr][tc] = 1, and the starting and target positions are different.

If the task is impossible, return -1.

Examples:

input:
grid = [[1, 1, 1, 1], [0, 0, 0, 1], [1, 1, 1, 1]]
sr = 0, sc = 0, tr = 2, tc = 0
output: 8
(The lines below represent this grid:)
1111
0001
1111

grid = [[1, 1, 1, 1], [0, 0, 0, 1], [1, 0, 1, 1]]
sr = 0, sc = 0, tr = 2, tc = 0
output: -1
(The lines below represent this grid:)
1111
0001
1011
Constraints:

[time limit] 5000ms
[input] array.array.integer grid
1 ≤ arr.length = arr[i].length ≤ 10
[input] integer sr
[input] integer sc
[input] integer tr
[input] integer tc
All sr, sc, tr, tc are valid locations in the grid, grid[sr][sc] = grid[tr][tc] = 1, and (sr, sc) != (tr, tc).
[output] integer


 * @author NanoUser
 *
 */
public class ShortestCellPath
{
	static class Point{
		int x;
		int y;
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	// can't hear you now
	static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
		// your code goes here
		int m = grid.length;
		int n = grid[0].length;

		Queue<Point> q = new LinkedList<>();
		q.add(new Point(sr,sc));
		boolean[][] visited = new boolean[m][n];
		return bfs(q, grid, visited, m, n, tr, tc);
	}

	static int bfs(Queue<Point> q, int[][] grid, boolean[][] visited, int m , int n, int tr, int tc){
		int count=0;
		while(!q.isEmpty()){
			int size=q.size();
			for(int i=0;i<size;i++){
				Point p = q.poll();
				int x=p.x;
				int y=p.y;
				if(x==tr && y==tc){
					return count;
				}
				if(x+1<m && grid[x+1][y]==1 && !visited[x+1][y]){
					q.add(new Point(x+1, y));
					visited[x+1][y]=true;
				}

				if(y+1<n && grid[x][y+1]==1 && !visited[x][y+1]){
					q.add(new Point(x, y+1));
					visited[x][y+1]=true;
				}
				if(x-1>=0 && grid[x-1][y]==1 && !visited[x-1][y]){
					q.add(new Point(x-1, y));
					visited[x-1][y]=true;
				}
				if(y-1>=0 && grid[x][y-1]==1 && !visited[x][y-1]){
					q.add(new Point(x, y-1));
					visited[x][y-1]=true;
				}
			}
			count++;
		}
		return -1;
	}

	public static void main(String[] args) {

	}
}
