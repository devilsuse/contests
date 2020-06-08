package net.sapient.metro.bo;

import java.util.concurrent.ConcurrentHashMap;

public class SmartCard
{
//ConcurrentHashMap<K, V>
	private String	cardNumber	= null;
	private double	balance		= 0.0d;

	public SmartCard(String cardNumber, double balance)
	{
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof SmartCard))
			return false;
		SmartCard smartCard = (SmartCard) obj;
		return this.cardNumber.equals(smartCard.cardNumber);
	}

	@Override
	public int hashCode()
	{
		return this.cardNumber.hashCode();
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return cardNumber;
	}

	/**
	 * @param cardNumber
	 *            the cardNumber to set
	 */
	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}
