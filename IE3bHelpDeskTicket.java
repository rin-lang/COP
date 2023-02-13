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
/** 
   This class models information we keep about a help desk ticket.
   
               YOU DON'T HAVE TO MODIFY THIS FILE
**/
public class IE3bHelpDeskTicket {
   
   private String requestedBy; 
   private String assignedTo; 
   private String description; 
   private String response; 
   private int satisfaction;
   private Date dateOpened; 
   private Date dateClosed;
   public IE3bHelpDeskTicket(String requestedBy, String description){
      this.dateOpened = new Date(); 
      this.satisfaction = -1;
      
      this.requestedBy = requestedBy;
      this.description = description;
      
      this.dateClosed = null;
      this.assignedTo = null;
      this.response = null;
   }
   
   public IE3bHelpDeskTicket(String requestedBy){
      this(requestedBy, "No ticket description, call user directly.");
   }
   
   public IE3bHelpDeskTicket(){
      this("Justin Testicket", "Testing ticket, please ignore.");
   }
   
   public void assignTo(String assignee){
      this.assignedTo = assignee;
   }
   
   public void resolve(String response){
      if(!this.isAssigned()) return; 
      this.dateClosed = new Date(); 
      if(response == null)
         this.response = "No response provided.";
      else
         this.response = response; 
   }
   
   public void resolve(){
      this.resolve(null);
   }
   
   public void provideFeedback(int satisfaction){
      if(!this.isAssigned()) return; 
      if(!this.isClosed()) return; 
      if(satisfaction >=0 && satisfaction <= 5)
         this.satisfaction = satisfaction;
   }
   public boolean isAssigned(){
      return assignedTo != null;
   }
   
   public boolean isClosed(){
      return dateClosed != null;
   }
   public boolean hasResponse(){
      return response != null;
   }
   
   public String toString(){
      String result = "";
      result += this.description + "\n"; 
      result += "\t" + "Requested by:\t" + this.requestedBy + "\n";
      result += "\t" + "Date Opened:\t" + this.dateOpened + "\n";
      if(this.assignedTo != null)
         result += "\t" + "Assigned to:\t" + this.assignedTo + "\n";
      if(this.response != null){
         result += "\t" + "Response is:\t" + this.response + "\n";
         result += "\t" + "Date Closed:\t" + this.dateClosed + "\n";
      }
      if(this.satisfaction != -1)
         result += "\t" + "Satisfaction:\t" + this.satisfaction + "\n";      
      return result;
   }
}// end class