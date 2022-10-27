/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */




/*
Grading Rubrics

Points given for overall code quality;

1 point – Proper indentation (use JGrasp’s auto indent feature)
1 point – Use of comments to mark what a closing curly brace is actually closing
1 point – Comment for each variable that you introduce in the code, specifying its role
1 point – Appropriate naming of variables
This is how the generate method will be graded;

Declaring the samples array reference variable (1 point)
Creating the array itself (1 point)
Initializing the array with 10 string containing each a single word of your chosing (1 point)
Declaring a String variable and initializing it to the empty string (1 point)
Iterating to concatenate a word to the above, n times (n being the parameter) (1 point)
Picking a random word from samples at each iteration (1 point)
Concatenating after it a random number of spaces between 1 and 3 inclusive (1 point)
This is how the swapWords method will be graded;

Declaring, create and initialize an array of 2 empty strings (3 point)
Trimming the parameter strings to avoid dealing with extraneous spaces at the start of end of the strings (1 point)
Proper implementation of the loop and its continuation or exit condition(s) (2 point)
Using substring correctly to extract words from s1 and s2 (1 point)
Proper concatenation of extracted words to each of the strings in the "results" array (1 point)
Adding a single space after each word concatenated to the strings in the "results" array, except the last one (1 point
*/
public class Final2019StringsMayhem{

   // 1st METHOD THAT YOU HAVE TO WRITE

   // This method returns a new String that contains the contatenation of n words.
   // The value for n is passed as parameter.
   // Each word is separated from the previous one by a random number of spaces (1 to 3, inclusive)
   // The words are taken randomly from an array of Strings named samples that you will 
   // declare an initialize at the beginning of this method so that it contains 10
   // String literals representing words you chose.
   public static String generate(int n){
       String[] samples = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
       String words = "";
       for (int i = 0 ; i < n ; i++)
        {
            words += samples[(int)(Math.random()*samples.length)];
            for (int j = 0; j < (int)(Math.random()*3) + 1 ; j++)
            {
                words += " ";
                //System.out.println(j);
            }
        }
       
       return words; // replace this with your own code
   }
   
   
   // 2nd METHOD THAT YOU HAVE TO WRITE

   // This method returns a new array of two strings.
   // You will start your method by declaring, creating & initializing this array
   // with 2 empty strings. Name your array "results".
   
   // In order to build the two strings that you want to return in the "results" array,
   // your method will pick words from both s1 and s2. The string resultS[0] will 
   // contain the 1st word from s1, the 2nd from s2, then the 3rd from s1 again...
   // The string results[1] will contain the 1st word from s2, the 2nd from s1...
   // To make things easy to read, you will separate every word in results[0] and results[1]
   // by a single space from the previous one.
   
   // Example;
   // if
   //    parameter s1 is "one  one one one  one"
   //    parameter s2 is "two two    two  two  two"
   // then 
   //    results[0] will be "one two one two one"
   //    results[1] will be "two one two one two"
   
   // To make your life easier, we will assume that both parameter strings s1 & s2
   // always contains the same number of words. A word is separated from the next one by
   // a variable number of spaces  
   public static String[] swapWords(String s1, String s2){
      // replace the place-holder code below with your own code  
      String[] results = {"",""};
      String temp = "";
      boolean trip = true;
      int sp1, sp2;
      while(true)
      {
        s1 = s1.trim();
        s2 = s2.trim();
        sp1 = s1.indexOf(' ');
        sp2 = s2.indexOf(' ');
        if (s1.length() == 0 || s2.length() == 0)
            break;
        if(sp1 == -1 || sp2 == -1)
        {
            results[0] += trip? s1: s2;
            results[1] += trip? s2: s1;
            break;
        }
        else
        {
            results[0] += trip? s1.substring(0, sp1 + 1) : s2.substring(0, sp2 + 1);
            results[1] += trip? s2.substring(0, sp2 + 1) : s1.substring(0, sp1 + 1);
        }
         s1 = s1.substring(sp1 +1);
         s2 = s2.substring(sp2 +1);
         trip = !trip;

        //temp = (i % 2 != 0) ? s1.substring(0, s1.indexOf(" ")) : s2.substring(0, s2.indexOf(" "));
       }
      
      return results;
   }
   
   // The method main is given to you, no need to modify it
   // It calls the generate method your wrote and
   // uses it to pass two random sentences to the swapWords method
   // It displays the outcomes of doing so 5 times in order to help
   // you debug your program
   public static void main(String[] args){
      System.out.println("TESTING generate METHOD");
      for(int i=0 ; i < 5 ; i++)
         System.out.println("\tgenerate("+ i + ") -->\t" + generate(i));
      System.out.println();
      
      System.out.println("TESTING swapWords METHOD");
      String[][] tests = {
         { "one one one" ,       "two two two" },           // basic test 
         { "one  one   one ",    "two   two   two  "},      // variable # of spaces
         { "dog squirrel cat",   "computer phone tablet"},  // variable lengths words
      };
      for(int t=0 ; t < tests.length ; t++){
         System.out.println("\tswapWords(\"" + tests[t][0] + "\" , \"" + tests[t][1] + "\")");
         String[] received = swapWords(tests[t][0], tests[t][1]);
         System.out.println("\t\t-->\t" + received[0]);
         System.out.println("\t\t-->\t" + received[1]);
      }
      System.out.println();
      
      
      System.out.println("TESTING BOTH METHODS TOGETHER");
      for(int i=0 ; i < 5 ; i++){
         System.out.println("\tTest # " + i);
         String s1 = generate(5); 
         String s2 = generate(5);
         String[] result = swapWords(s1,s2); 
         System.out.println("\t\tSentence #1 = " + s1);
         System.out.println("\t\tSentence #2 = " + s2);
         System.out.println("\t\tResult   #1 = " + result[0]);
         System.out.println("\t\tResult   #1 = " + result[1]);
      }
   }
}