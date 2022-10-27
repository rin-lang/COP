
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
public class Final2018Translator {
     /** 
  The mysterymethod takes a string as parameter and returns a new string 
  that represents its translation, according to arbitrary rules.  
   
  The translated string will have the same exact length than the one passed. 
  To start off with, the translated string is empty. 
   
  We then look at each character of the parameter string and do the 
following; 
     1. If the character from the parameter string is 'i' or 'e', we concatenate 
        'y' instead in the translated string 
     2. If it is a 'v', we concatenate 'w' instead 
     3. If it is none of the above, we concatenate the character as-is 
  **/ 
  public static String mystery(String param){ 
     String tmp = ""; 
     int a = 0;
     // TODO - write your code here 
         
    for (int i = 0; i < param.length(); i++)
    tmp += param.charAt(i);
    while(tmp.contains("i") || tmp.contains("e") || tmp.contains("v"))
     {
        /*if (tmp.contains("i"))
            {
                a = tmp.indexOf("i");
                tmp = tmp.substring(0, a) + "y" + tmp.substring(a+1);
            }
        else if (tmp.contains("e"))
            {
                a = tmp.indexOf("e");
                tmp = tmp.substring(0, a) + "y" + tmp.substring(a+1);
            }
        else if (tmp.contains("v"))
            {
                a = tmp.indexOf("v");
                tmp = tmp.substring(0, a) + "w" + tmp.substring(a+1);
            }*/
         
        a = tmp.contains("i") ? tmp.indexOf("i") : tmp.contains("e") ? tmp.indexOf("e") : tmp.contains("v") ? tmp.indexOf("v") : 0;
        tmp = tmp.contains("i") ? tmp.substring(0, a) + "y" + tmp.substring(a+1)
            : tmp.contains("e") ? tmp.substring(0, a) + "y" + tmp.substring(a+1)
            : tmp.contains("v") ? tmp.substring(0, a) + "w" + tmp.substring(a+1)
            : tmp;
        
     }//end of while loop
     
     return tmp; 
  } 
   
   
  /** 
  The main method is just used to test the above mystery method. 
  **/ 
  public static void main(String[] args){ 
      
     // This array holds the strings to be translated for each test 
     String[] data     = {"jasmine"}; 
      
     // This array holds the expected translations for each test 
     String[] expected = {"jasmyny"}; 
      
      
     for(int i=0 ; i < data.length ; i++){ 
        String observed = mystery(data[i]); 
        String message = "Translating [" + data[i] + "]" 
           + " into [" + expected[i] + "]" 
           + " Observed result is [" + observed + "]" 
           + " TEST IS... "; 
        message +=(observed.equals(expected[i])) ?"SUCCESSFUL" : "FAILED"; 
        System.out.println(message); 
     } 
      
     // TODO 
     // add tests of your own in order to ensure that your program 
     // is working. To do so, you may just add strings to the expected 
     // and observed arrays that we used in the above code 
  } 
}
