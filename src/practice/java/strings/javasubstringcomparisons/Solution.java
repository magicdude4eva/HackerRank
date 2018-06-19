package practice.java.strings.javasubstringcomparisons;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Java Substring Comparison
 *       Link: https://www.hackerrank.com/challenges/java-string-compare/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            
            if (smallest.compareTo(current) > 0) {
                smallest = current;
            }
            
            if (largest.compareTo(current) < 0) {
                largest = current;
            }
        }
               
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
