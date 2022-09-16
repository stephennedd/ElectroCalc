import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    // this is a little program that calculates the price you pay when splitting an electric bill in a java swing GUI
    // it takes the total bill and the usage in kilowatt and calculates the price you person pays
    public static void main(String[] args) {

        // create boolean to check if user wants to continue
        boolean running = true;

        // loop to keep program running
        while (running) {

            // create scanner to get user input and show in window
            double billTotalInFlorin = Double.parseDouble(JOptionPane.showInputDialog("Enter the total bill in your currency: "));
            double myMeterInKwh = Double.parseDouble(JOptionPane.showInputDialog("Enter your usage in kWh: "));
            double totalMeterKwh = Double.parseDouble(JOptionPane.showInputDialog("Enter the total meter reading in kWh: "));
            double myPercentage = (myMeterInKwh / totalMeterKwh) * 100;

            // create decimal format to show only 2 decimals
            DecimalFormat df = new DecimalFormat("#.##");
            double myBill = (billTotalInFlorin / 100) * myPercentage;

            // show the result
            JOptionPane.showMessageDialog(null, "Your bill is: " + df.format(myBill) + " florin");

            // ask user if they want to calculate again
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to calculate another bill?");
            if (answer == JOptionPane.NO_OPTION) {
                running = false;
            }
        }
    }
}
