/* Author: Daniel Higley */
/* Course: CSC 360 */
/* Date: 11/24/2015 */
/* Assignment: 8 - Word Frequency */
/* Instructor: Dr. Qi Li */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
  public static void main(String[] args) throws Exception {
    // Create a file instance with the file name given as a command line argument
    File file = new File(args[0]);

    // #TEST
    /* System.out.println(file.exists()); */
    /* System.out.println(file.canRead()); */

    try {
      Scanner input = new Scanner(file);

      while (input.hasNextLine()) {
        String line = input.nextLine();
        System.out.println(line);
      }
      input.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
