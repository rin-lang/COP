/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
/*
   Student Name: 
   Program:       BattleCanoes
   Date:          5/1/2021
   Objective:
      
      The methods in this file implement a simpler version of the battleship game.
      Two players each have a board that represents a river (1-dimensional array)
      with a fixed number of locations. They each place a canoe on it, occupying
      consecutive locations.
      
      Each method is detailed below but take a look at the code in the main method
      to see how they are used all together to implement the game.
      
      IMPORTANT
         1. You are not allowed to change the methods headers or use global 
variables
            (we did not study those yet)
         2. Always compile both files before to run BattleCanoesHelper.java
         4. The methods below compile but need to have their code replaced by your 
own code
            in order to successfully implement the requirements
*/
public class Final2021BattleCanoes {
   
   /* POINTS: 1
      This method will be called when your other methods detect a problem.
      It shuts down the whole application after displaying an error message 
(parameter)
      to explain what happened.
      
      Example:
         If this method is called with the String parameter "Something went Boom!"
         It will display the following message:
            ERROR - Something went Boom!
         Then exit the whole application by calling System.exit(1);
         
      Rubric
         1pt   Displaying the proper error message & exiting the app.
   */
   public static void fail(String msg){
   System.out.println("ERROR - " + msg);
   System.exit(1);
   }
   
   /* POINTS: 1
      This method takes an array of int values that represents the board
      for one of the players and returns a String representation for it.
      
      It builds a String starting with "[".
      
      The array of int is then iterated, and we concatenate to the end of the
      string a symbol corresponding to the int value specified at that
      location in the board.
      To do so, we just call the method renderCell that, given an int value,
      returns the corresponding symbol to represent it in a String.
      
      When we are done iterating over all elements of the array parameter, we
      concatenate a last "]" to finalize the string and return it. 
      
      Example: 
         If the parameter array board contains the following values;
            {0,1,2,3,6,7}
         The returned string will be; 
            "[~\/=X.]"
         Please note that the correspondance between int values and symbols is 
         completely handled in the renderCell method below.
         
      Rubric
         1pt   For each test passed in the testRenderBoardMethod (3)
   */
   public static String renderBoard(int[] board){
      String result = "[";
      for (int cell: board)
          result += renderCell(cell);
      result += "]";
      return result;
   }// end method
   
   
   
   /* POINTS: 2
      This method is where we implement the correspondance between the int values
      stored in the array representing a player's board, and the symbols that are
      used to display the board as a String to the user.
      
      Your method is given the int value as parameter and returns a String with the
      corresponding symbol. The correspondance is as follows;
      
         int value      symbol returned
         0              ~
         1              \
         2              /
         3              =
         6              X
         7              .
         
      For any other value, an empty string is returned.
         
      Please note that the numbers are not consecutive. The values 4 and 5 are 
reserved
      for future extensions (DLC?).
      
      Rubric
         1/5pt   For each test passed in the testRenderCellMethod (10)
   */
   public static String renderCell(int value){
      switch(value)
      {
          case 0: return "~";
          case 1: return "\\";
          case 2: return "/";
          case 3: return "=";
          case 6: return "X";
          case 7: return ".";
      }
      return "";
   }// end method
   
   
   
   
   /* POINTS: 2
      This method is used to display the boards corresponding to two players
      in one line of text. The format is something like 
      
         P1 takes a shot at P2   P1 [~\==/~~~]    P2[~~~\==/~~]
         
      The line starts by a message passed to your method (1st parameter).
      It is followed by a tabulation (tab), then followed by "P1", followed by
      another tabulation. After this will come a String representing player 1's 
board
      (2nd parameter). 
      
      After that, one more tabulation followed by the same information for
      player 2's board (3rd parameter).
      
      Remember to use the renderBoard method to get String representations of
      each player's board.
      
      Rubric
         1pt   Proper use of renderBoard
         1pt   Proper concatenation of all necessary data into the String being 
displayed
   */
   public static void displayBoards(String msg, int[] board1, int[] board2){
      System.out.println(msg + "\t" + "P#1" + "\t" + renderBoard(board1) + "\t" + "P#2" + "\t" + renderBoard(board2));
   }// end method
   
   
   
   /* POINTS: 4
      This method takes an array of int representing a board, as well as
      the size of a canoe that needs to be placed in it.
      
      The canoe's size cannot be lesser than 3, or exceed the length
      of the board. If an invalid value is passed, your method will 
      call the fail method with the following error message: 
         
               "Specified canoe size is not acceptable."
      
      If the size is appropriate, you will then determine a random position
      for the canoe to start, as well as compute the position at which the canoe
      ends (based on its starting position and its length).
      
      Rubric
         1pt   Handles bad values for canoeSize parameter with fail method
         1pt   Computes proper random start location for the canoe
         1pt   Computes proper end location for the canoe
         1pt   Proper usage of the placeCanoe method to update the board
               with values representing the canoe.
   */
   public static void placeRandomCanoe(int[] board, int canoeSize){
      if(canoeSize > board.length || canoeSize < 3)
          fail("Specified canoe size is not acceptable.");
      int start = 0;
      int end = board.length - canoeSize;
      start = start + (int)(Math.random()*(end+1));
      end = start + canoeSize - 1;
      placeCanoe(board, start, end);
   }// end method
   
   
   
   /* POINTS: 3
      This method takes a board as parameter, as well as the start 
      and end index for the position of the canoe.
      
      It marks the first position of the canoe with a value 1 ("\")
      and its last position with a value 2 ("/") in the array.
      In between these two symbols, we will write the value 3 representing
      the body of the canoe ("=").
      
      Example
         If the method is called with the following parameters:
            board    contains only water {0,0,0,0,0,0,0,0}
            start    is 2
            end      is 5
         Then, the board will be updated so that it now contains:
            {0,0,1,3,3,2,0,0}
         If you were to call renderBoard on this you would get a high-def
         picture of a canoe on a river: ~~\==/~~
            
      Rubric
         1pt   For each test passed in the testPlaceCanoeMethod (3)
   */
   public static void placeCanoe(int[] board, int start, int end){
   board[start] = 1;
   board[end] = 2;
   for(int i = start + 1; i < end; i++)
       board[i] = 3;
   }
   
   
   
   /* POINTS: 5
      This method take a player's board as parameter and returns an index value
      corresponding to a randomly selected valid position to shoot at.
      
      A valid location in the board is a location that does not contains the values
      6 (canoe's part has been shot, represented by "X") or 7 (previous shot in the
water,
      represented by ".")
      
      If you determine that there are no such suitable board locations, your method
      will call the fail method with the following message:
            
            "Unable to take one more shot to this board: "
      
      The above will be followed by a String representation of the board.
      
            
      Suggested Algorithm
         1. Count how many locations (N) in the board are suitable to be selected
         2. Generate a random number from 0 to N (not included)
         3. Find the index of the Nth suitable location
         
      During step 3. if you fail to find the index (for example your reach the end
      of the array but did not find the Nth suitable location), then you have a 
bug.
      You will then call the fail method again with the following message: 
      
                        "Unable to find random spot #"
         followed by    the number of the suitable location
         followed by    " in this board: "
         followed by    the String representing the board passed as parameter
      
      Return the index that you found, or -1 if you need to return something but
      know you failed to find the index.
      
      Example: 
      
         If your method is given a board containing values {0,7,7,1,6,3,2,0,7}
         The positions at indexes 0,3,5,6, and 7 are valid targets for shooting as
         they all correspond to either water (0) or pieces of canoe (1,2,3).
         
         Your method would return an index that will be randomly chosen among
         0,3,5,6 or 7.
         
      Rubric
         1pt   Proper handling of failure condition #1
         1pt   Proper handling of failure condition #2
         1pt   Good algorithmic approach (even if different than suggestion)
         1/5pt For each test passed in the testTargetMethod (10)
         
   */
   public static int target(int[] board){
      return -1;
   }// end method
   
   
   
   /* POINTS: 4
      This method takes a player board and an index in it. 
      That index represents where we want to shoot in that player board.
      
      If the index is out of ranges, call the fail method with the following 
message;
                        "Specified position ("
         followed by    the index passed as parameter
         followed by    ") is outside this board: "
         followed by    the String representing the board passed as parameter
      
      Similarly, if the index corresponds to a location on the board that has been
      already shot, value 6 ("X") or 7 ("."), then call the fail method with the
      following message:
                        "Specified position ("
         followed by    the index passed as parameter
         followed by    ") was already shot in this board: "
         followed by    the String representing the board passed as parameter
      
      If none of these scenarios occur, you will then replace the value at the 
specified index,
      based on what the current value is:
      
            current     replaced    Meaning
            value       by          
            
            1,2 or 3    6           We hit a piece of the opponent's canoe ("X")
            0           7           We hit the water (".")
            
      Rubric
         1pt   Proper handling of failure condition #1 for both ends of the range
         1pt   Proper handling of failure condition #2
         1/3pt For each test passed in the testShootMethod (6)
   */
   public static void shoot(int[] board, int position){
   
   }// end method shoot
   
   
   
   /* POINTS: 2
      This method takes a player board as parameter and returns the following;
         true     if all pieces of the canoe have been shot
         false    otherwize
         
      Rubric
         1/2pt For each test passed in the testSunkenMethod (4)
   */
   public static boolean sunken(int[] board){
      return false;
   }// end method sunken 
}//end pulic class
   
   
   