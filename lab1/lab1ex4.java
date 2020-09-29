//John Power

/*
    some basic input output and math program
 */

package lab1;

import javax.swing.*;

public class lab1ex4 {
    public static void main(String args[])
    {
        String name;
        int kmTraveled;
        double moneyMade;

        name=JOptionPane.showInputDialog("Please enter your name.");
        kmTraveled=Integer.parseInt(JOptionPane.showInputDialog("please enter km cycled."));

        if (kmTraveled<11)
        {
            moneyMade=kmTraveled*1.75;

        }
        else{
            moneyMade=17.5+(kmTraveled-10)*2.5;
        }

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance cycled: " + kmTraveled + "km" + "\nSponsorship amount due: £" + String.format("%.2f", moneyMade), "Recipet", JOptionPane.INFORMATION_MESSAGE);

    }
}
