/* Author: Daniel Higley */
/* Course: CSC 360 */
/* Date: 11/24/2015 */
/* Assignment: 8 - Word Frequency */
/* Instructor: Dr. Qi Li */
import java.util.*;
import java.io.*;

public class WordFrequency {
  /** Main method */
  public static void main(String[] args) throws Exception{
    // Create an instance of the file with the name given as a command line argument
    // Send the scanner input to the converter to convert it to a string
    try {
      Scanner input = new Scanner(new File(args[0]));
      convertToString(input);
      input.close();
    } catch(Exception e){
      /* e.printStackTrace(); */
      System.out.println("A file name is required as part of the command");
      System.out.println("Run: java WordFrequency <file name>");
    }

  }

  /** Convert the Scanner input to a string that can be parsed */
  public static void convertToString(Scanner input) throws Exception {
    // Convert the file into a string
    String document = "";
    while (input.hasNext()) {
      String word = input.next();
      document += word + " ";
    }

    // Send the string to wordCount
    wordCount(document);
  }

  /** Split the new string using the given delimiters and count each word */
  public static void wordCount(String text) throws Exception {
    // Create a TreeMap to hold words as key and count as value
    Map<String, Integer> map = new TreeMap<>();

    // Strip out all numbers and chars that are not words and add then to an array.
    String delims = "[\\W\\d]+";
    String[] words = text.split(delims);
    // Convert each word in the array to lower case and make it a key word
    for (int i = 0; i < words.length; i++) {
      String key = words[i].toLowerCase();

      if (key.length() > 0) {
        // If the key word is not in the map add it along with the value of 1
        if (!map.containsKey(key)) {
          map.put(key, 1);
        }
        // If the key is already in the map, increment the value and put the
        // key, value back into the map
        else {
          int value = map.get(key);
          value++;
          map.put(key, value);
        }
      }
    }

    // Display key and value for each entry
    map.forEach((k, v) -> System.out.println(k + "\t" + v));
  }
}
