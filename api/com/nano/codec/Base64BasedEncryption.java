package com.nano.codec;

import com.itextpdf.text.pdf.codec.Base64;

public class Base64BasedEncryption
{
    private static String abc = "xyz";

    public static void main(String[] args)
    {
	String encoded_abc = Base64.encodeBytes(abc.getBytes());
	System.out.println(encoded_abc);

	byte[] decoded_Bytes = Base64.decode(encoded_abc);
	System.out.println(new String(decoded_Bytes));

    }
}
