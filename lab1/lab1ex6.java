//John Power

/*
    getting stuck in a loop somewhere
 */

package lab1;
import javax.swing.JOptionPane;
public class lab1ex6 {

    public static void main(String[] args) {

        float height= 0, avgHeight=0, smallest=2.72f, tallest=0.54f, between=0, totalOverAveravge=0;
        int count=1;
        boolean correct=false;

        while (count<=6)
        {


            while (correct = false) {
                height=Float.parseFloat(JOptionPane.showInputDialog("please enter the height of person " + count));
                if(height<2.72&&height>0.54){
                    JOptionPane.showMessageDialog(null, "wrong try again");
                }
                else {
                    correct=true;
                    count++;

                    avgHeight+=height;
                    avgHeight= avgHeight/count;

                    if (height<smallest)
                    {
                        smallest=height;
                    }
                    if (height>tallest)
                    {
                        tallest=height;
                    }
                    if (height>=1.3f&&height<=1.9f)
                    {
                        between++;
                    }

                    if (height>1.665f){
                        totalOverAveravge+=height;
                    }
                    float percentOverAverage=(totalOverAveravge/count);

                }

            }
            correct=false;

        }

        JOptionPane.showMessageDialog(null, avgHeight+ "\n" + smallest + "\n" + tallest+ "\n" + between);


    }
}
