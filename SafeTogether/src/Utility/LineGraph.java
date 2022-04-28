/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
//import org.jfree.ui.ApplicationFrame;
//import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author arjunbirju
 */
public class LineGraph extends javax.swing.JPanel {
    private final DefaultCategoryDataset dataset;
    private String title;
    private String xAxisLabel;
    private String yAxisLabel;
    
    public LineGraph(String chartTitle,String xAxisLabel, String yAxisLabel, DefaultCategoryDataset dataset) {       
        this.dataset = dataset;
        this.title = chartTitle;
        this.xAxisLabel = xAxisLabel;
        this.yAxisLabel = yAxisLabel;
   }

   public JPanel getGraph() {
//      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         title,
         xAxisLabel,yAxisLabel,
         dataset,
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      return chartPanel;
//      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
//      setContentPane( chartPanel );
   }
}


//   private DefaultCategoryDataset createDataset( ) {
//      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
//      dataset.addValue( 15 , "schools" , "1970" );
//      dataset.addValue( 30 , "schools" , "1980" );
//      dataset.addValue( 60 , "schools" ,  "1990" );
//      dataset.addValue( 120 , "schools" , "2000" );
//      dataset.addValue( 240 , "schools" , "2010" );
//      dataset.addValue( 300 , "schools" , "2014" );
//      return dataset;
//   }
   
//   public static void main( String[ ] args ) {
//      LineGraph chart = new LineGraph(
//         "School Vs Years" ,
//         "Numer of Schools vs years");
//
////      chart.pack( );
////      RefineryUtilities.centerFrameOnScreen( chart );
////      chart.setVisible( true );
//   }