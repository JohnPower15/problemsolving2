//John Power
/*
    logical erroer
 */
package lab1;
import javax.swing.JOptionPane;
public class lab1ex7 {


    public static void main(String[] args) {

        int count=3, length=0, numberOfVowels=0, wordCount=1,edAperances=0;
        String name=" ";

        for (int i=0;i<=2; i++)
        {
            do{


                for (int j=0; j<name.length();j++)
                {   name=JOptionPane.showInputDialog("Please enter a word:");

                    JOptionPane.showMessageDialog(null, "the lenght of the sentence is " + name.length());
                    if(name.charAt(j)==' '){
                        wordCount++;
                    }
                    if(name.charAt(j)=='a'||name.charAt(j)=='e'||name.charAt(j)=='i'||name.charAt(j)=='o'||name.charAt(j)=='u'){
                        numberOfVowels++;
                    }
                    if(name.charAt(j)=='e'&&name.charAt(j+1)=='d'){
                        edAperances++;
                    }
                    JOptionPane.showMessageDialog(null, name + "\nNumber of words: " + wordCount + "\nNumber of vouls: " + numberOfVowels +
                                                    "\nNumber of times'ed' apears: " + edAperances);
                }


                count--;
            }
            while(count>0);
        }
    }

}
