package com.nano.core.math;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * @author LXMRX
 */
public class BigDecimalInvoiceApp
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double subtotal = 123.123;

		double discountPercent = 0.2;
		BigDecimal decimalSubtotal = new BigDecimal(Double.toString(subtotal));
		System.out.println(decimalSubtotal);
		decimalSubtotal = decimalSubtotal.setScale(2, RoundingMode.HALF_UP);
		System.out.println(decimalSubtotal);
		BigDecimal decimalDiscountPercent = new BigDecimal(Double.toString(discountPercent));

		BigDecimal discountAmount = decimalSubtotal.multiply(decimalDiscountPercent);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);

		BigDecimal totalBeforeTax = decimalSubtotal.subtract(discountAmount);
		BigDecimal salesTaxPercent = new BigDecimal(".05");
		BigDecimal salesTax = salesTaxPercent.multiply(totalBeforeTax);
		salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
		BigDecimal total = totalBeforeTax.add(salesTax);

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		System.out.println(decimalDiscountPercent + " " + decimalSubtotal);
		System.out.println("**************************");

		String message = "Subtotal:         " + currency.format(decimalSubtotal) + "\n" + "Discount percent: "
				+ percent.format(decimalDiscountPercent) + "\n" + "Discount amount:  "
				+ currency.format(discountAmount) + "\n" + "Total before tax: " + currency.format(totalBeforeTax)
				+ "\n" + "Sales tax:        " + currency.format(salesTax) + "\n" + "Invoice total:    "
				+ currency.format(total) + "\n";

		System.out.println(message);

	}
}
/*
 * Subtotal: $123.12
 * Discount percent: 20%
 * Discount amount: $24.62
 * Total before tax: $98.50
 * Sales tax: $4.93
 * Invoice total: $103.43
 */

