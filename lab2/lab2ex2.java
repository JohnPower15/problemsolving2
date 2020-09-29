package lab2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class lab2ex2 {

    public static void main(String[] args) {

       String responce="";
       boolean exit=false;
       int playerRoll, compRoll, gamesPlayed=0, compWins=0, playerWins=0, draws=0;


        while (exit==false) {

            responce = JOptionPane.showInputDialog("Would you like to play a game of dice yes/no");


            if (responce.equals("yes")) {
                gamesPlayed++;

                playerRoll = (int) (Math.random() * 10) + 2;
                compRoll = (int) (Math.random() * 10) + 2;

                if (compRoll > playerRoll) {
                    compWins++;
                } else if (compRoll < playerRoll) {
                    playerWins++;
                } else {
                    draws++;
                }

                JOptionPane.showMessageDialog(null, "Games played" + gamesPlayed + "\nComputer Wins" +
                        compWins + "\nPlayer wins" + playerWins + "\nDraws: " + draws);


            } else if (responce.equals("no")) {
                exit = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid choice");
            }

        }

    }
}
