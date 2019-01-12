package com.manthano.test;

public class LastIndexOfTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	String linkToHomePage = "http://lxt010.emea.ads.lanxess/hrportal_d4qa/main.htm?page=HRPortalPage&form=1-1a2ae060-8dff-11e1-acef-002268157abe.1-040087d0-2fd5-11e3-bdd6-005056b500b1";
	linkToHomePage = linkToHomePage.substring(0,
		linkToHomePage.lastIndexOf("/") + 1);
	System.out.println(linkToHomePage);
	try
	{
	    LastIndexOfTest a = new LastIndexOfTest();
	    a.clone();
	}
	catch (CloneNotSupportedException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
