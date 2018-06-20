package practice.java.strings.javastringreverse;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Java String Reverse (Palindrome)
 *       Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // Do a Palindrome check
        String backsie = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(backsie) ? "Yes" : "No");
        
        sc.close();
    }
}
