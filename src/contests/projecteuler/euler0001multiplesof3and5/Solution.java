package contests.projecteuler.euler0001multiplesof3and5;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Contests > ProjectEuler+ > Project Euler #1: Multiples of 3 and 5
 *       Link: https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */
public class Solution {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            findMultiples(n);
        }
        
        in.close(); // we close the scanner
    }


    // Check for multiples
    public static void findMultiples (long n) {
      
      // Check multiples of 3, 5 or 15
      long lMultiple3  = (n - 1) /  3;
      long lMultiple5  = (n - 1) /  5;
      long lMultiple15 = (n - 1) / 15;
      
      long MultipleSum = 3 * lMultiple3  * (lMultiple3  + 1) / 2 + 
                         5 * lMultiple5  * (lMultiple5  + 1) / 2 -
                        15 * lMultiple15 * (lMultiple15 + 1) / 2;
      
      System.out.println(MultipleSum);
      return ;
    }
    
}