/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberopsdriver;

/**
 *
 * @author 24rla
 */
import java.util.ArrayList; 
import java.util.Scanner;  
public class NumberOpsDriver {     
   public static void main(String[] args)     {         
      Scanner in = new Scanner(System.in);         
      ArrayList<NumberOperations> numOpsList = new ArrayList<>();        
      System.out.println("Enter a list of positive integers separated" +                
         " with a space followed by 0:");         
      int n=-1;         
      while (n!=0)         
      {             
         n = in.nextInt();             
         if(n!=0)             {                 
         //add to list                 
            numOpsList.add(new NumberOperations(n));             }         
      }         
      int index=0;         
      while (index < numOpsList.size())         {            
         NumberOperations num = numOpsList.get(index);            
         System.out.println("For: "+num);             
         System.out.println("\tOdds under: "+num.oddsUnder());            
         System.out.println("\tPowers of 2 under: "+num.powersTwoUnder());             
         index++;         }     } }

