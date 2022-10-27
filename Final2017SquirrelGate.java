/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
import java.util.Arrays;

/* 
To help you, this java file already contains the two methods you need to write
but with place holder code inside. This code is just there so that the file 
compiles and does something (not much). Replace that code with your own 
code for these methods. 
The main method is already written. It starts by testing your decode method 
by calling it with a few predefined parameters. Each time, detailed 
information is displayed in the console to help you debug your code. You are 
not required to modify this part of the main, but feel free to add tests if that 
helps you. 
Next, the main method calls your hack method and stores the returned array
of int (the combination) in a reference variable. The squirrels also provided 
you with a method named dial that you must call within hack, as explained in
the comments inside the file, in order to determine how many digits were 
guessed right so far. When called, the dial method will also display useful 
information about how your hack method is performing. This should also help
you find bugs. 
Last but not least, the main method applies your decode method to the key 
that was returned by your hack method. If you got it all working, you will see 
the message left to you by the squirrels. 
May the rodents be with you, always. 
Grading Rubrics 
Points given for overall code quality; 
1 point  Proper indentation (use JGrasps auto indent feature) 
1 point  Use of comments to mark what a closing curly brace is actually 
closing 
1 point  Comment for each variable that you introduce in the code, 
specifying its role 
1 point  Appropriate naming of variables 
This is how the hack method will be graded; 
Declaring the guess array reference variable (1 point) 
Creating the array itself (1 point) 
Initializing the array with value -1 for each element (1 point) 
Iterating over every element of the guess array (1 point) 
Iterating to consider all digits for each element of the guess array (1 point) 
Stopping the iteration when the right digit was found for that element (1 
point) 
Calling dial and passing the guess array appropriately (1 point) 
Using the dial methods return value appropriately (1 point) 
Detecting when we just guessed a new digit right (1 point) 
Stopping the iterations when we guessed all 9 digits (1 point) 
This is how the decode method will be graded; 
Declaring a String reference variable named result & initialized with an 
empty string (1 point) 
Returning an empty string if the length of the two parameters is not the 
same (1 point) 
Iterating over all values in the int array parameter (1 point) 
Modifying each character as explained in the comments (1 point) 
Concatenating the modified character to the result string (1 point) 
Returning the result string (1 point) 
 */
public class Final2017SquirrelGate {

    /**      *
     * THIS IS 1 OF THE 2 METHODS YOU NEED TO WRITE      *
     * This method takes two parameters; an array of int values named k, and a
     * String named s. If s and k are not of the same length, the method returns
     * an empty string: ""      *
     * Otherwise, it returns a new String of the same length than s. In that
     * returned string, each character at index n (between 0 and length - 1) is
     * the result of adding the integer value k[n] to the character found at
     * index n in the parameter string s. 
  *
     */
    public static String decode(int[] k, String s) {
        String result = "";
        
        for (int i = 0; i < k.length; i++)
            result += "" +(char)(s.charAt(i) +k[i]);
        return result; // this "place holder" code only returns s, replace it with your code 
    } // end of method 

    /**      *
     * THIS IS THE OTHER METHOD YOU NEED TO WRITE      *
     * This method must create an array of 9 int values named guess. Initially,
     * all values in the guess array are set to -1.      *
     * Let's keep track of how many digits we guessed right so far. A digit is
     * guessed right if the correct value is in the right slot in the array. We
     * start by storing that, so far, we have guessed 0 of the 9 digits right.      *
     * For each element of the guess array: For each digit between 0 and 9
     * (inclusive): Assign that value to that element Call the dial method
     * (already implemented) with the guess array as parameter      *
     * If the return value shows that we guessed all 9 digits, then return the
     * guess array If the return value shows that we guessed 1 more digit than
     * before, then do the following; update the number of digits we guessed
     * right stop trying new values for this element of the array and skip
     * instead to trying digits for the next element 
  *
     */
    public static int[] hack() {

        // this version only tries one arbitrary guess, 
        // uses dial to get the number of digits we guessed 
        // right, ignores the result, and just return guess 
        // replace all this with your code so as to actually 
        // adress the requirements 
        int[] guess = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
        int score = 0, best = 0;
        
        for(int i = 0; i< guess.length; i++)
            for (int j = 0; j < 10; j++)
            {
                guess[i] = j;
                score = dial(guess);
                if (score > best)
                {
                    best = score;
                    break;
                }
            }
        return guess;
    } // end of method 

    /**
     * YOU DON'T HAVE TO MODIFY THE MAIN 
  *
     */
    public static void main(String[] args) {
        System.out.println("RUNNING your decode method");
        // this string makes it easy to see how each letter has been modified 
        // so we use it to test your decode method 
        String msg = "abcde";
        // We put a bunch of keys in a 2D array so we may iterate over them 
        int[][] keys = {
            {0, 0, 0, 0, 0}, // this key changes nothing 
            {1, 1, 1, 1, 1}, // take next letter for each character in the message 
            {4, 3, 2, 1, 0} // applies different changes to different characters 
        };

        // iterate over all the keys and use them to decode msg 
        // with the help of your decode method 
        for (int test = 0; test < keys.length; test++) {
            System.out.println("\tDecoding " + msg
                    + " with key " + Arrays.toString(keys[test])
                    + " --> " + decode(keys[test], msg));
        }

        // running your hack method to see if it is able to crack the code 
        System.out.println("\n\nRUNNING your hack method");
        int[] key = hack();

        // When you are done with the whole final exam 
        // running the code below will reveal the message that the squirrels 
        // left for you before they left 
        System.out.println("\n\nThe squirrels left you a note...");
        System.out.print(decode(key, "BweGlm]ks"));
    } // end of main 

    /**
     * YOU DON'T HAVE TO MODIFY THE METHOD DIAL      *
     * It takes an array of 9 int values that represents a possible 9 digit
     * combination and returns the number of values that you guessed right;
     * i.e., when the right value is in the right position in the combination 
  *
     */
    public static int dial(int[] guess) {
        int[] solution = {0, 2, 0, 1, 9, 0, 4, 3, 0}; // code to discover 
        int score = 0; // how many digits were discovered in the guess 

        // just checking a few things in case your hack method is not calling 
        // this one properly 
        if (guess.length != solution.length) {
            System.out.println("Your code is not of the appropriate length; "
                    + guess.length + " instead of " + solution.length);
            System.exit(-1);
        } // end if 

        for (int e : guess) {
            if ((e < -1) || (e > 9)) {
                System.out.println("Out of range value found in your guess: " + e);
                System.exit(-1);
            } // end if 
        }
        // scoring the guess array you passed as parameter       
        for (int i = 0; i < solution.length; i++) {
            score += (solution[i] == guess[i]) ? 1 : 0;
        }

        // determining if you guessed all 9 digits 
        if (score == solution.length) {
            System.out.print("\nYou guessed the combination and unlocked all chevrons with code "); 
        }
       
        else 
           System.out.print("\t" + score + " digit(s) in the combinations were guessed with code "); 

        System.out.println(Arrays.toString(guess));

        return score;
    } // end of method 
} // end of class
