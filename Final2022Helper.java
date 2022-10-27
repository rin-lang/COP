import java.util.StringTokenizer;

public class Final2022Helper{
   
   /*
         The main method is used to test the methods that you implemented in Final2022.java.
         
         You do not have to modify the testing methods HOWEVER you are encouraged to use
         this main method to add any other test you wish to do on the methods that you write.
   */
   public static void main(String[] args){
      // Uncomment the following to test the corresponding methods
      // Suggestion - uncomment 1 at a time to reduce the amount of information displayed
      
      // let's define a set of words in English
      String [] englishWords = {
         "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
         "does", "not", "simply", "walk", "into", "take", "plus", "make"
         }; 
      
      // now we define the corresponding set of words translated to French
      String[] frenchWords = {
         "zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
         "fait", "pas", "simplement", "marche", "dans", "prends", "plus", "font"
         };
      
      // we check that each word has a translation available (just in case you add your own)
      if(englishWords.length != frenchWords.length){
         System.out.println("ERROR - cannot run tests if number of words is different in two languages.");
         return;
      }// end validation of our words lists
      
      testTranslateWord(englishWords, frenchWords);
      testTranslateSentence(englishWords, frenchWords);
      testReverseTranslateSentence(englishWords, frenchWords);
      testVerifyTranslation(englishWords, frenchWords);
      testBackAndThereAgainTranslation(englishWords, frenchWords);
   }// end main method
   
   
   
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
   /*
      Do not modify this method, simply use it as you used the 
      one that we wrote together.
   */
   public static String[] tokenize(String sentence){
      StringTokenizer st = new StringTokenizer(sentence);
      int numberOfWords = 0;
      while(st.hasMoreTokens()){
         numberOfWords++;
         st.nextToken();
     }
      String[] words = new String[numberOfWords];
     
      st = new StringTokenizer(sentence);
     
      int index = 0;
      while(st.hasMoreTokens())
         words[index++] = st.nextToken();
      return words;
   
   }// end method tokenize 




   public static void testTranslateWord(String[] l1, String[] l2){
      System.out.println("\nTesting method: translateWord");
      int successes = 0;
      for(int i=0 ; i<l1.length ; i++){
         String word = l1[i];
         String expected = l2[i];
         String observed = Final2022.translateWord(l1,l2,word);
         if(expected.equals(observed)) 
            successes++;
         else 
            System.out.println("\tFAILURE: [" + word + "] translated to [" + observed + "] instead of [" + expected + "]");
      }// end for loop
      System.out.println("---> " + successes + " tests passed out of " + l1.length);      
   }// end method testTranslate

   



   public static void testTranslateSentence(String[] l1, String[] l2){
      System.out.println("\nTesting method: translateSentence");
      String[] originalSentences = { 
         "one does not simply walk into mordor",
         "three plus two make five"
      }; 
      
      String[] translatedSentences = {
         "un fait pas simplement marche dans mordor",
         "trois plus deux font cinq"
      };
      int successes = 0;
      for(int i=0 ; i<originalSentences.length ; i++){
         String original = originalSentences[i];
         String expected = translatedSentences[i];
         String observed = Final2022.translateSentence(l1,l2,original);
         if(expected.equals(observed)) 
            successes++;
         else 
            System.out.println("\tFAILURE: [" + original + "]\n\t\ttranslated to [" + observed + "]\n\t\tinstead of [" + expected + "]");
      }// end for loop
      System.out.println("---> " + successes + " tests passed out of " + originalSentences.length);      
      
      
   }// end method testTranslateSentences
   
   
   
   
   
   public static void testReverseTranslateSentence(String[] l1, String[] l2){
      System.out.println("\nTesting method: reverseTranslateSentence");
      String[] translatedSentences = { 
         "one does not simply walk into mordor",
         "three plus two make five"
      }; 
      
      String[] originalSentences = {
         "un fait pas simplement marche dans mordor",
         "trois plus deux font cinq"
      };
      int successes = 0;
      for(int i=0 ; i<originalSentences.length ; i++){
         String original = originalSentences[i];
         String expected = translatedSentences[i];
         String observed = Final2022.reverseTranslateSentence(l1,l2,original);
         if(expected.equals(observed)) 
            successes++;
         else 
            System.out.println("\tFAILURE: [" + original + "]\n\t\ttranslated to [" + observed + "]\n\t\tinstead of [" + expected + "]");
      }// end for loop
      System.out.println("---> " + successes + " tests passed out of " + originalSentences.length);      
      
      
   }// end method testTranslateSentences
   
   

   
   
   
   
   public static void testVerifyTranslation(String[] l1, String[] l2){
         System.out.println("\nTesting method: verifyTranslation");
      String[] originalSentences = { 
         "one does not simply walk into mordor",
         "three plus two make five"
      }; 
      
      String[] translatedSentences = {
         "un fait pas simplement marche dans mordor",
         "trois plus deux font cinq"
      };
      int successes = 0;   
      for(int i=0 ; i < originalSentences.length ; i++){   
         String original = originalSentences[i];
         String translated = translatedSentences[i];
         boolean result = Final2022.verifyTranslation(l1, l2, original, translated);
         if(!result){
            System.out.println("\tInvalid translation found!");
            System.out.println("\t\tFrom:\t" + original);
            System.out.println("\t\tTo:\t" + translated);
         } else {
            successes++;
         }//end if
      }// end for
      if(successes == originalSentences.length)
         System.out.println("\tAll tests successful");
   }// end method testVerifyTranslation
   
   
   
   
   public static void testBackAndThereAgainTranslation(String[] l1, String[] l2){
      System.out.println("\nTesting a back-and-forth translation:");
      String original = "three plus two make five";
      String[] results = Final2022.backAndThereAgainTranslation(l1, l2, original);
      if(results!=null)
         System.out.println(  "\toriginal    -->\t" + results[0]
                              + "\n\ttranslated\t-->\t" + results[1]
                              + "\n\treversed  \t-->\t" + results[2]);
      else
         System.out.println("\t--->\tNo array returned.");
   }// end method testTranslateBackAndThereAgain
   
   
   
   
}// end public class
