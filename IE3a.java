/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_ie03;

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
public class IE3a{
   public static void main(String[] args){
   
      IE3aHelpDeskTicket t1 = new IE3aHelpDeskTicket(); 
      IE3aHelpDeskTicket t2 = new IE3aHelpDeskTicket("Important User"); 
      t2.assignTo("Dedicated Techsupport"); 
      IE3aHelpDeskTicket t3 = new IE3aHelpDeskTicket("Concerned User", "There is smoke everywhere and the screensaver's flames look pretty real!"); 
      t3.assignTo("Maurice Moss");
      t3.resolve("Use made-in-Britain fire extinguisher.");
      IE3aHelpDeskTicket t4 = new IE3aHelpDeskTicket("lifetime learner", "OMG! Help! I cannot find this exam on schlegg.com!");
      t4.assignTo("Hans Tructor");
      t4.resolve("Use office hours to get help on practice exercises.");
      t4.provideFeedback(0);
      IE3aHelpDeskTicket t5 = new IE3aHelpDeskTicket(); 
      
      IE3aHelpDeskTicketsList tickets = new IE3aHelpDeskTicketsList();
      tickets.addRequest(t1); 
      tickets.addRequest(t2); 
      tickets.addRequest(t3);
      tickets.addRequest(t4);
      tickets.addRequest(t5);
      
      System.out.println(tickets); 
      // The above statement should produce the following display:
      /*
   HELP DESK TICKETS LIST (40.0% complete):
   ---------- Ticket #1
   Testing ticket, please ignore.
   Requested by:	Justin Testicket
   Date Opened:	Wed Oct 26 19:07:03 EDT 2022
   
   ---------- Ticket #2
   No ticket description, call user directly.
   Requested by:	Important User
   Date Opened:	Wed Oct 26 19:07:03 EDT 2022
   Assigned to:	Dedicated Techsupport
   
   ---------- Ticket #3
   There is smoke everywhere and the screensaver's flames look pretty real!
   Requested by:	Concerned User
   Date Opened:	Wed Oct 26 19:07:03 EDT 2022
   Assigned to:	Maurice Moss
   Response is:	Use made-in-Britain fire extinguisher.
   Date Closed:	Wed Oct 26 19:07:03 EDT 2022
   
   ---------- Ticket #4
   OMG! Help! I cannot find this exam on schlegg.com!
   Requested by:	lifetime learner
   Date Opened:	Wed Oct 26 19:07:03 EDT 2022
   Assigned to:	Hans Tructor
   Response is:	Use office hours to get help on practice exercises.
   Date Closed:	Wed Oct 26 19:07:03 EDT 2022
   Satisfaction:	0
   
   ---------- Ticket #5
   Testing ticket, please ignore.
   Requested by:	Justin Testicket
   Date Opened:	Wed Oct 26 19:07:03 EDT 2022
      */
      
   }// end main
}// end class
