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
}