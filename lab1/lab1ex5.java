//John Power
/*
 This is a program to recap programing some more complex math functions
 it determines the acceleration due to gravity of a planet, based on user-supplied values
 */

package lab1;
import javax.swing.JOptionPane;
public class lab1ex5 {

    public static void main(String[] args) {

        final double gravity=9.81;
        double massOfPlanet, radiusOfPlanet, massOfPlanet2, radiusOfPlanet2;

        double acdtg;

        massOfPlanet=Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of planet1: "));
        radiusOfPlanet=Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of planet1: "));
        massOfPlanet2=Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of planet2: "));
        radiusOfPlanet2=Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of planet2: "));

        acdtg=(gravity*massOfPlanet2*(radiusOfPlanet*radiusOfPlanet))/(massOfPlanet*(radiusOfPlanet2*radiusOfPlanet2));

        JOptionPane.showMessageDialog(null, "The aceleration due to gravity on the other planet is " + String.format("%.2f", acdtg) + "m/s/s");
    }
}
