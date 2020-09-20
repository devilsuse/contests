package com.nano.leet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverseII
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("DiagonalTraverseTestcase.txt");
		StringBuilder sb = new StringBuilder();
		//byte[] b = Files.readAllBytes(f.toPath());
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line  = null;
		while((line=br.readLine())!=null)
			sb.append(line);
		
		sb= sb.deleteCharAt(0); //delete first '[' 
		sb.deleteCharAt(sb.length()-1); //delete last ']'
		
		String[] a = sb.toString().split(",");

	}

	public int[] findDiagonalOrder(List<List<Integer>> nums) 
    {
        List<Integer> result = new ArrayList<>();
        int maxCols = 0;
        //top diagonal --> iterate from top row to last row
        for(int i=0;i<nums.size();i++)
        {
            int row=i;
            maxCols = Math.max(maxCols,nums.get(row).size());
            int j=0;
            while(row>=0 && j<=i)
            {
                  if(nums.get(row).size()>j)
                        result.add(nums.get(row).get(j));
                j++;
                row--;
            }
        }
        
        //bottom diagonal -> iterate over first COLUMN(NOT row) to last COLUMN(NOT row)
        for(int j=1;j<maxCols;j++)
        {
            int col=j;
           // while()
            for(int i=nums.size()-1;i>=0 && col<maxCols;i--)
            {
                if(nums.get(i).size()>col)
                    result.add(nums.get(i).get(col));
                col++;
            }
        }
        
        int[] a = new int[result.size()];
        for(int i=0;i<result.size();i++)
            a[i]=result.get(i);
        
        return a;
    }
}
