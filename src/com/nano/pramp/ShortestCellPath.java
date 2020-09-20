package com.nano.pramp;

import java.util.LinkedList;
import java.util.Queue;

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
