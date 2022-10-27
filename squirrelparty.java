
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
public class squirrelparty {
     public static void main(String[] args) {
         int peanuts = 0;
         int walnuts = 0;
         int almonds = 0;
         String part1 = "";
         String part2 = "";
         boolean test = true;
         Scanner input = new Scanner(System.in);
         String s = "";
         
         
         while (!(s.equalsIgnoreCase("bye")) || !(s.equalsIgnoreCase("exit")))
         {
         s =((input.nextLine()).toLowerCase()).trim();
         if (s.indexOf("=")== -1)
         {
            if (s.equals("bye") || s.equals("exit"))
              break;
            System.out.println("Syntax Error");
            continue;        
         }//end of if
         else 
         {
             part1 = (s.substring(0, s.indexOf("="))).trim();
             part2 = (s.substring(s.indexOf("=") + 1, s.length())).trim();
             
            if (part1.equals("peanuts"))
            {
                 peanuts +=  Integer.parseInt(part2);
            }
            else if (part1.equals("almonds"))
            {
                almonds += Integer.parseInt(part2);
            }

            else if (part1.equals("walnuts"))
            {
                walnuts += Integer.parseInt(part2);
            }
            else 
            {
                System.out.println("Sorry, we do not stock up on " + part1);
                continue;
            }

            
           
 
            
         }//end of else
         System.out.println("Our current stocks are: " + peanuts + " peanuts, " + walnuts + " walnuts, " + almonds + " almonds");
           if (s.equalsIgnoreCase("bye") || s.equalsIgnoreCase("exit"))
               break;
         }//end of while loop
         
        
     }//end of main
}//end of class
