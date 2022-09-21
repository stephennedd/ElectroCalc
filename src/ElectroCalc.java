import javax.swing.*;
import java.text.DecimalFormat;

public class ElectroCalc {

    // this is a little program that calculates the price you pay when splitting an electric bill using JOptionPanes as a GUI
    // it takes the total bill and the usage in kilowatt and calculates the price you pay based on the usage
    public static void main(String[] args) {

        String currency = "AWG ";
        // create boolean to check if user wants to continue
        boolean running = true;

        // loop to keep program running
        while (running) {

            //create scanner to get user input and show in window
            double billTotalInFlorin = Double.parseDouble(JOptionPane.showInputDialog( "Enter the total bill in " + currency + ": "));
            double myMeterInKwh = Double.parseDouble(JOptionPane.showInputDialog( "Enter your usage in kWh: "));
            double totalMeterKwh = Double.parseDouble(JOptionPane.showInputDialog( "Enter the total meter reading in kWh: "));
            double myPercentage = (myMeterInKwh / totalMeterKwh) * 100;

            // create decimal format to show only 2 decimals
            DecimalFormat df = new DecimalFormat("#.##");
            double myBill = (billTotalInFlorin / 100) * myPercentage;

            // show the result
            JOptionPane.showMessageDialog(null, "Your percentage is: " + df.format(myPercentage) + "%\n" + "You pay: " + df.format(myBill) + " " + "€"  + "%\n" + "The remaining amount is: " + df.format(billTotalInFlorin - myBill) + " " + "€");

            // ask user if they want to calculate again
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to calculate another bill?");
            if (answer == JOptionPane.NO_OPTION) {
                running = false;
            }
        }
    }
}
