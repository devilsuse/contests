package com.nano.inter;

public class MaxNummerAusNummers
{

	public static void main(String[] args)
	{
		// String[] nos = { "45", "60", "540", "87", "11" };// 87605404511
		// String[] nos = { "54", "546", "548", "60" };// 6054854654
		// String[] nos = { "7", "776", "7", "7" };// 777776
		String[] nos = { "1", "34", "3", "98", "9", "76", "45", "4" }; // 998764543431
		String abc = getVisuallyMaxNummer(nos);

	}

	private static String getVisuallyMaxNummer(String[] nos)
	{
		String nums[] = new String[nos.length];
		int i = 0;
		for (String num : nos)
		{
			nums[i] = Character.toString(num.charAt(0));
			i++;
		}
		sortDec(nums, nos);
		makeNos(nums, nos);
		return null;
	}

	private static void makeNos(String[] nums, String[] nos)
	{
		String finalNos = "";
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (!nums[i].equals(nums[i + 1]))
			{
				finalNos = finalNos + nos[i];
			}
			else
			{
				String num1, num2;
				num1 = nos[i] + nos[i + 1];
				num2 = nos[i + 1] + nos[i];
				if (Integer.parseInt(num1) > Integer.parseInt(num2))
				{
					finalNos = finalNos + nos[i];
				}
				else
				{
					finalNos = finalNos + nos[i + 1];
					nos[i + 1] = nos[i];
				}
			}
		}
		finalNos = finalNos + nos[nums.length - 1];
		System.out.println(finalNos);
	}

	private static void sortDec(String[] nums, String[] nos)
	{
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = 0; j < nums.length - i - 1; j++)
			{
				int num1 = Integer.parseInt(nums[j]);
				int num2 = Integer.parseInt(nums[j + 1]);
				if (num1 < num2)
				{
					String swap1 = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = swap1;

					String swap2 = nos[j];
					nos[j] = nos[j + 1];
					nos[j + 1] = swap2;
				}
			}
		}
	}
}
