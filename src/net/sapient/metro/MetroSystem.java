package net.sapient.metro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import net.sapient.metro.bo.SmartCard;

/**
 * @author AMIT
 */
public class MetroSystem
{

	static Map<String, SmartCard>	smartCardmap	= new HashMap<String, SmartCard>();
	static Map<String, Integer>		stationMap		= new HashMap<String, Integer>();

	static
	{
		stationMap.put("A1", 0);
		stationMap.put("A2", 0);
		stationMap.put("A3", 0);
		stationMap.put("A4", 0);
		stationMap.put("A5", 0);
		stationMap.put("A6", 0);
		smartCardmap.put("smartCard_1", new SmartCard("smartCard_1", 90d));
		smartCardmap.put("smartCard_2", new SmartCard("smartCard_2", 2000d));
		smartCardmap.put("smartCard_3", new SmartCard("smartCard_3", 30d));
		smartCardmap.put("smartCard_4", new SmartCard("smartCard_4", 0d));
		smartCardmap.put("smartCard_5", new SmartCard("smartCard_5", 5d));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		boolean wantToTravel = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (wantToTravel)
		{
			System.out.println("Do you want to travel -  Please enter Y or N");
			String userWish = reader.readLine();
			if (!userWish.equalsIgnoreCase("Y"))
			{
				System.out.println("User wishes to opt out....");
				break;
			}
			boolean hasUserEnteredCorrectCardNum = false;
			String cardNumber = null;
			while (!hasUserEnteredCorrectCardNum)
			{
				System.out
						.println("Enter you cardNo - smartCard_1, smartCard_2, smartCard_3, smartCard_4, smartCard_5");
				cardNumber = reader.readLine();
				if (!smartCardmap.containsKey(cardNumber))
					continue;
				else
					hasUserEnteredCorrectCardNum = true;
			}

			boolean hasUserEnteredCorrectStation = false;
			String srcStation = null;
			while (!hasUserEnteredCorrectStation)
			{
				System.out.println("Choose Source Station from...");
				System.out.println("A1, A2, A3, A4, A5, A6, A7, A8, A9, A10");
				srcStation = reader.readLine();
				if (!stationMap.containsKey(srcStation))
					continue;
				else
				{
					Integer swipeCount = stationMap.get(srcStation);
					swipeCount++;
					stationMap.put(srcStation, swipeCount);
					hasUserEnteredCorrectStation = true;
				}
			}

			hasUserEnteredCorrectStation = false;
			String destStation = null;
			while (!hasUserEnteredCorrectStation)
			{
				System.out.println("Choose Destination Station from...");
				System.out.println("A1, A2, A3, A4, A5, A6, A7, A8, A9, A10");
				destStation = reader.readLine();
				if (!stationMap.containsKey(srcStation))
					continue;
				else
					hasUserEnteredCorrectStation = true;
			}

			// Calculate fare
			double fare = calculateFare(srcStation, destStation);
			if (fare > smartCardmap.get(cardNumber).getBalance())
			{

				System.out.println("You don't have sufficient balance. ");
				break;
			}
			else
			// Swipe-out the card and decrement price.
			{
				doSwipeOut(destStation);
				deductFare(smartCardmap.get(cardNumber), fare);
			}

			printTicket(srcStation, destStation, cardNumber, fare, smartCardmap.get(cardNumber).getBalance());
			printStationSwipes();

		}

	}

	/**
	 * printStationSwipes
	 */
	public static void printStationSwipes()
	{
		for (String stn : stationMap.keySet())
		{
			System.out.println("swipe for station " + stn + " - " + stationMap.get(stn));
		}
	}

	/**
	 * @param sm
	 * @param fare
	 */
	public static void deductFare(SmartCard sm, double fare)
	{
		sm.setBalance(sm.getBalance() - fare);
	}

	/**
	 * @param srcStation
	 * @param destStation
	 * @param cardNumber
	 * @param fare
	 * @param balance
	 */
	public static void printTicket(String srcStation, String destStation, String cardNumber, double fare, double balance)
	{
		System.out.println("Card " + cardNumber + " used to travel from station " + srcStation + " to station "
				+ destStation + " . Fare is Rs " + fare + " and balance on the card is Rs " + balance);
	}

	/**
	 * @param srcStation
	 * @param destStation
	 * @return double
	 */
	public static double calculateFare(String srcStation, String destStation)
	{
		char srcStnindex = srcStation.charAt(1);
		char destStnIndex = destStation.charAt(1);
		int distanceBetweenStation = Math.abs(destStnIndex - srcStnindex);
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		double fare;
		if (dayOfWeek == 1 || dayOfWeek == 7)
			fare = 7 * distanceBetweenStation;
		else
			fare = 5.5 * distanceBetweenStation;
		return fare;
	}

	/**
	 * @param destStation
	 */
	public static void doSwipeOut(String destStation)
	{
		Integer swipeCount = stationMap.get(destStation);
		swipeCount++;
		stationMap.put(destStation, swipeCount);
	}
}
