
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24rla
 */
/**
   TODO - add here any import statements that your code needs.
**/

public class COP2513IE0Largest{
   
   /**
      TODO - write this method.This method returns 1 if vector v1 is the "largest", 2 if it is vector v2,
      or 0 otherwise.We define "largest" as follows;
      .If one of the vector has more elements than the other, it is the largest one.
      
      .  If both are the same size, then we look at every element one by one in order.
      .  As soon as one of the two vectors has an element that is > than the corresponding
         element from the other vector, then it is recognized as the "largest" one by our method.
     * @param v1
     * @param v2
     * @return 
   **/
   public static int largest(int[] v1, int[] v2){
       int result = 0;
       if(v1.length > v2.length){
           result = 1;
       }
       else if(v2.length > v1.length){
       result = 2;
       }
       else if(v1.length == v2.length){
           for(int i = 0; i < v1.length; i++){
               if(v1[i] > v2[i]){
                   result = 1;
               }
               else if(v2[i] > v1[i]){
                   result = 2;
               }
               else{
                   result = 0;
               }
           }
       }  
       return result;
   }// end method largest
   
   
   /*
      You do not have to modify the main method except if adding more tests helps you ensure
      that your program fulfills all requirements.
   */
   public static void main(String[] args){
      System.out.println("Testing your method largest(...)");
      
      int[][] testVectors1 = {
         {1,2,3},
         {1,2,3,4},
         {1,2,3},
         {1,2,3}, 
         {2,3,4}
      };
      
      int [][] testVectors2 = {
         {1,2,3,4},
         {1,2,3},
         {1,2,3},
         {2,3,4},
         {1,2,3}         
      };
      
      int [] expectedOutcomes = {
         2, 1, 0, 2, 1
      };
      
      if((expectedOutcomes.length != testVectors2.length)
         ||(expectedOutcomes.length != testVectors1.length)
         ||(testVectors1.length != testVectors2.length)){
         System.out.println("All tables must have the same # of tests");
         System.exit(-1);
      }// end if
      
      int nTests = expectedOutcomes.length;
      
      for(int test=0; test < nTests ; test++){
         int observedOutcome = largest(testVectors1[test], testVectors2[test]);
         System.out.print("\tTest #" + test + " with vectors " 
               + Arrays.toString(testVectors1[test]) + " and " + Arrays.toString(testVectors2[test]));
         if(observedOutcome == expectedOutcomes[test])
            System.out.println(" SUCCEEDED");
         else
            System.out.println(" FAILED");
      }// end for loop
   
   }// end main method



} // end class
