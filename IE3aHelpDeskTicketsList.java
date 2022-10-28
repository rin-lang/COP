/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_ie03;



/**
 *
 * @author 24rla
 */
// Feel free to add here any import statements that you need
import java.util.ArrayList;

/** TOTAL = 8 points
   This class models information about a list of help desk tickets
   and provides a few useful methods to manage them.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class IE3aHelpDeskTicketsList {
    
   /* TASK #1 - .5 point
      Declare the following private attributes:
         requests       of data type   ArrayList of IE3aHelpDeskTicket
                        (list of all tickets)
   */
   private ArrayList<IE3aHelpDeskTicket> requests;
   
   
   /* TASK #2 - .5 point
      Write the code for the following constructor so that it
      initializes appropriately all attributes.
   */
   public IE3aHelpDeskTicketsList(){
       requests = new ArrayList<>();
   }// end no-args constructor
   
   
   
   /* TASK #3 - 1 point
      Write a method that allows you to add an already created
      IE3HelpDeskTicket object to our ArrayList attribute (.5 point).
      Simply ignore requests to add null references (.5 point).
   */
   public void addRequest(IE3aHelpDeskTicket t){
       requests.add(t);
   }// end addRequest method
   
   

      
   /* TASK #4 - 2 points
      Write a method that returns the percentage of tickets
      that have been resolved (marked as closed).
      To get full credit, make sure you use a for-each loop.
   */
   public double computeCompletionRate(){
      // replace the code in this method by your code
      double a = 0.0;
      double b = 0.0;
      for(IE3aHelpDeskTicket t: requests){
          if(t.isClosed() == true){
              a++;
          }
          b++;
      }
      
      return (a/b) * 100;
   }// end getTotalTotalDays method
   



   /* TASK #5 - 4 points
      Write a method that returns a string describing
      all of the tickets stored in the attribute list.
      You will start with a line that reads: 
      
         HELP DESK TICKETS LIST (75.0% complete):
      
      where 75.0 will be replaced by the actual percentage
      of tickets that are closed.
      
      You will also display before the information on 
      each ticket a line like the following: 
      
         ---------- Ticket #1
      
      You will start counting tickets from 1.
      
      To get full credit make sure you use a for-each loop.
      Take a look at the comments in IE3a.java for a detailed
      sample of what this string would look like.
   */
   public String toString(){
      // replace the code in this method by your code
      String a = "HELP DESK TICKETS LIST (" + computeCompletionRate() + "% complete):";
      int tracker = 1;
      for(IE3aHelpDeskTicket t: requests){
        a += "\n" + "---------- Ticket #" + tracker + t.toString() + "\n";
        tracker ++;
      }
      return a;
   }// end toString method
   
   
}// end class