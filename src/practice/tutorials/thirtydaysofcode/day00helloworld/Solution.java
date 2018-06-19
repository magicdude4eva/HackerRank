package practice.tutorials.thirtydaysofcode.day00helloworld;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 0: Hello, World.
 *       Link: https://www.hackerrank.com/challenges/30-hello-world/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */


public class Solution {
  public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
    Scanner scan = new Scanner(System.in); 
    
    // Read a full line of input from stdin and save it to our variable, inputString.
    String inputString = scan.nextLine(); 

    // Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
    scan.close(); 
      
    // Print a string literal saying "Hello, World." to stdout.
    System.out.println("Hello, World.");
      
      // TODO: Write a line of code here that prints the contents of inputString to stdout.
    System.out.println(inputString);
  }
}