/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop2513_20220412_final;

import java.util.ArrayList;

/**
 *
 * @author 24rla
 */
// Feel free to add here any import statements that you need


/*
   You have to write methods in multiple classes all included in this .java file.
   Each class features several tasks for you to complete and is worth 
   a variable amount of points, as summarized in the table below;
   
   class                         points      Tasks
   --------------------------------------------------------------------------
   COP2513FinalExam2022          n/a         main class & method are given
   CollectibleCard               5           #1 to #5
   ListedCollectibleCard         12          #6 to #11
   CollectibleCardsList          11          #12 to #17
   --------------------------------------------------------------------------
                     Totals      28 points   17 tasks
*/






// ----------------------- CLASS COP2513FinalExam2022 --------------------------
   /*
      Use the main() method in this class to test your other classes. 
      We provide you with minimalist tests to get you started. 
      Feel free to modify them or add as many as you need.
      This part of your code will not be graded but will help
      you ensure that your other classes fullfill the requirements.
   */
public class COP2513FinalExam2022 {

   public static void main(String[] args) {
      CollectibleCard[] allCards = {
         new ListedCollectibleCard("Rin and Seri, Inseparable", "Core Set 2021", 278, 0.5, "https://tcgplayer.com/", 13.98),
         new ListedCollectibleCard("Rin and Seri, Inseparable", "Core Set 2021", 278, "https://www.cardkingdom.com/", 19.99),
         new CollectibleCard("Night Shift of the Living Dead", "Unfinity", 81),
         new CollectibleCard("Squirrel Squatters","Unfinity",156,0.03),
         new ListedCollectibleCard("Black Lotus", "Vintage Masters", 4, 6700.00, "https://ebay.com/"),
         new ListedCollectibleCard("Black Lotus", "Beta", 0, "https://www.cardshark.com/", 35000.00)
      };
      
      CollectibleCardsList myCollection = new CollectibleCardsList();
      for(CollectibleCard s : allCards)
         myCollection.add(s);
      System.out.print(myCollection);
   }// end main method
}// end class COP2513FinalExam2022




// ----------------------- CLASS CollectibleCard ----------------------------------
/*
   This class models information about a collectable card in our collection.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.

*/
class CollectibleCard {
   
   /* TASK #1 - 1 point (.25 per attribute)
      Define the following private attributes;
         cardName   of data type   String
                    (The name of the card as it is printed)
         setName    of data type   String
                    (The name of the set the card belongs to)
         number     of data type   int
                    (The number of the card in that set)
         cost       of data type   double
                    (How much we paid for the card)
   */
   
   private String cardName, setName;
   private int number;
   private double cost;
   
   /*
      This no-arg constructor is only here to allow the code
      to compile until you actually complete all tasks.
      Feel free to remove it when you do not need it anymore.
   */

  // public CollectibleCard(){
   
   //}
   
   
   /* TASK #2 - 1 point
      Provide the code for the following 4-args constructor so that it
      initialize the attributes appropriately. Do not modify the name
      of the parameters.
      If the cost passed as parameter is negative, set it to 0.0.      
   */
   public CollectibleCard(String cardName, String setName, int number, double cost){
       this.cardName = cardName;
       this.setName = setName;
       this.number = number;
       if(cost < 0.0){
           this.cost = 0.0;
       }
       else{
           this.cost = cost;
       }
   }// end constructor
   
   /* TASK #3 - 1 point
      Provide the code for the following 3-args constructor so that it
      properly chains with the 4-args constructor from this class.
      Use a cost of 0.0 as default.
   */
   public CollectibleCard(String cardName, String setName, int number){
      this(cardName, setName, number, 0.0);
   }// end constructor



   /* TASK #4 - 1 point
      Provide the code for the following getter method.
   */
   public double getCost(){
      return cost;
   }



   /* TASK #5 - 1 point
      Provide the code for the following toString method so that it
      returns a String describing this object in the following format:
      
      "Rin and Seri, inseparable"
         #278 from "Core Set 2021"
         Cost: $13.98
         
      Please note that our string will feature newlines, tabulations,
      and double quotes around the card name and set name.
      
      If the cost is 0.0, we will return instead: 
      
      "Rin and Seri, inseparable"
         #278 from "Core Set 2021"
         Obtained for free
   */
   public String toString(){
      String s = "\"" + cardName + "\"" + "\n" + "\t#" + number + " from \"" + setName + "\"" + "\n";
      if(cost == 0.0)
          s += "\tObtained for free";
      else
          s+= "\tCost: $" + cost;
      
      return s;
   }// end method toString

}//end class CollectibleCard






// ----------------------- CLASS ListedCollectibleCard --------------------------
/*
   This class models information about a CollectibleCard that 
   has been listed on a website to be sold.
   It is a subclass of the CollectibleCard class.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
*/
class ListedCollectibleCard extends CollectibleCard {
   
   /* TASK #6 - 1 point
      Define the following private attributes;
         sellingPrice      of data type   double
                           (How much the card was sold for)
         sellingWebsite    of data type   String
                           (The URL of the website where we listed)
   */
      
    private double sellingPrice;
    private String sellingWebsite;
    
   /* TASK #7 - 4 points
      Provide the code for the following constructor:
      - Initialize the attributes appropriately.
      - Do not modify the name of the parameters.
      - If the sellingPrice is negative, set it to 0.01.
      - Chain appropriately to the superclass' 4-args constructor.      
   */
   public ListedCollectibleCard( String cardName, 
                                 String setName, 
                                 int number,
                                 double cost,
                                 String sellingWebsite, 
                                 double sellingPrice){
      super(cardName, setName, number, cost);
      if(sellingPrice < 0.0)
          this.sellingPrice = 0.01;
      else
        this.sellingPrice = sellingPrice;
      this.sellingWebsite = sellingWebsite;
   }// end constructor
   
   
   
   
   /* TASK #8 - 1 point
      Provide the code for the following constructor:
      - Chain appropriately to the 6-args constructor.
   */
   public ListedCollectibleCard( String cardName, 
                                 String setName, 
                                 int number,
                                 String sellingWebsite, 
                                 double sellingPrice){
         this(cardName, setName, number, 0.0, sellingWebsite, sellingPrice);
   }




   /* TASK #9 - 3 points
      Provide the code for the following constructor:
      - Chain appropriately to the 6-args constructor.
      - If the cost is negative or zero, the selling price will be 0.01.
      - If the cost is positive, the selling price will be 1.5 times the cost.
   */
   public ListedCollectibleCard( String cardName, 
                                 String setName, 
                                 int number,
                                 double cost,
                                 String sellingWebsite){
       
        super(cardName, setName, number, cost);
        this.sellingWebsite = sellingWebsite;
        if(cost <= 0.0)
            this.sellingPrice = 0.01;
        else
            this.sellingPrice = cost * 1.5;
        
   } 
   
   
   
   
   /* TASK #10 - 1 point
      Provide the code for the following getter method so that it
      returns the value of the price attribute.
   */
   public double getSellingPrice(){
      return sellingPrice;
   }// end method getPrice
   
   
   
   
   /* TASK #11 - 2 points
      Provide the code for the following toString method so that it
      returns a String describing this object in the following format:
      
      "Black Lotus"
         #4 from "Vintage Masters"
         Cost: $6700.0
         Listed at https://ebay.com/ for $10050.0
         
      "Black Lotus"
         #0 from "Beta"
         Obtained for free
         Listed at https://www.cardshark.com/ for $35000.0
   */
   public String toString(){
      String k = super.toString() + "\n\t" + "Listed at " + sellingWebsite + " for $" + sellingPrice;
      return k;
   }// end method toString
   
}// end class ListedCollectibleCard







// ----------------------- CLASS CollectibleCardsList ------------------------------
/* 
   This class models information about a list of CollectibleCard objects.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
*/
class CollectibleCardsList {
   
   /* TASK #12 - 1 point
      Define the following private attribute;
         list     of data type   ArrayList of CollectibleCard
   */
   
   private ArrayList<CollectibleCard> list; 
    
    
      
   /* TASK #13 - 1 point
      Provide the code for the following constructor so that it
      initialize the list attribute appropriately.
   */
   public CollectibleCardsList(){
      this.list = new ArrayList<CollectibleCard>();
   }// end constructor




   /* TASK #14 - 1 point
      Provide the code for the following method so that it returns
      the total of the cost for all of the cards in our collection.
   */
   public double getTotalValue(){
       double total = 0.0;
       for(CollectibleCard c: list)
           total += c.getCost();
      return total;
   }
   
   
   
   
   /* TASK #15 - 2 points
      Provide the code for the following method so that it returns
      the total of the sellingPrice for all of the ListedCollectibleCards
      in our collection.
   */
   public double getTotalSales(){
       double result = 0.0;
       for(CollectibleCard c: list)
           if(c instanceof ListedCollectibleCard){
               result += ((ListedCollectibleCard)c).getSellingPrice();
           }
           
      return result;
   }




   /* TASK #16 - 3 points
   Provide the code for the following method so that it adds
   the CollectibleCard passed as parameter to our ArrayList.
   Only add the card if the reference parameter is not null.
   */
   public void add(CollectibleCard s){
      if( s != null)
      list.add(s);
   }//end method add
   
   
   
   
   /* TASK #17 - 3 points
      Provide the code for the following toString method so that it
      returns a String descriping this object in the following format:
      
      Collectible Cards list:
      "Rin and Seri, Inseparable"
      	#278 from "Core Set 2021"
      	Cost: $0.5
      	Listed at https://tcgplayer.com/ for $13.98
      "Rin and Seri, Inseparable"
      	#278 from "Core Set 2021"
      	Obtained for free
      	Listed at https://www.cardkingdom.com/ for $19.99
      "Night Shift of the Living Dead"
      	#81 from "Unfiniti"
      	Obtained for free
      "Squirrel Squatters"
      	#156 from "Unfinity"
      	Cost: $0.03
      "Black Lotus"
      	#4 from "Vintage Masters"
      	Cost: $6700.0
      	Listed at https://ebay.com/ for $10050.0
      "Black Lotus"
      	#0 from "Beta"
      	Obtained for free
      	Listed at https://www.cardshark.com/ for $35000.0
      Total value is $6700.53
      Total sales is $45083.97      "
   */
   public String toString(){
      String end = "Collectible Cards list: ";
      for(CollectibleCard s: list){
          end += "\n" + s.toString();
      }
      end += "\nTotal value is $" + this.getTotalValue() + "\nTotal sales is $" + this.getTotalSales();
      return end;
   }// end method toString
   
 }// end class CollectibleCardsList

