//John Power

/*
    still Refreshing after summer hols with some basic input output program
 */


package lab1;

import javax.swing.*;

public class lab1ex3 {

    public static void main (String args[])
    {
        String name, course, snacksString="";
        int snacks, cost;

        name=JOptionPane.showInputDialog("Please enter your name.");
        course=JOptionPane.showInputDialog("Please enter your course.");
        snacks= Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like."));

        cost = snacks*2;

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nCourse: " + course + "\nSnacks: " + snacks + "\nCost: £" + cost, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
