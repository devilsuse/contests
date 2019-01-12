package com.nano.inter;


public class SapientSearchInThreeFiles
{
	public static void main(String[] a)
	{
	}
}
/*
 * @Override
 * public List<FlightSearchDTO> searchFlightPrepare(String dirLocation) throws
 * FlightNotFoundException,
 * FileNotFoundException
 * {
 * File dir = new File(dirLocation);
 * List<FlightSearchDTO> flightDetailsInAllFiles = new
 * ArrayList<FlightSearchDTO>();
 * if (dir.exists())
 * {
 * File[] files = dir.listFiles();
 * for (int i = 0; i < files.length; i++)
 * {
 * File file = files[i];
 * try
 * {
 * BufferedReader readFileBr = new BufferedReader(new FileReader(file));
 * String fileData = null;
 * int firstLine = 0;
 * while ((fileData = readFileBr.readLine()) != null)
 * {
 * FlightSearchDTO flightSearchDTO = new FlightSearchDTO();
 * if (firstLine == 0)
 * {
 * firstLine = 1;
 * continue;
 * }
 * StringTokenizer st = new StringTokenizer(fileData, "|");
 * List<String> list = new LinkedList<String>();
 * int myIndex = 0;
 * while (st.hasMoreElements())
 * {
 * String data = "";
 * data = (String) st.nextElement();
 * list.add(myIndex, data);
 * myIndex++;
 * }
 * flightSearchDTO.setFlightNumber(list.get(0));
 * flightSearchDTO.setDepartureLoccation(list.get(1));
 * flightSearchDTO.setArrivalLocation(list.get(2));
 * flightSearchDTO.setFlightDate(list.get(3));// valid till
 * // in csv
 * // file
 * flightSearchDTO.setFilghtTime(list.get(4));
 * flightSearchDTO.setFlightDuration(list.get(5));
 * flightSearchDTO.setFare(list.get(6));
 * flightDetailsInAllFiles.add(flightSearchDTO);
 * }
 * }
 * catch (FileNotFoundException exception)
 * {
 * new FlightNotFoundException(exception.getMessage());
 * }
 * catch (IOException exception)
 * {
 * new FlightNotFoundException(exception.getMessage());
 * }
 * catch (Exception exception)
 * {
 * new FlightNotFoundException(exception.getMessage());
 * }
 * }
 * return flightDetailsInAllFiles;
 * }
 * else
 * {
 * throw new FileNotFoundException("File is not found on given location");
 * }
 * }
 * @Override
 * public List<FlightSearchDTO> searchFlightResult(String depLoc, String arrLoc,
 * String flightDate, String outPref,
 * String dirLocation) throws FlightNotFoundException, FileNotFoundException
 * {
 * List<FlightSearchDTO> allFlightData = searchFlightPrepare(dirLocation);
 * List<FlightSearchDTO> matchedFlightData = new ArrayList<FlightSearchDTO>();
 * for (Iterator iterator = allFlightData.iterator(); iterator.hasNext();)
 * {
 * FlightSearchDTO flightSearchDTO = (FlightSearchDTO) iterator.next();
 * if (flightSearchDTO.getDepartureLoccation().equalsIgnoreCase(depLoc)
 * && flightSearchDTO.getArrivalLocation().equalsIgnoreCase(arrLoc)
 * && flightSearchDTO.getFlightDate().equalsIgnoreCase(flightDate))
 * {
 * matchedFlightData.add(flightSearchDTO);
 * }
 * }
 * FlightComparator flightComparator = new FlightComparator();
 * flightComparator.setOutputPref(outPref);
 * Collections.sort(matchedFlightData, flightComparator);
 * return matchedFlightData;
 * }
 */

