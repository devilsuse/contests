package com.nano.hacker.java.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Problem Statement
 * 
 * Comparators are used to compare two objects to sort them. This problem will
 * test your knowledge on Java Comparators.
 * 
 * There are N players in a tournament. You will be given the name of each
 * player and his score. You need to sort the players in decreasing order by
 * score. If two players have the same score, the one whose name is
 * lexicographically larger should appear first.
 * 
 * Note: We have already provided you with the partially completed code in the
 * editor. Your task is to create the class Checker which uses a comparator desc
 * to sort the players.
 * 
 * A string is lexicographically smaller than another string if it appears
 * earlier in a standard dictionary. For example, "cat" is lexicographically
 * smaller than "dog", but larger than "cab" or "ca".
 * 
 * Input Format
 * 
 * The first line contains an integer N, denoting the number of players. The
 * next N lines contain the name of a player and his score separated by a space.
 * Two players can have the same name. A name will consist of lowercase English
 * characters. The score of a player can range from 0 to 1000. You don't need to
 * worry about any other constraints.
 * 
 * Output Format
 * 
 * Print each player and their space-separated score on a different line
 * according to the directions in the problem statement.
 * 
 * Sample Input
 * 
 * 5 amy 100 david 100 heraldo 50 aakansha 75 aleksa 150 Sample Output
 * 
 * aleksa 150 david 100 amy 100 aakansha 75 heraldo 50
 * 
 * @author LXMRX
 *
 */
public class JavaComparator
{
    public static void main(String[] args) throws NumberFormatException,
	    IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int N = Integer.parseInt(br.readLine().trim());
	String s;
	StringTokenizer st;
	Player Player[] = new Player[N];
	Checker check = new Checker();
	for (int i = 0; i < N; i++)
	{
	    s = br.readLine().trim();
	    st = new StringTokenizer(s);
	    Player[i] = new Player();
	    Player[i].name = st.nextToken();
	    Player[i].score = Integer.parseInt(st.nextToken());
	}

	Arrays.sort(Player, check.desc);
	for (int i = 0; i < Player.length; i++)
	{
	    System.out.printf("%s %s\n", Player[i].name, Player[i].score);
	}

    }

}

class Player
{
    String name;
    int    score;
}

class Checker
{
    static final Comparator<Player> desc = new Comparator<Player>() {
					     @Override
					     public int compare(Player o1,
						     Player o2)
					     {
						 int diff = o2.score - o1.score;
						 return (diff != 0 ? diff
							 : o2.name
								 .compareTo(o1.name));
					     }
					 };

}
