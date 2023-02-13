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
import java.util.ArrayList;

/** TOTAL = 4 points
   This class models information about a list of prioritized help desk tickets
   and provides a few useful methods to manage them.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class IE3bPrioritizedHelpDeskTicketsList 
   extends IE3bHelpDeskTicketsList{   
   
   
   /* TASK #1 - 5 points
      Return the percentage of completed tickets:
      = 100.0 * (sum of closed tickets' priorities / sum of all tickets' priorities)
      The priority for a IE3BHelpDeskTicket is assumed to be 1 since these
      do not have a priority attribute.
      To get full credit, make sure you use a for-each loop.
      You will also make sure that the value returned has, at maximum, 
      two decimal digits of precision. E.g., if you compute that the result 
      is 76.92307692307692 you will return 76.92.
   */
   public double computeCompletionRate(){
      int numberClosedTickets = 0; 
      for(IE3bHelpDeskTicket t: this)
        if(t.isClosed()) numberClosedTickets++;
      return ((int)((100.0 * numberClosedTickets) / super.size()) * 100) / 100 ;
   }
}// end class