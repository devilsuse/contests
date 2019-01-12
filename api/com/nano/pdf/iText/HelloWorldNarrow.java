package com.nano.pdf.iText;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorldNarrow
{
    public static void main(String[] args)
    {
	Rectangle pageSize = new Rectangle(216f, 720f);
	Document document = new Document(pageSize);
	try
	{
	    PdfWriter.getInstance(document, new FileOutputStream(
		    "HelloWorld.pdf"));
	    document.open();
	    document.add(new Paragraph("Hello World!!!"));
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}
	document.close();
    }

}
