package practice.tutorials.thirtydaysofcode.day10binarynumbers;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > 30 Days of Code > Day 10: Binary Numbers
 *       Link: https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String[] oneparts = Integer.toBinaryString(n).split("[0]+");
        int iMaxCount = 0;
        for (String oneone : oneparts) {
            iMaxCount = Math.max(iMaxCount, oneone.length());
        }
        
        System.out.println(iMaxCount);

        scanner.close();
    }
}

