package com.nano.hacker.algo.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem Statement
 * 
 * John has discovered various rocks. Each rock is composed of various elements,
 * and each element is represented by a lowercase latin letter from 'a' to 'z'.
 * An element can be present multiple times in a rock. An element is called a
 * 'gem-element' if it occurs at least once in each of the rocks.
 * 
 * Given the list of N rocks with their compositions, display the number of
 * gem-elements that exist in those rocks.
 * 
 * Input Format The first line consists of N, the number of rocks. Each of the
 * next N lines contain rocks' composition. Each composition consists of
 * lowercase letters of English alphabet.
 * 
 * Output Format Print the number of gem-elements that are common in these
 * rocks. If there are none, print 0.
 * 
 * Constraints 1 ≤ N ≤ 100 Each composition consists of only lowercase latin
 * letters ('a'-'z'). 1 ≤ Length of each composition ≤ 100
 * 
 * Sample Input
 * 
 * 3 abcdde baccd eeabg Sample Output
 * 
 * 2 Explanation Only "a", "b" are the two kind of gem-elements, since these are
 * the only characters that occur in each of the rocks' composition.
 * 
 * @author LXMRX
 *
 */
public class GemStones
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	// As per one of the constraints, 1<= N <= 100
	// So using byte instead of int for saving some memory.
	byte totalNumberOfRocks = (byte) Integer.parseInt(scanner.nextLine());

	// As per constraints, 1 <= Length of each composition <= 100,
	// So using byte to save memory. Also initializing it with maximum
	// length to find minimum.
	byte minimumLengthRockComposition = 100;
	String[] rockCompositionArray = new String[totalNumberOfRocks];
	String rockComposition = null;
	String minLengthRock = null;
	for (byte i = 0; i < totalNumberOfRocks; i++)
	{
	    rockComposition = scanner.nextLine();
	    if (rockComposition.length() < minimumLengthRockComposition)
	    {
		minimumLengthRockComposition = (byte) rockComposition.length();
		minLengthRock = rockComposition;
	    }
	    rockCompositionArray[i] = rockComposition;
	}

	process(rockCompositionArray, minLengthRock);
	scanner.close();

    }

    private static void process(String[] rockCompositionArray,
	    String minLengthRock)
    {
	char c = 0;
	int matches = 0;

	// Here set is used so that if minLengthRock contains same character
	// multiple times, then its added in once only.
	// Previously I used List which didnt pass all the tests.
	Set<Character> characterSet = new HashSet<>();
	for (byte i = 0; i < minLengthRock.length(); i++)
	{
	    c = minLengthRock.charAt(i);
	    matches = 0;
	    for (byte j = 0; j < rockCompositionArray.length; j++)
	    {
		if (rockCompositionArray[j].indexOf(c) != -1)
		{
		    matches++;
		}
		else
		    break;
	    }
	    if (matches == rockCompositionArray.length)
	    {
		characterSet.add(c);// count++;// matchedCharList.add(c);
	    }
	}
	System.out.println(characterSet.size());

    }
}
