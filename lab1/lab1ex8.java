//JohnPower
/*

 */

package lab1;
import javax.swing.JOptionPane;

public class lab1ex8 {

    public static void main(String[] args) {

        int choice = 0, number, factorial=0;



        while (choice != 3) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Please pick a positive whole number"));
            choice = Integer.parseInt(JOptionPane.showInputDialog("1. is odd or even\n2.factorial\n3. Exit"));

            switch (choice) {
                case 1:

                    if (number % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "the number is even");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "the number is odd");

                    }


                    break;
                case 2:
                        if (number>0)
                        {
                            while (number>1)
                            {
                               factorial+=number*(number-1);
                                number--;


                            }
                            JOptionPane.showMessageDialog(null, "the factorial is " + factorial);


                        }
                        else{
                            JOptionPane.showMessageDialog(null, "the number is not positive");

                        }
                    break;

                case 3:

                    break;
                default:

            }
        }

    }



}
