package practice.java.strings.javastringtokens;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Java String Tokens
 *       Link: https://www.hackerrank.com/challenges/java-string-tokens/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = s.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        
        for (String token : tokens) {
            System.out.println(token);
        }
        
    }
}
