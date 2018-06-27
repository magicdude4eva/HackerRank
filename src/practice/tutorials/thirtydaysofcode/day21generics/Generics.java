package practice.tutorials.thirtydaysofcode.day21generics;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 21: Generics
 *       Link: https://www.hackerrank.com/challenges/30-generics/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Printer <T> {
  /**
  *    Method Name: printArray
  *    Print each element of the generic array on a new line. Do not return anything.
  *    @param A generic array
  **/
  
  // Write your code here
  // Iterate  through the generic array and print it out
  public void printArray (T[] aGenericArray) {
    for (T genericElement : aGenericArray) {
      System.out.println(genericElement);
    }
    
  }
}

public class Generics {
  
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      Integer[] intArray = new Integer[n];
      for (int i = 0; i < n; i++) {
          intArray[i] = scanner.nextInt();
      }

      n = scanner.nextInt();
      String[] stringArray = new String[n];
      for (int i = 0; i < n; i++) {
          stringArray[i] = scanner.next();
      }
      scanner.close(); // savages of HackerRank never close th escanner
      
      Printer<Integer> intPrinter = new Printer<Integer>();
      Printer<String> stringPrinter = new Printer<String>();
      intPrinter.printArray( intArray  );
      stringPrinter.printArray( stringArray );
      if(Printer.class.getDeclaredMethods().length > 1){
          System.out.println("The Printer class should only have 1 method named printArray.");
      }
  } 
}