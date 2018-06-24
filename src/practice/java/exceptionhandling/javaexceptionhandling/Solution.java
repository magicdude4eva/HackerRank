package practice.java.exceptionhandling.javaexceptionhandling;

import java.util.Scanner;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Exception Handling > Java Exception Handling
 *       Link: https://www.hackerrank.com/challenges/java-exception-handling/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class MyCalculator {
  /*
  * Create the method long power(int, int) here.
  */
  public long power(int n, int p) throws Exception {
      if (n < 0 || p < 0) {
          throw new Exception("n or p should not be negative.");
      } else if (n == 0 && p == 0) {
          throw new Exception("n and p should not be zero.");            
      }
      
      return (long) Math.pow(n, p);
  }  
}

public class Solution {
  public static final MyCalculator my_calculator = new MyCalculator();
  public static final Scanner in = new Scanner(System.in);
  
  public static void main(String[] args) {
      while (in .hasNextInt()) {
          int n = in .nextInt();
          int p = in .nextInt();
          
          try {
              System.out.println(my_calculator.power(n, p));
          } catch (Exception e) {
              System.out.println(e);
          }
      }
  }
}
