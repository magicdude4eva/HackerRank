package practice.tutorials.thirtydaysofcode.day16stringtointeger;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Tutorials > 30 Days of Code > Day 16: Exceptions - String to Integer
 *       Link: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        
        try {
          System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException nfex) {
          System.out.println("Bad String");
        }
    }
}
