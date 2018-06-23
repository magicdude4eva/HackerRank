package practice.tutorials.thirtydaysofcode.day17moreexceptions;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 17: More Exceptions
 *       Link: https://www.hackerrank.com/challenges/30-more-exceptions/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

//Write your code here
class Calculator {
  int power (int n, int p) throws Exception {
    if (n < 0 || p < 0) {
      throw new Exception("n and p should be non-negative");
    }
    
    return (int) Math.pow(n, p);
  }
}


class Solution{

  public static void main(String[] args) {
  
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while (t-- > 0) {
      
          int n = in.nextInt();
          int p = in.nextInt();
          Calculator myCalculator = new Calculator();
          try {
              int ans = myCalculator.power(n, p);
              System.out.println(ans);
          }
          catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      in.close();
  }
}