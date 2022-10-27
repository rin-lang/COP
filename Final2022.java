/*
   Student Name:  Katherine Lang
   Program:       Final2022
   Date:          4/30/2022
   Objective: Create a simple translator given two String arrays contianing words of two different langauges and a sentence/word. 
      
      The methods in this file implement a simpler version of a English / French
      translator (it is a very bad translator :) be reassured)
      
      The work that you have to do in each method is detailed below.
      
      We use a method named Final2022Helper.tokenize that works like the one
      you implemented during the semester. However, a version of it is provided
      already in the file Final2022Helper.java and you do not have to even look at it.
      Just use it as we used the one you implemented during the semester.
      
      In addition, the file Final2022Helper.java contains a main method that will 
      run a bunch of tests on each of the methods you are writing in this file.
      
      Feel free to comment out some of the tests when you want to have less output
      on the screen. This might be useful when you're busy troubleshooting issues
      with a particular test and don't want to see the output for all others.
      
      IMPORTANT
         1. You are not allowed to change the methods headers or use global variables
            (we did not study those yet)
         2. Always compile both files before to run Final2022Helper.java
         4. The methods below compile but need to have their code replaced by your own code
            in order to successfully implement the requirements
*/



public class Final2022 {
   


   /* POINTS: 4
      This method takes the following parameters: 
      -  Two arrays of Strings that each represents a list of words
      in a given language. Each word, at a given index in the 1st array,
      translates to the word at the same index in the 2nd array.
      - A String that represents the word that we want to translate.
      
      The translation is done by looking for the word to translate in 
      the list of words in the first array. If we find it, we use
      the index at which it was found to return the corresponding word
      from the 2nd array.
      
      If we look through the entire first array without finding the word
      that we have to translate, then we simply return it instead.
      
      Example: 
         Let's assume that we want to translate from English to French.
            lang1    is    { "one" , "two" }
            lang2    is    { "un" , "deux" }
            word     is    "two"
         The value returned by the method will be "deux".
         
      Rubric
         1pt   Remove any spaces characters from the beginning and end 
               of the String parameter word
         1pt   Convert the resulting string to lower cases
         1pt   If the resulting String appears in lang1, 
               return the corresponding String from lang2
         1pt   If it does not, return word
   */
   public static String translateWord(String[] lang1, String[] lang2, String word){
      word = word.toLowerCase().trim();
      for(int i = 0 ; i < lang1.length ; i++)
      {
          if(lang1[i].equals(word))
              return lang2[i];
      }//end of for loop which returns the corresponding word in second array for translation
      return word;
   }// end method translate
   
   
      
   
   /* POINTS: 4
      This method takes the following parameters: 
      -  Two arrays of Strings that each represents a list of words
      in a given language. Each word, at a given index in the 1st array,
      translates to the word at the same index in the 2nd array.
      - A String that represents the SENTENCE that we want to translate.
      
      The translation is done by using the translateWord method.
      We construct a new String that contains the translation of the 
      sentence parameter, word by word. This translation is done by 
      using the translateWord method that we previously wrote.
      
      To help us break down the sentence into separate words that we
      may then translate independently, you are provided with the method
      
         Final2022Helper.tokenize
         
      This method works exactly like the one you wrote in class: 
         -  It takes a String with lowercase words separated by spaces
            and without any punctuation
         -  It returns an array of String with each String being a copy
            of one of the words from the sentence
            
      Example: 
         Let's assume that we want to translate from English to French.
            lang1    is    { "one" , "two" }
            lang2    is    { "un" , "deux" }
            sentence is    "  one  two  three  "
         The value returned by the method will be "un deux three".
         
      Rubric
         1pt   Correctly use the tokenize method to get an array of
               all words in the sentence
         1pt   Translate each word individually by using translateWord
         1pt   Concatenate the translations into a String that is 
               returned by this method
         1pt   Remove extra spaces at the beginning and end of the 
               translation before to return it
   */
   public static String translateSentence(String[] lang1, String[] lang2, String sentence){
      String[] tokens = Final2022Helper.tokenize(sentence);
      String[] sen = new String[tokens.length];//the sentence broken into single words put into an array (sen)tence :p
      String result = "";
      
      for(int i = 0; i < tokens.length; i++)
      {
         sen[i] = translateWord(lang1, lang2, tokens[i]);
         result += sen[i] + " ";
      }//end of for loop which translates each separated word in the array and adds it to result with space between words
      result = result.trim();
      return result;
   }// end method translate sentence
   
   
   
   
   /* POINTS: 4
      This method takes the following parameters: 
      -  Two arrays of Strings that each represents a list of words
      in a given language. Each word, at a given index in the 1st array,
      translates to the word at the same index in the 2nd array.
      - A String that represents the SENTENCE that we want to REVERSE translate.
      
      With the previous translateSentence method, if lang1 contained words
      in English and lang2 words in French, then the 3rd parameter would
      be always translated from English to French (lang1 to lang2). 
      
      Reverse-translating simply means that we want the 3rd parameter
      to be instead translated from lang2 to lang1. 
      
      To get full credit, make sure you come up with the simplest possible
      implementation.
            
      Example: 
         Let's assume that we want to reverse-translate from French to English.
            lang1    is    { "one" , "two" } (same as before)
            lang2    is    { "un" , "deux" } (same as before)
            sentence is    "  un  deux  trois  "
         The value returned by the method will be "one two trois".
         
      Rubric
         2pts  Correctness of your solution
         2pts  Simplicity of your implementation
   */
   public static String reverseTranslateSentence(String[] lang1, String[] lang2, String sentence){
      String[] temp = new String[lang1.length];
      String result = "";
      
      //the following switches the contents of arrays lang1 and lang2
      System.arraycopy(lang1, 0, temp, 0, lang1.length);
      System.arraycopy(lang2, 0, lang1, 0, lang1.length);
      System.arraycopy(temp, 0, lang2, 0, lang2.length); 
      
      result = translateSentence(lang1, lang2, sentence).trim();//translates after switching the contents of the arrays
      return result;
   }// end method translate sentence
   
   
   
   
   /* POINTS: 4
      This method takes the following parameters: 
      -  Two arrays of Strings that each represents a list of words
      in a given language. Each word, at a given index in the 1st array,
      translates to the word at the same index in the 2nd array.
      -  Two Strings that represent an original SENTENCE and its translation
      
      The method returns true if the translation is accurate.
      
      Example: 
         Let's assume that we want to translate from English to French.
            lang1    is    { "one" , "two" } (same as before)
            lang2    is    { "un" , "deux" } (same as before)
            originalSentence     is    "one two trois"
            translatedSentence   is    "un deux trois"
         The value returned by the method will be true.
         
      Rubric
         2pts  Correctness of your solution
         2pts  Correct and efficient usage of other existing methods
   */      
   public static boolean verifyTranslation(String[] lang1, String[] lang2, String originalSentence, String translatedSentence){
      if(translateSentence(lang1, lang2, originalSentence).equals(translatedSentence))
        return true;
      else
        return false;
   }// end method verifyTranslation
   
   
   
   /* POINTS: 4
      This method takes the following parameters: 
      -  Two arrays of Strings that each represents a list of words
      in a given language. Each word, at a given index in the 1st array,
      translates to the word at the same index in the 2nd array.
      -  A String that represents an original SENTENCE to be translated
      
      The method returns an array of 3 Strings: 
         - at index 0 we have the original String
         - at index 1 we have its translation
         - at index 2 we have the reverse-translation of its translation
         
      A "back      
      Example: 
         Let's assume that we want to reverse-translate from French to English.
            lang1    is    { "one" , "two" } (same as before)
            lang2    is    { "un" , "deux" } (same as before)
            sentence is    "one two three"
            
         The value returned by the method will be the array:
            { "one two three", "un deux three", "one two three" }
         
      Rubric
         1pt   Correct allocation and return of the array
         3pt   Correct assignment of the required value at the 
               specified indexes in the array
   */      
   public static String[] backAndThereAgainTranslation(String[] lang1, String[] lang2, String sentence){
       String[] result = new String[3];
       result[0] = sentence;
       result[1] = translateSentence(lang1, lang2, sentence);
       result[2] = reverseTranslateSentence(lang1, lang2, result[1]);
       return result;
   }// end method backAndThereAgainTranslation
}// end public class
