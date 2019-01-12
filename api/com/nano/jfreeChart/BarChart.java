package com.nano.jfreeChart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFreeChart objChart = ChartFactory.createBarChart("Demo Bar Chart", // Chart
																			// title
				"Mobile Manufacturer", // Domain axis label
				"Market Share", // Range axis label
				getDataSet(), // Chart Data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend?
				true, // include tooltips?
				false // include URLs?
				);
		ChartFrame frame = new ChartFrame("Demo", objChart);
		frame.pack();
		frame.setVisible(true);

	}

	static DefaultCategoryDataset getDataSet()
	{
		DefaultCategoryDataset barDataSet = new DefaultCategoryDataset();
		barDataSet.setValue(29, "Q1", "Apple");
		barDataSet.setValue(15, "Q1", "HTC");
		barDataSet.setValue(24, "Q1", "Samsung");

		barDataSet.setValue(22, "Q2", "Apple");
		barDataSet.setValue(18, "Q2", "HTC");
		barDataSet.setValue(25, "Q2", "Samsung");
		return barDataSet;
	}

}
