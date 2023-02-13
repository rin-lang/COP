/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cop20221103_class;

/**
 *
 * @author 24rla
 */
import java.util.ArrayList;

/*
   The file below contains the classes we developed during
   our last live coding.
   
   We want to create a class AudioBooksPlaylist.
   It will feature the following attributes: 
      .  totalDuration     The duration of all AudioBooks in the playlist
      .  playlist              The list of AudioBooks objects
   We also want the following methods: 
      .  toString                Return String representation of all list
      .  getTotalDuration        Accessor for totalDuration attribute
                                 
   We then want to create a class ProMaxAudioBooksPlaylist.
      .  toStringByNarrator      Same, but just with AudioBooks from 
                                 specified narrator
      .  getDurationByNarrator   Computes the total duration but only 
                                 for AudioBooks with a specific narrator
*/
public class M3L5_ReviewStarterFile { 
   public static void main(String[] args){
         
      Book b1 = new Book("Kevin Mitnick", "This book is not about hacking", Long.MAX_VALUE + 1); 
      Book b2 = new Book("J.R.R. Tolkien", "Where the eagles won't fly", 123457);
      AudioBook b3 = new AudioBook("J.K. Rowling", "Magical sale records and how to achieve them", 123456, "Alan Rickman", 450);
      AudioBook b4 = new AudioBook("J.J. Binks", "Looky, Looky! Mesa Senator!", 456123789, "Anakin", 10);
      AudioBook b5 = new AudioBook("T. Berners-Lee", "Designing the web for future web designers", 19891990, "R. Cailliau", 404);
      AudioBook b6 = new AudioBook("J.J. Binks", "My midi-chlorian count is high, but no one checked.", 45236589, "Anakin", 250);
      
      /*
      System.out.println("\n\nTESTING AUDIOBOOKSPLAYLIST");
      AudioBooksPlaylist pl = new AudioBooksPlaylist(); 
      pl.add(b3);
      pl.add(b4);
      pl.add(b5);
      System.out.println("All AudioBooks in playlist: ");
      System.out.println(pl);
      System.out.println("Total duration = " + pl.getTotalDuration());
      */
      
      
      /*
      System.out.println("\n\nTESTING PROMAX-AUDIOBOOKSPLAYLIST");
      ProMaxAudioBooksPlaylist proMaxPL = new ProMaxAudioBooksPlaylist(); 
      proMaxPL.add(b3);
      proMaxPL.add(b4);
      proMaxPL.add(b5);
      proMaxPL.add(b6);
      System.out.println("All AudioBooks narrated by Anakin: ");
      System.out.println(proMaxPL.toStringByNarrator("Anakin"));
      System.out.println("Total duration = " + proMaxPL.getTotalDurationByNarrator("Anakin"));
      */
   } // end main method
   
} // end main class



class Book {

   private long ISBN;
   private String author;
   private String title;
   
   public Book(String author, String title, long ISBN){
      this.author = author; 
      this.title = title;
      this.ISBN = ISBN;
   } // end constructor

   public long getISBN(){     return ISBN;   }
   public String getAuthor(){ return author; }
   public String getTitle(){  return title;  }
   
   public String toString(){
      return "\"" + title + "\"" + "\n\tby " + author + "\n\tISBN = " + ISBN; 
   } // end toString
   
} // end class Book



class AudioBook extends Book {

   private String narrator;
   private int duration;
   
   public AudioBook(String author, String title, long ISBN, String narrator, int duration){
      super(author, title, ISBN);
      this.narrator = narrator;
      this.duration = duration;
   } // end constructor
   
   public int getDuration(){
      return duration;
   }
   
   public String getNarrator(){
      return narrator;
   }
   
   public String toString(){
      return super.toString() + "\n\tnarrated by " + narrator + "\n\tduration " + duration + " minutes";
   } // end toString
} // end class AudioBook

class AudioBooksPlaylist{
    private int totalDuration;
    private ArrayList<AudioBook> playlist;
    
    public AudioBooksPlaylist(){
        playlist = new ArrayList<>();
        totalDuration = 0;
    }
    
    public void add(AudioBook b){
        playlist.add(b);
    }
    
    public int getDuration(){
        return totalDuration;
    }
    
    public String toString(){
        String result = "";
        for(AudioBook b : playlist){
            result+= "\t" + b.toString() + "\n";
        }
        return result;
    }
}//end of class AudioBooksPlaylist

class ProMaxAudioBooksPlaylist{
    public String toStringByNarrator(){
        return "";
    }
    public int getDurationByNarrator(){
        return 0;
    }
}//end of class ProMaxAudioBooksPlaylist

class AudioBooksPlaylistV2 extends ArrayList<AudioBook>{
    private int totalDuration;
    
    public AudioBooksPlaylistV2(){
        totalDuration = 0;
    }
    
    public boolean add(AudioBook a){
        return super.add(a);
    }
    
    public int getTotalDuration(){
        return totalDuration;
    }
}