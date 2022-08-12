package practice.tutorials.thirtydaysofcode.day19interfaces;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 19: Interfaces
 *       Link: https://www.hackerrank.com/challenges/30-interfaces/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

interface AdvancedArithmetic{
  int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
  
  public int divisorSum(int n) {

    // A number's divisor will always be 1 and the number itself.
    // We can init the sum as n+1 itself.
    int sum = (n == 1) ? 1 : n + 1;
    
    // Shorten the loop: We start the loop from i=2 till i<=n/2 because the
    // greatest divisor of the number will not be greater than its half.
    for (int i = 2; i <= n/2; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
  
    return sum;
  }
  
}

class Solution {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      scan.close();
      
      AdvancedArithmetic myCalculator = new Calculator(); 
      int sum = myCalculator.divisorSum(n);
      System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
      System.out.println(sum);
  }
}
