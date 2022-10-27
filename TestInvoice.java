/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_20221011_invoice;

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
   you ensure that your other classes fullfill the requirements.
**/
public class TestInvoice{
   
   public static void main(String[] args){
         System.out.println("Creating InvoiceItem with no-arg constructor:");
         InvoiceItem item1 = new InvoiceItem();
         System.out.println(item1);
         
         System.out.println("Creating another InvoiceItem:");
         InvoiceItem item2 = new InvoiceItem("","",1,5.65);
         System.out.println(item2);
         
         System.out.println("Checking the Unit price: "  + item2.getUnitPrice());
         System.out.println("Checking the total price: " + item2.getTotalPrice());
         System.out.println("Increasing Quantity by 2");
         item2.increaseQuantity(2);
         System.out.println(item2);
         System.out.println("Updated Total Price: " + item2.getTotalPrice());
         
         
         System.out.println("\n\nCreating full invoice with the above InvoiceItems");
         Invoice bill = new Invoice();
         bill.addInvoiceItem(item1);
         bill.addInvoiceItem(item2);
         InvoiceItem item3 = new InvoiceItem("","",2,3.53);
         bill.addInvoiceItem(item3);
         
         System.out.println(bill);
   }// end main method
} // end public class