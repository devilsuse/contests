package com.nano.jfreeChart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * http://www.codeproject.com/Articles/650480/Introduction-to-JFreeChart
 * 
 * @author LXMRX
 */
public class PieChart
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFreeChart pieChart = ChartFactory.createPieChart("Mobile Popularity", getDataSet(), true, true, false);
		ChartFrame frame = new ChartFrame("FrameTitle", pieChart);
		frame.pack();
		frame.setVisible(true);
	}

	static DefaultPieDataset getDataSet()
	{
		DefaultPieDataset pieDataSet = new DefaultPieDataset();
		pieDataSet.setValue("Apple", 30);
		pieDataSet.setValue("Samsung", 40);
		pieDataSet.setValue("HTC", 5);
		pieDataSet.setValue("MicroMax", 25);
		return pieDataSet;
	}

}
