/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_20221118_ie3b;

/**
 *
 * @author 24rla
 */
// Feel free to add here any import statements that you need for your tests
/**
   Use the main() method in this class to test your other classes. 
   We provide you with minimalist tests to get you started. 
   Feel free to modify them or add as many as you need.
   This part of your code will not be graded but will help
   you ensure that your other classes fulfill the requirements.
**/
public class IE3b2022{
   public static void main(String[] args){
   
      IE3bHelpDeskTicket t1,t2,t3,t4,t5;
      t1 = new IE3bHelpDeskTicket(); 
      t2 = new IE3bHelpDeskTicketWithPriority("Important User"); 
      t2.assignTo("Dedicated Techsupport"); 
      t3 = new IE3bHelpDeskTicketWithPriority("Concerned User", "There is smoke everywhere and the screensaver's flames look pretty real!", 9); 
      t3.assignTo("Maurice Moss");
      t3.resolve("Use made-in-Britain fire extinguisher.");
      t4 = new IE3bHelpDeskTicket("lifetime learner", "OMG! Help! I cannot find this exam on schlegg.com!");
      t4.assignTo("Hans Tructor");
      t4.resolve("Use office hours to get help on practice exercises.");
      t4.provideFeedback(0);
      t5 = new IE3bHelpDeskTicket(); 
      
      IE3bPrioritizedHelpDeskTicketsList tickets = new 
      IE3bPrioritizedHelpDeskTicketsList();
      tickets.add(t1); 
      tickets.add(t2); 
      tickets.add(t3);
      tickets.add(t4);
      tickets.add(t5);
      
      System.out.println(tickets);
   }// end main
}// end class