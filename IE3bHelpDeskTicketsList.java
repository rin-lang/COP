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
/** 
   This class models information about a list of help desk tickets
   and provides a few useful methods to manage them.
**/
public class IE3bHelpDeskTicketsList extends ArrayList<IE3bHelpDeskTicket>{
   /** TOTAL = 5 points (1 point per attribute or method properly adapted)
      TASK FOR THE WHOLE FILE:
      Modify this entire class so that it extends 
      the appropriate ArrayList class instead of using
      it by composition.
   **/
   //protected ArrayList<IE3bHelpDeskTicket> list;
   
   
   //public IE3bHelpDeskTicketsList(){
     //list = new ArrayList<IE3bHelpDeskTicket>();
   //}
   
   
   public void addThis(IE3bHelpDeskTicket t){
      if(t != null) super.add(t);
   }
   
     
   public double computeCompletionRate(){
      int numberClosedTickets = 0; 
      for(IE3bHelpDeskTicket t: this)
         if(t.isClosed()) numberClosedTickets++;
      return (100.0 * numberClosedTickets) / super.size();
   }
   public String toString(){
      String result = "HELP DESK TICKETS LIST (" + computeCompletionRate() + "% complete):\n";
      int counter = 1; 
      for(IE3bHelpDeskTicket t: this)
         result += "---------- Ticket #" + counter++ + "\n" + t.toString() + "\n";
      return result;
   }  
}// end class
