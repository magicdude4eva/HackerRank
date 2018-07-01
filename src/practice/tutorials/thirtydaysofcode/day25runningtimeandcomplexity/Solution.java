package practice.tutorials.thirtydaysofcode.day25runningtimeandcomplexity;

import java.math.BigInteger;
import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 25: Running Time and Complexity
 *       Link: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);
      
      int testCases = scanner.nextInt();
      
      // We do the savage thing and just use BigInteger to work out primality :-)
      for (int i = 0; i < testCases; i++) {
        String possiblePrime = scanner.next();
        BigInteger number = new BigInteger(possiblePrime);
        System.out.println(number.isProbablePrime(10) ? "Prime" : "Not prime");
      }

      scanner.close();
    }
}
