/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_20221011_invoice;

// Feel free to add here any import statements that you need
/**
   This class models information about an invoice composed of invoice items.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class Invoice {
   /*
      TASK #1 - 1 point (0.2 point per attribute)
      Declare the following attributes as private:
         header         of data type   String
         numberOfItems  of data type   int
         items          of data type   array of InvoiceItem
      In addition, you will also declare the following private static constants:
         INITIAL_CAPACITY  of data type   int      set to value   5
         DEFAULT_HEADER    of data type   String   set to value:
         "Thank you for shopping with us, here is your itemized invoice:"
   */
    
   private String header;
   private int numberOfItems;
   private InvoiceItem[] items;
   private static final int INITIAL_CAPACITY = 5;
   private static final String DEFAULT_HEADER = "Shop t'ill you drop";
   
   
   /* TASK #2 - 2 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately all attributes.
      If header is null, use the DEFAULT_HEADER instead.
      If capacity is <= 0, use 1 instead.
   */
   public Invoice(String header, int capacity){
       
      if(header == null)
          this.header = DEFAULT_HEADER;
      else 
          this.header = header;
      numberOfItems = 0;
      if(capacity <= 0) capacity = 1;
      items = new InvoiceItem[capacity];
      
   }// end constructor Invoice
   
   
   
   /* TASK #3 - 2 points
      Write the code for the following no-args constructor.
      Use the DEFAULT_HEADER and INITIAL_CAPACITY as default
      values for the corresponding attributes but make sure 
      that you chain to the 2-args constructor.
   */
   public Invoice(){
       this(DEFAULT_HEADER, INITIAL_CAPACITY);
   }// end constructor Invoice
   
   
   /* TASK #4 - 2 points
      Write the code for the following constructor by deleguating 
      to the 2-arg constructor and using DEFAULT_HEADER.
   */
   public Invoice(int capacity){
      this(DEFAULT_HEADER, capacity);
   }// end constructor Invoice
   
   
   /* TASK #5 - 2 points
      Write the code for the following constructor by deleguating 
      to the 2-arg constructor and using INITIAL_CAPACITY.
   */
   public Invoice(String header){
      this(header, INITIAL_CAPACITY);
   }// end constructor Invoice
   
   
   
   /* TASK #6 - 2 points
      Write a method that allows you to add an already created InvoiceItem
      object to this Invoice.
      If item is null, do not do anything in this method. 
      If your array items cannot accomodate an additional item, resize it
      as we discussed in the lectures and double the capacity of the new array.
   */
   public void addInvoiceItem(InvoiceItem item){
       if (item == null) {
           return;
       }
       if (numberOfItems >= items.length) {
           InvoiceItem[] tmp = new InvoiceItem[items.length * 2];
           System.arraycopy(items, 0, tmp, 0, items.length);
           items = tmp;
       }
       items[numberOfItems++]=item;
   }// end method addInvoiceItem
   
   
   
   /* TASK #7 - 2 points
      Write a method that returns the sum of the total prices of each
      InvoiceItem contained in this Invoice.
   */
   public double getTotalPrice(){
       double sum = 0.0;
       for(InvoiceItem i : items)
           sum += i.getTotalPrice();
       return sum;
       
     
   }// end method getTotalPrice
   
   /* TASK #8 - 2 points
      Write a method that returns a string representing the information
      about the entire Invoice. 
      Here is an example of the format you need to follow when displaying
      the information:
      
      Thank you for shopping with us, here is your itemized invoice:
      
      #1 Squirrel: 25 units, $25.99 per unit (Action figure, comes from outer 
space)
      #2 Walnut: 253 units, $0.10 per unit (Fuel for action figure)
      #3 Spaceship: 1 units, $63.95 per unit (Way to go to outer space)
      
      Total price: $739.0
   */
   public String toString(){
      String result = header + "\n\"";
      int counter = 1;
      for (InvoiceItem i : items)
          result += "#" + counter++ + " " + i.toString() + "\n";
      result += "\n" + "Total price: $" + getTotalPrice();
      return result;
   }// end method toString
}// end public class