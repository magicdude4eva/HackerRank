package practice.tutorials.thirtydaysofcode.day06letsreview;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 6: Let's Review
 *       Link: https://www.hackerrank.com/challenges/30-review-loop/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
    
    private static void printEvenOddWords(String aWord) {
        StringBuffer evenWord = new StringBuffer();
        StringBuffer oddWord  = new StringBuffer();
        
        for (int iCount = 0; iCount < aWord.length(); iCount++) {
            if (iCount % 2 == 0) {
                evenWord.append(aWord.charAt(iCount));
            }  else {
                oddWord.append(aWord.charAt(iCount));
            }
        }
        
        System.out.printf("%s %s\n", evenWord, oddWord);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int iTestCases = input.nextInt();
        
        for (int i = 0;i < iTestCases; i++) {
            String strWord = input.next();
            printEvenOddWords(strWord);
        }
        
        input.close();
    }
}