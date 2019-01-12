package com.nano.core;

import java.io.DataInputStream;
import java.io.IOException;

public class ByteTest
{
	public static void main(String[] args)
	{
		DataInputStream in = new DataInputStream(System.in);

		try
		{
			byte d;
			while ((d = in.readByte()) != 0)
			{
				System.out.println(d);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.exit(0);
	}
}
