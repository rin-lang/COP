import java.util.Arrays;

public class Final2021BattleCanoesHelper {
   /*
         The main method is used to test the methods that you implemented in Final2021BattleCanoes.java.
         
         You do not have to modify the testing methods HOWEVER you are encouraged to use
         this main method to add any other test you wish to do on the methods that you write.
   */
   public static void main(String[] args){
      
      // Uncomment the following to test the corresponding methods
      // Suggestion - uncomment 1 at a time to reduce the amount of information displayed
      
      testRenderBoardMethod();
      testRenderCellMethod();
      testPlaceCanoeMethod();
      testShootMethod();
      testSunkenMethod();
      testTargetMethod();
      
      /*
         With the Final2021BattleCanoes.java file provided to you, the following code will loop infinitely.
         
         As you implement the methods, you may uncomment it so as to simulate a 2-players game.
         
         Before that, you may use the code below to better understand how all the methods work
         together to implement the game.
      */
      
      /*
      System.out.println("Simulating game between two RNG players:");
      // Board for each of the players, we go with size 20
      int[] board1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      int[] board2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      
      int canoeSize = 5; // size of the canoe of each player
      int winner = 0; // will be 1 or 2 depending on who wins
      
      // let us place one canoe randomly in each board
      Final2021BattleCanoes.placeRandomCanoe(board1, canoeSize);
      Final2021BattleCanoes.placeRandomCanoe(board2, canoeSize);
      
      // display the initial setup
      Final2021BattleCanoes.displayBoards("Initial boards setup:", board1, board2);
      
      while(winner == 0){
         // P1 takes a random shot at P2
         Final2021BattleCanoes.shoot(board2, Final2021BattleCanoes.target(board2));
         Final2021BattleCanoes.displayBoards("P1 takes a shot at P2:", board1, board2);
         
         // did P1 win?
         if(Final2021BattleCanoes.sunken(board2)){
            winner = 1;
            break;
         }// end if
         
         // P2 takes a random shot at P1
         Final2021BattleCanoes.shoot(board1, Final2021BattleCanoes.target(board1));
         Final2021BattleCanoes.displayBoards("P2 takes a shot at P1:", board1, board2);
         
         // did P2 win?
         if(Final2021BattleCanoes.sunken(board1)){
            winner = 2;
            break;
         }// end if
      }// end while
      
      System.out.println("\n\nThe winner is... Player #" + winner + "!!!");
      */
      
      // The following is an example of the trace when running the above code 
      // with all method fully and correctly implemented: 
      
      /*
                        Testing method: simulateGameWithRandomPlayers
                        Initial boards setup:	P#1	[~~\===/~~~~~~~~~~~~~]	P#2	[~~~~~~~~~~~~~~~\===/]
                        P1 takes a shot at P2:	P#1	[~~\===/~~~~~~~~~~~~~]	P#2	[~~~~~~~~~~~.~~~\===/]
                        P2 takes a shot at P1:	P#1	[~~\===/~~~.~~~~~~~~~]	P#2	[~~~~~~~~~~~.~~~\===/]
                        P1 takes a shot at P2:	P#1	[~~\===/~~~.~~~~~~~~~]	P#2	[~~~.~~~~~~~.~~~\===/]
                        P2 takes a shot at P1:	P#1	[~~\X==/~~~.~~~~~~~~~]	P#2	[~~~.~~~~~~~.~~~\===/]
                        P1 takes a shot at P2:	P#1	[~~\X==/~~~.~~~~~~~~~]	P#2	[~~~.~~~~~~~..~~\===/]
                        P2 takes a shot at P1:	P#1	[~~\X==/.~~.~~~~~~~~~]	P#2	[~~~.~~~~~~~..~~\===/]
                        P1 takes a shot at P2:	P#1	[~~\X==/.~~.~~~~~~~~~]	P#2	[~~~.~~~~~~~..~~X===/]
                        P2 takes a shot at P1:	P#1	[~~\X==/.~~.~~~~~~~.~]	P#2	[~~~.~~~~~~~..~~X===/]
                        P1 takes a shot at P2:	P#1	[~~\X==/.~~.~~~~~~~.~]	P#2	[.~~.~~~~~~~..~~X===/]
                        P2 takes a shot at P1:	P#1	[~~\X=X/.~~.~~~~~~~.~]	P#2	[.~~.~~~~~~~..~~X===/]
                        P1 takes a shot at P2:	P#1	[~~\X=X/.~~.~~~~~~~.~]	P#2	[.~~.~~~~~~~..~.X===/]
                        P2 takes a shot at P1:	P#1	[~~\X=X/.~~.~~~.~~~.~]	P#2	[.~~.~~~~~~~..~.X===/]
                        P1 takes a shot at P2:	P#1	[~~\X=X/.~~.~~~.~~~.~]	P#2	[.~~..~~~~~~..~.X===/]
                        P2 takes a shot at P1:	P#1	[~~\X=X/.~~.~.~.~~~.~]	P#2	[.~~..~~~~~~..~.X===/]
                        P1 takes a shot at P2:	P#1	[~~\X=X/.~~.~.~.~~~.~]	P#2	[..~..~~~~~~..~.X===/]
                        P2 takes a shot at P1:	P#1	[~~\XXX/.~~.~.~.~~~.~]	P#2	[..~..~~~~~~..~.X===/]
                        P1 takes a shot at P2:	P#1	[~~\XXX/.~~.~.~.~~~.~]	P#2	[..~..~~~~~~..~.XX==/]
                        P2 takes a shot at P1:	P#1	[.~\XXX/.~~.~.~.~~~.~]	P#2	[..~..~~~~~~..~.XX==/]
                        P1 takes a shot at P2:	P#1	[.~\XXX/.~~.~.~.~~~.~]	P#2	[..~..~~~.~~..~.XX==/]
                        P2 takes a shot at P1:	P#1	[.~\XXX/.~..~.~.~~~.~]	P#2	[..~..~~~.~~..~.XX==/]
                        P1 takes a shot at P2:	P#1	[.~\XXX/.~..~.~.~~~.~]	P#2	[.....~~~.~~..~.XX==/]
                        P2 takes a shot at P1:	P#1	[.~\XXXX.~..~.~.~~~.~]	P#2	[.....~~~.~~..~.XX==/]
                        P1 takes a shot at P2:	P#1	[.~\XXXX.~..~.~.~~~.~]	P#2	[.....~~~.~~..~.XXX=/]
                        P2 takes a shot at P1:	P#1	[.~XXXXX.~..~.~.~~~.~]	P#2	[.....~~~.~~..~.XXX=/]
                        
                           
                        The winner is... Player #2!!!
      */

   }// end main
   
   
   
   /*
      ======================== WARNING ========================
      
      You are not required to modify anything below this line.
      The following methods each run a series of predefined tests and will
      display messages whenever a test fails.
      To this end, they are using 2-dimensional array syntax that you are not
      expected to modify during the exam.
      If you need to add some tests, add them directly in the main method above
      or make up your own methods and call them from the main.
      
      ======================== WARNING ========================
   */
   public static void testTargetMethod(){
      
      int failures = 0, successes = 0; 
      System.out.println("Testing method: target");
      // first, we test when a single spot is available
      int[][] boards = {
         {6,6,6,0,7,7,7}, // in position 3
         {6,6,6,1,7,7,7},
         {6,6,6,2,7,7,7},
         {6,6,6,3,7,7,7},
         {0,6,6,6,7,7,7}, // in position 0
         {1,6,6,6,7,7,7},
         {6,6,6,7,7,7,2}, // in position 6
         {6,6,6,7,7,7,3},
         {0,6,6,1,7,7,2}, // in position 0, 3 or 6
         {1,6,6,2,7,7,3}
         };
      
      int[][] positions = {
         {3},{3},{3},{3},
         {0},{0},
         {6},{6},
         {0,3,6} , {0,3,6}
         };
      
      int nTests = Math.min(boards.length, positions.length);
      for(int test = 0 ; test < nTests ; test++){
         int observed = Final2021BattleCanoes.target(boards[test]);
         boolean oneAtLeast = false;
         for(int i=0 ; i < positions[test].length ; i++){
            int expected = positions[test][i];
            if(expected == observed)
               oneAtLeast = true;
         }// end inner for
         if(!oneAtLeast){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tExpected 1 of the following possible positions: " + Arrays.toString(positions[test]));
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }// end if
      }// end outer for
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   }
   
   
   public static void testSunkenMethod(){
      System.out.println("Testing method: sunken");
      int[][] boards = {
         {},
         {0,0,0,0,0,0,0},
         {0,1,3,2,0,0,0},
         {0,0,6,6,6,7,7}
         };
      
      boolean[] expected = {
         true,
         true,
         false,
         true
         };
      int failures = 0, successes = 0;
      
      int nTests = Math.min(boards.length, expected.length);
      for(int test = 0 ; test < nTests ; test++){
         boolean observed = Final2021BattleCanoes.sunken(boards[test]);
         if(!(observed == expected[test])){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tExpected: " + expected[test]);
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }
      }
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   }
   
   
   public static void testShootMethod(){
      System.out.println("Testing method: shoot");
      int[][] boards = {
         {0,0,0,0,0,0,0}, // testing missed shots at different positions
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,1,0,0,0}, // testing different types of hits at same position
         {0,0,0,2,0,0,0},
         {0,0,0,3,0,0,0},
         };
      int[] positions = {
         0, 6, 3,
         3, 3, 3
         };
      int[][] results = {
         {7,0,0,0,0,0,0},
         {0,0,0,0,0,0,7},
         {0,0,0,7,0,0,0},
         {0,0,0,6,0,0,0},
         {0,0,0,6,0,0,0},
         {0,0,0,6,0,0,0}
         };
      int failures = 0, successes=0;
      int nTests = Math.min(boards.length, Math.min(results.length, positions.length));
      for(int test = 0 ; test < nTests ; test++){
         Final2021BattleCanoes.shoot(boards[test], positions[test]);
         
         String expected = Arrays.toString(results[test]);
         String observed = Arrays.toString(boards[test]);
         
         if(!(expected.equals(observed))){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tExpected: " + expected);
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }
      }
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   
   }
   
   
   
   public static void testRenderBoardMethod(){
      int failures = 0, successes = 0; 
      System.out.println("Testing method: renderBoard");
      
      int[][] data = {
         {0,1,2,3,6,7},
         {4,5},
         {}
         };
      
      String[] rendered = {
         "[~\\/=X.]",
         "[]",
         "[]"
         };
      
      int nTests = Math.min(rendered.length, data.length);
      for(int test = 0 ; test < nTests ; test++){
         String expected = rendered[test];
         String observed = Final2021BattleCanoes.renderBoard(data[test]);
         if(!(expected.equals(observed))){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tBoard data was: " + Arrays.toString(data[test]));
            System.out.println("\t\tExpected: " + expected);
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }
      }
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   }// end tests for renderBoard
   


   public static void testRenderCellMethod(){
      int failures = 0, successes = 0;
      System.out.println("Testing method: renderCell");
      int[] data = {0,1,2,3,4,5,6,7,-1,8};
      String[] results = {
         "~", "\\", "/", "=", "", "", "X", ".", "", ""
         };
      
      int nTests = Math.min(results.length, data.length);
      for(int test = 0 ; test < nTests ; test++){
         String expected = results[test];
         String observed = Final2021BattleCanoes.renderCell(data[test]);
         if(!(expected.equals(observed))){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tExpected: " + expected);
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }
      }
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   }
   
   
   public static void testPlaceCanoeMethod(){
      int failures = 0, successes = 0; 
      System.out.println("Testing method: placeCanoe");
      int[] start =  {0, 1, 5};
      int[] end   =  {2, 5, 7}; 
      int[][] results = {
         {1,3,2,0,0,0,0,0},
         {0,1,3,3,3,2,0,0},
         {0,0,0,0,0,1,3,2}
         };
      
      int nTests = Math.min(end.length, Math.min(results.length, start.length));
      for(int test = 0 ; test < nTests ; test++){
         int[] board = {0,0,0,0,0,0,0,0};
         Final2021BattleCanoes.placeCanoe(board, start[test], end[test]);
         
         String expected = Arrays.toString(results[test]);
         String observed = Arrays.toString(board);
         
         if(!(expected.equals(observed))){
            System.out.println("\tTest #" + test + " failed");
            System.out.println("\t\tExpected: " + expected);
            System.out.println("\t\tObserved: " + observed);
            failures++;
         } else {
            successes++;
         }
      }
      System.out.println("\t" + successes + " out of " + nTests + " tests passed");
   }// end testPlaceCanoeMethod
   
      
      
}// end public class
