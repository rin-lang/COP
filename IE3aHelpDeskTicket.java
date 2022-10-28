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
import java.util.Date;


/** TOTAL = 17 points
   This class models information we keep about a help desk ticket.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class IE3aHelpDeskTicket {
   
   /* TASK #1 - 1 point
      Declare the following attributes as private:
         requestedBy       of data type   String
                           (name of person opening help ticket)
         assignedTo        of data type   String
                           (name of person assigned to assist)
         dateOpened        of data type   Date
                           (Date object created when ticket is opened)
         dateClosed        of data type   Date
                           (Date object created when ticket is resolved)
         description       of data type   String
                           (Description provided by the requester)
         response          of data type   String
                           (Response provided by the person assigned to assist)
         satisfaction      of data type   int
                           (Satisfaction rating from the requester: 0 to 5, inclusive)
   */
    private String requestedBy, assignedTo, description, response;
    private Date dateOpened, dateClosed;
    private int satisfaction;



   /* TASK #2 - 4 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately ALL attributes.
      -->   parameters should be used to assign corresponding 
            attributes
      -->   response, assignedTo and dateClosed should be null
            since a new ticket was just opened and has not yet
            been assigned to anyone to work on it. 
      -->   satisfaction should be -1 since the requester has not 
            had a chance to rate the service provided.
      -->   dateOpened should reference a new object of class Date.
   */
   public IE3aHelpDeskTicket(String requestedBy, String description){
   this.requestedBy = requestedBy;
   this.description = description;
   response = null;
   assignedTo = null;
   dateClosed = null;
   satisfaction = -1;
   dateOpened = new Date();
   }// end constructor




   /* TASK #3 - 0.5 point
      This 1-arg constructor chains with the 2-args one.
      It passes the requestedBy name that is provided as parameter,
      and "No ticket description, call user directly" as the 
      description. 
   */
   public IE3aHelpDeskTicket(String requestedBy){
   this(requestedBy, "No ticket description, call user directly");
   }// end constructor
   
   
   
   
   /* TASK #4 - 0.5 point
      This 0-arg constructor chains with the 2-args constructor.
      It passes "Justin Testicket" as the name of the requester,
      and "Testing ticket, please ignore." as the description.
   */
   public IE3aHelpDeskTicket(){
   this("Justin Testicket", "Testing ticket, please ignore.");
   }// end constructor



   /* TASK #5 - 0.5 point
      Write the code for the following method so that
      it sets the ticket as assigned to the employee whose
      name is passed as parameter.
      We allow the caller to pass null as a way to unassign
      this ticket.
   */
   public void assignTo(String assignee){
   this.assignedTo = assignee;
   }// end method
   
   
   
   /* TASK #6 - 3 points
      Write the code for the following method so that
      it sets the dateClosed to the current time (.5pt)
      and the response attribute to the value passed 
      as parameter (.5pt). 
      However, you will only do all this if the ticket 
      was already assigned to someone (1pt).
      If the response provided is null, set the corresponding
      attribute to "No response provided" (1pt).
   */
   public void resolve(String response){
       if(assignedTo != null){
           dateClosed = new Date();
           if(response == null)
               this.response = "No response provided";
           else
               this.response = response; 
       }
 
   }// end method


  
   /* TASK #7 - 0.5 point
      If someone resolves the ticket by calling this 
      no-arg method, call the one-arg version with 
      null as parameter.
   */
   public void resolve(){
   resolve(null);
   }// end method
   
   
   
   /* TASK #8 - 1.5 point
      Assign the parameter to the corresponding attribute
      only if its value is between 0 and 5 (inclusive), 
      and the ticket has been assigned to someone, and
      it is closed (has been resolved).
   */
   public void provideFeedback(int satisfaction){
   if(satisfaction >= 0 && satisfaction <= 5 && assignedTo != null && dateClosed != null)
       this.satisfaction = satisfaction;
   }



 
   /* TASK #9 - 1.5 point
      Write the following 3 methods (descriptive comments are in them).
   */
   public boolean isAssigned(){
        // returns true if assignedTo is not null
        return !(assignedTo == null);
   }
   
   public boolean isClosed(){
      // returns true if dateClosed is not null
      return !(dateClosed == null);
   }

   public boolean hasResponse(){
      // returns true if response is not null
      return !(response == null);
   }
   
   
   
   /* TASK #10 - 4 points 
      Write the code for the following method so that
      it returns a String representing the information
      stored in the attributes.
      You will use \n and \t so that your string displays on 
      multiple lines as illustrated in the examples below: 
      
      (Please note that when a ticket is not assigned, we skip 
      providing information about that aspect of the ticket. 
      Same for when it's not resolved yet or if the satisfaction
      is still set to -1.)

      Example #1: ticket that has not yet been assigned nor closed. 
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            
      Example #2: ticket assigned to someone but not yet closed
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            Assigned to:   Hans Tructor

      Example #3: ticket assigned and closed but without feedback
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            Assigned to:   Hans Tructor
            Response is:   Use office hours to get help on practice exercises.     
            Date closed:   Fri Oct 28 08:15:23 EDT 2022

      Example #4: ticket assigned, closed, with feedback
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            Assigned to:   Hans Tructor
            Response is:   Use office hours to get help on practice exercises.     
            Date closed:   Fri Oct 28 08:15:23 EDT 2022
            Satisfaction:  0
   */
   public String toString(){
      // replace the code in this method by your code
      String print = "";
      if (!isAssigned()){
          if(!isClosed()){
              print = "\n" + "Description:" + "\t" + description +
                      "\n" + "Requested by:" + "\t" + requestedBy +
                      "\n" + "Date opened:" + "\t" + dateOpened;
          }
      }
      else{
          if(!isClosed()){
              print = "\n" + "Description:" + "\t" + description +
                      "\n" + "Requested by:" + "\t" + requestedBy +
                      "\n" + "Date opened:" + "\t" + dateOpened +
                      "\n" + "Assigned to:" + "\t" + assignedTo;
          }
          else{
              if(hasResponse()){
                  print = "\n" + "Description:" + "\t" + description +
                          "\n" + "Requested by:" + "\t" + requestedBy +
                          "\n" + "Date opened:" + "\t" + dateOpened +
                          "\n" + "Assigned to:" + "\t" + assignedTo +
                          "\n" + "Response is:" + "\t" + response +
                          "\n" + "Date closed:" + "\t" + dateClosed +
                          "\n" + "Satisfaction:" + "\t" + satisfaction;
              }
              else{
                  print = "\n" + "Description:" + "\t" + description +
                          "\n" + "Requested by:" + "\t" + requestedBy +
                          "\n" + "Date opened:" + "\t" + dateOpened +
                          "\n" + "Assigned to:" + "\t" + assignedTo +
                          "\n" + "Response is:" + "\t" + response +
                          "\n" + "Date closed:" + "\t" + dateClosed;
              }
          }
      }  
      return print;
   }// end toString method

}// end class
