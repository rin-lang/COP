/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_20221118_ie3b;

/**
 *
 * @author 24rla
 */
// Feel free to add here any import statements that you need
import java.util.Date;
/** TOTAL = 6 points
   This class models information we keep about a help desk ticket.
**/
public class IE3bHelpDeskTicketWithPriority extends IE3bHelpDeskTicket {
   
   private int priority;
   private String requestedBy, description;
   //private Date dateOpened;
   /* TASK #1 - 2 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately ALL attributes.
      The priority passed as parameter should be in the range
      [1:9] inclusive. If the value is outside this range, 
      consider it to be 1 (the lowest priority).
   */
   public IE3bHelpDeskTicketWithPriority(String requestedBy, String description, int priority){
      super(requestedBy, description);
      //this.dateOpened = new Date();
      if(priority >= 1 && priority <= 9)
        this.priority = priority;
      else
         this.priority = 1;

      
   }// end constructor
   /* TASK #2 - 1 point
      This 1-arg constructor chains with the 3-args one.
      It passes the requestedBy name that is provided as parameter,
      "No ticket description, call user directly" as the description,
       and 9 as the priority. 
   */
   public IE3bHelpDeskTicketWithPriority(String requestedBy){
       this(requestedBy, "No ticket description, call user directly.", 9);
   }// end constructor
   
   
   
   
   /* TASK #3 - 1 point
      This 0-arg constructor chains with the 3-args constructor.
      It passes "Justin Testicket" as the name of the requester,
      "Testing ticket, please ignore." as the description,
      and 1 as the priority.
   */
   public IE3bHelpDeskTicketWithPriority(){
      this("Justin Testicket", "Testing ticket, please ignore.", 1);
   }// end constructor
   
   public int getPriority(){
      return this.priority;
   }
   
   
   /* TASK #4 - 2 points 
      Write the code for the following method so that
      it returns a String representing the information
      stored in the attributes.
      You will add a line specifying the priority of this
      ticket at the end of the usual description, and using 
      the same overall format.
      
      Example: ticket that has not yet been assigned nor closed. 
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            Priority:      1
   */
   public String toString(){
      String result = super.toString() + "\tPriority:\t\t" + priority;
      /*String result = "";  
      result += "\t" + "Description:\t" + this.description + "\n"; 
      result += "\t" + "Requested by:\t" + this.requestedBy + "\n";
      result += "\t" + "Date Opened:\t" + this.dateOpened + "\n";
      result += "\t" + "Priority:\t" + this.priority + "\n";*/
      return result;
   }// end toString method
}// end class
