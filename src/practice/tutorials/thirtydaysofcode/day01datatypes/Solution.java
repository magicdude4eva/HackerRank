package practice.tutorials.thirtydaysofcode.day01datatypes;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 1: Data Types
 *       Link: https://www.hackerrank.com/challenges/30-data-types/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  
  public static void main(String[] args) {
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";
  
      Scanner scan = new Scanner(System.in);
      /* Declare second integer, double, and String variables. */
      int i2 = 0; double d2 = 0.0; String s2 = "";

      /* Read and save an integer, double, and String to your variables.*/
      // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
      i2 = scan.nextInt();
      d2 = scan.nextDouble();
      s2 = scan.next() + scan.nextLine();
      
      /* Print the sum of both integer variables on a new line. */
      System.out.println(i + i2);

      /* Print the sum of the double variables on a new line. */
      System.out.println(d + d2);
  
      /* Concatenate and print the String variables on a new line; 
        the 's' variable above should be printed first. */
      System.out.println(s + s2);      
      scan.close();
  }
}
