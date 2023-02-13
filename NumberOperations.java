/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberopsdriver;

/**
 *
 * @author 24rla
 */
public class NumberOperations {
   private int number;
   public NumberOperations(int numberln) {
       this.number = numberln;
   }
   public int getValue()
   {
      return number; //placeholder return
   }
   public String oddsUnder()     {         
      String output = "";         
      int i = 0;         
      while (i < number) {             
         if (i % 2 != 0) {                 
            output += i + "\t";
         }             
         i++;         
      }         
      return output;  
   }
   public String powersTwoUnder()     {         
      int powers = 1;         
      String output = "";         
      while (powers < number) {             
         output += powers + "\t"; // concatenate to output             
         powers = powers * 2; // get next p ower of 2        
      }         
      return output;     
   }
   public int isGreater(int compareNumber)     {         
      if (number > compareNumber) {             
         return 1;
      }         
      else if (number < compareNumber) {             
         return -1;
      }         
      else {             
         return 0;
      }     
   }         
   public String toString() {         
      return number + " ";    
   } 
} 

