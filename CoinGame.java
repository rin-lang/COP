
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
/*
Katherine Lang
This is a program to play a coin game where the computer and human
take turns taking coins out from a pile that starts with 21 coins.
*/
public class CoinGame {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int whoWon = 0;
        int coins = 21; //added in feature 3 - keeps track of coins
        int whoIsNext = 1; //added in fetaure 5 - who's turn it is
        int youDecide = 0;
        System.out.println("There are 21 coins.");

        //game loop stuff
        while (whoWon == 0)
        {
         if (whoIsNext == 1)//computer turn
         {
            whoIsNext = 2;

            int take = (int)(Math.random() * 3) + 1;
            System.out.println("Computer takes " + take + " coin(s).");
            coins -= take;
            System.out.println("There are " + coins + " coin(s).");
            if (coins <= 0)
                whoWon = 1;
         }//end of if statement for who is next - computer
         else if (whoIsNext == 2)//human turn
         {
             System.out.println("Please enter an integer between 1 and 3 (inclusive).");
             youDecide = s.nextInt();
             while (youDecide < 1)
             {
                 System.out.println("Please take at least one coin.");
                 System.out.println("Please enter an integer between 1 and 3 (inclusive).");
                 youDecide = s.nextInt();
             }//end of human putting less than 1
             while (youDecide > 3)
             {
                 System.out.println("Please do not take more than 3 coins per turn.");
                 System.out.println("Please enter an integer between 1 and 3 (inclusive).");
                 youDecide = s.nextInt();
             }//end of human putting bigger than 3
             
             if (youDecide == 1 || youDecide == 2 || youDecide == 3)
             {
                System.out.println("Human takes " + youDecide + " coin(s)");
                coins -= youDecide;
                System.out.println("There are " + coins + " coin(s) left.");
                if (coins <= 0)
                   whoWon = 2;
             }//end of if human inputs proper number
             whoIsNext = 1;
         }//end of else-if statement for who is next - human
        }//end of while loop

        //display winner messages
        if (whoWon == 1)
        System.out.println("The computer won, bow to your AI overlord");
        
        else if (whoWon == 2)
        System.out.println("The human player won, this time...");
        
        else
        System.out.println("Nobody won, something went wrong");
    }//end of main
}//end of class
