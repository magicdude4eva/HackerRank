package practice.tutorials.thirtydaysofcode.day29bitwiseand;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 29: Bitwise AND
 *       Link: https://www.hackerrank.com/challenges/30-bitwise-and/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            
            // let's do this - For each test case, print the maximum possible value of A / B on a new line.
            if ( (k - 1 | k) <= n) {
              System.out.println(k-1);
            } else {
              System.out.println(k-2);
            }
        }

        scanner.close();
    }
}
