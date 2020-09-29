//John Power
/*

 */

package lab2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class lab2ex1 {

    public static void main(String[] args) {

        String serialNum, processorType, hardDiskSpaceAsString, priceAsString, cheapest="";
        int hardDiskSpace, count=0;
        float price, avgDiskSpace=0, highprice=0, lowPrice=0;
        boolean exit=false, validHardDisk=false;

        while (!exit==true){

            serialNum=JOptionPane.showInputDialog("Please enter the serial number (<cr> tio exit)");
            if (serialNum.equals(""))
                exit=true;
            else{
                count++;
                while(!validHardDisk==true){
                    hardDiskSpaceAsString=JOptionPane.showInputDialog("Please enter the hard-disk space");
                    hardDiskSpace=Integer.parseInt(hardDiskSpaceAsString);

                    if (hardDiskSpace>0&&hardDiskSpace>=50&&hardDiskSpace<=5000){
                        validHardDisk=true;
                    }
                    else if(hardDiskSpaceAsString.equals("")){
                        exit=true;
                    }
                    else{
                        hardDiskSpaceAsString=JOptionPane.showInputDialog("Please enter the hard-disk space");
                        hardDiskSpace=Integer.parseInt(hardDiskSpaceAsString);
                    }
                    validHardDisk=false;

                    processorType=JOptionPane.showInputDialog("Please enter the processor type");
                    if (processorType.equals(""))
                        exit=true;

                    priceAsString=JOptionPane.showInputDialog("Please enter the cost");
                    price=Float.parseFloat(priceAsString);
                    if (priceAsString.equals(""))
                        exit=true;
                    else if(price>highprice)
                    {
                        highprice=price;
                    }
                    else if (price<lowPrice)
                    {
                        lowPrice=price;
                        cheapest=processorType;
                    }



                    avgDiskSpace=((avgDiskSpace+hardDiskSpace)/count);

                }

            }



        }
        JOptionPane.showMessageDialog(null, "Avg disk space" + avgDiskSpace +
                "\nPrice range is" + lowPrice + "to" + highprice + "cheapest processor is" + cheapest);

    }

    //public static int averageDiskSpace(int totalDiskSpace, int numOfComputers){ }
}
