package com.nano.inter.paypay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CashRegister
{
	/**
	 * Iterate through each line of input.
	 */
	/*
'PENNY': .01,
'NICKEL': .05,
'DIME': .10,
'QUARTER': .25,
'HALF DOLLAR': .50,
'ONE': 1.00,
'TWO': 2.00,
'FIVE': 5.00,
'TEN': 10.00,
'TWENTY': 20.00,
'FIFTY': 50.00,
'ONE HUNDRED': 100.00
	 */

	private static final String ERROR = "ERROR";
	private static final String ZERO =  "ZERO";

	private static final String PENNY =  "PENNY";
	private static final String NICKEL =  "NICKEL";
	private static final String DIME =  "DIME";
	private static final String QUARTER =  "QUARTER";
	private static final String HALF_DOLLAR =  "HALF DOLLAR";
	private static final String ONE =  "ONE";

	private static final String TWO =  "TWO";
	private static final String FIVE =  "FIVE";
	private static final String TEN =  "TEN";
	private static final String TWENTY =  "TWENTY";
	private static final String FIFTY =  "FIFTY";
	private static final String ONE_HUNDRED =  "ONE HUNDRED";
	
	//private static final BigDecimal ZERO_BD = new BigDecimal(0);
	private static final BigDecimal PENNY_BD = new BigDecimal(0);
	private static final BigDecimal NICKEL_BD = new BigDecimal(0.05);
	private static final BigDecimal DIME_BD = new BigDecimal(0.10);
	private static final BigDecimal QUARTER_BD = new BigDecimal(.25);
	private static final BigDecimal HALF_DOLLAR_BD = new BigDecimal(0.5);
	private static final BigDecimal ONE_BD = new BigDecimal(1);
	private static final BigDecimal TWO_BD = new BigDecimal(2);
	private static final BigDecimal FIVE_BD = new BigDecimal(5);
	private static final BigDecimal TEN_BD = new BigDecimal(10);
	private static final BigDecimal TWENTY_BD = new BigDecimal(20);
	private static final BigDecimal FIFTY_BD = new BigDecimal(50);
	private static final BigDecimal ONE_HUNDRED_BD = new BigDecimal(100);
	
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			String[] a = line.split(";");
			System.out.println(change(a[0],a[1]));
		}
	}

	static String change(String s1, String s2){
		// 
		/*
		 * double v1 = Double.parseDouble(s1); double v2 = Double.parseDouble(s2);
		 * double diff = v2-v1;
		 */
		BigDecimal b1 = new BigDecimal(s1);
		BigDecimal b2 = new BigDecimal(s2);
		BigDecimal diff = b2.subtract(b1);
		if(diff.doubleValue()<0){
			return ERROR;
		}
		else if(diff.doubleValue()==0){
			return ZERO;
		}

		List<String> list= change(diff);
		Collections.sort(list);
		/*  StringBuilder sb = new StringBuilder();
  for(String s : list){
    sb.append(s)
  }*/

		return  String.join(",",list);
	}

	static List<String> change(BigDecimal v){
		List<String> list = new ArrayList<>();
		//System.out.println(v);
		//int i=0;
		while(v.doubleValue()>0){
			// System.out.println(v + " : " + i++);
			if(v.compareTo(ONE_HUNDRED_BD)>=1){
				list.add(ONE_HUNDRED);
				v = v.subtract(new BigDecimal(100));//-=100;
			}
			//else if(v.doubleValue()>=50){
			else if(v.compareTo(FIFTY_BD)>=1){
				list.add(FIFTY);
				v=v.subtract(new BigDecimal(50));
			}
			//else if(v.doubleValue()>=20){
			else if(v.compareTo(TWENTY_BD)>=1){
				list.add(TWENTY);
				v=v.subtract(new BigDecimal(20));
			}
			//else if(v.doubleValue()>=10){
			else if(v.compareTo(TEN_BD)>=1){
				list.add(TEN);
				v=v.subtract(new BigDecimal(10));
			}
			//else if(v>=5){
			else if(v.compareTo(FIVE_BD)>=1) {
				list.add(FIVE);
			v=v.subtract(new BigDecimal(5));
			}
			//else if(v>=2){
			else if(v.compareTo(TWO_BD)>=1) {
				list.add(TWO);
				v=v.subtract(new BigDecimal(2));
			}
			//else if(v>=1){
			else if(v.compareTo(ONE_BD)>=1) {
				list.add(ONE);
				v=v.subtract(new BigDecimal(1));
			}
			//else if(v>=0.5){
			else if(v.compareTo(HALF_DOLLAR_BD)>=1) {
				list.add(HALF_DOLLAR);
				v=v.subtract(new BigDecimal(0.5));
			}
			//else if(v>=0.25){
			else if(v.compareTo(QUARTER_BD)>=1) {
				list.add(QUARTER);
				v=v.subtract(new BigDecimal(0.25));
			}
			//else if(v>=0.1){
			else if(v.compareTo(DIME_BD)>=1) {
				list.add(DIME);
				v=v.subtract(new BigDecimal(0.1));
			}
			//else if(v>=0.05){
			else if(v.compareTo(NICKEL_BD)>=1) {
				list.add(NICKEL);
				v=v.subtract(new BigDecimal(0.05));
			}
			//else if(v>=0.01){
			else if(v.compareTo(PENNY_BD)>=1) {
				list.add(PENNY);
				v=v.subtract(new BigDecimal(0.01));
			}
		}
		return list;
	}
}
