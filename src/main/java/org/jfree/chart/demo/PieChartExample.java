// Import statements
package org.jfree.chart.demo;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.swing.ChartPanel;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class PieChartExample extends JFrame {

    private static final long serialVersionUID = 1L;

    public PieChartExample(String title) {
        // Add title
        super(title);

        // Create dataset
        XYDataset dataset = createDataset();

        // Create chart
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Pie Chart Example", // Chart
                "Date", // X-Axis Label
                "Number", // Y-Axis Label
                dataset);

        //Changes background color
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(new Color(255,228,196));

        // Crate panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private XYDataset createDataset() {
        // Create a new dataset
        TimeSeriesCollection dataset = new TimeSeriesCollection();

        // Create a new chart and add appropriate dataset
        TimeSeries series1 = new TimeSeries("Series1");
        series1.add(new Day(1, 1, 1890), 50);
        series1.add(new Day(2, 2, 1890), 40);
        series1.add(new Day(3, 3, 1890), 45);
        series1.add(new Day(4, 4, 1890), 30);
        series1.add(new Day(5, 5, 1890), 50);
        series1.add(new Day(6, 6, 1890), 45);
        series1.add(new Day(7, 7, 1890), 60);
        series1.add(new Day(8, 8, 1890), 45);
        series1.add(new Day(9, 9, 1890), 55);
        series1.add(new Day(10, 10, 1890), 48);
        series1.add(new Day(11, 11, 1890), 60);
        series1.add(new Day(12, 12, 1890), 45);
        series1.add(new Day(1, 1, 1891), 65);
        series1.add(new Day(2, 2, 1891), 45);
        series1.add(new Day(13, 3, 1891), 55);
        dataset.addSeries(series1);

        // Create a new chart and add appropriate dataset
        TimeSeries series2 = new TimeSeries("Series2");
        series2.add(new Day(1, 1, 1890), 40);
        series2.add(new Day(2, 1, 1890), 35);
        series2.add(new Day(3, 1, 1890), 26);
        series2.add(new Day(4, 1, 1890), 45);
        series2.add(new Day(5, 1, 1890), 40);
        series2.add(new Day(6, 1, 1890), 35);
        series2.add(new Day(7, 1, 1890), 45);
        series2.add(new Day(8, 1, 1890), 48);
        series2.add(new Day(9, 1, 1890), 31);
        series2.add(new Day(10, 1, 1890), 32);
        series2.add(new Day(11, 1, 1890), 21);
        series2.add(new Day(12, 1, 1890), 35);
        series2.add(new Day(13, 1, 1890), 10);
        series2.add(new Day(14, 1, 1890), 25);
        series2.add(new Day(15, 1, 1890), 15);
        dataset.addSeries(series2);

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PieChartExample example = new PieChartExample("Pie Chart");
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setVisible(true);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}