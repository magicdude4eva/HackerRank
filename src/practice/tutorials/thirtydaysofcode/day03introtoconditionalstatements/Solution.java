package practice.tutorials.thirtydaysofcode.day03introtoconditionalstatements;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 3: Intro to Conditional Statements
 *       Link: https://www.hackerrank.com/challenges/30-conditional-statements/copy-from/74824985
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if (N % 2 != 0 || (N >= 6 && N <=20)) {
            System.out.println("Weird");
        } else if ((N >= 2 && N <=5) || (N > 20)) {
            System.out.println("Not Weird");
        }
    }
}
