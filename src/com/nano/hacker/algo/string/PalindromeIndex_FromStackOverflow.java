package com.nano.hacker.algo.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeIndex_FromStackOverflow
{
    public static void main(String[] args)
    {

	List<String> inputStrs = readInput();

	for (String inputStr : inputStrs)
	{
	    int index = findIndexToRemove(inputStr);
	    System.out.println(index);
	}
    }

    private static List<String> readInput()
    {
	int inputSize;
	List<String> inputStrs = new ArrayList<>();
	try (Scanner scanner = new Scanner(System.in))
	{
	    inputSize = Integer.parseInt(scanner.nextLine());
	    for (int i = 0; i < inputSize; i++)
	    {
		inputStrs.add(scanner.nextLine());
	    }
	}
	return inputStrs;
    }

    private static int findIndexToRemove(String inputStr)
    {
	int i = findIndexOfDifference(inputStr);
	int result;
	if (i == -1)
	{
	    // String is a palindrome
	    result = -1;
	}
	else
	{
	    // Either the char at i or the char at the opposite side
	    // (length-1-i)
	    // is the char to remove. Let's remove one of them and see
	    // if the result is a palindrome
	    if (findIndexOfDifference(removeChar(inputStr, i)) == -1)
	    {
		result = i;
	    }
	    else
	    {
		result = inputStr.length() - 1 - i;
	    }
	}
	return result;
    }

    /**
     * Returns the position of the first character that is not equal to the
     * character at its symmetric position (i.e. the char at the same position
     * counting from the opposite side of the string).
     */
    private static int findIndexOfDifference(String inputStr)
    {
	int i = 0, j = inputStr.length() - 1;
	while (i < j && inputStr.charAt(i) == inputStr.charAt(j))
	{
	    i++;
	    j--;
	}
	int index;
	if (i < j)
	{
	    index = i;
	}
	else
	{
	    index = -1;
	}
	return index;
    }

    private static String removeChar(String str, int charIndex)
    {
	String firstPart = str.substring(0, charIndex);
	String secondPart = str.substring(
		Math.min(str.length(), charIndex + 1), str.length());
	return firstPart + secondPart;
    }
}
