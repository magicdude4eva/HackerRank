package practice.tutorials.crackingthecodinginterview.stringsmakinganagrams;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Strings: Making Anagrams
 *       Link: https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();

        String b = scanner.nextLine();
        
        scanner.close();
        
        System.out.println(anagramNumber(a,b));
    }
    
    /* Super easy hack. We iterate through all characters of the first string
       and if found in the second string, we delete it from both strings.
       We are then left with two strings containing the characters needed for the 
       anagram */
    private static int anagramNumber(String a, String b) {
        char[] a1 = a.toCharArray();
        
        for (int i=0; i < a1.length; i++) {
            if (b.indexOf(a1[i]) != -1) {
                a = a.replaceFirst(String.valueOf(a1[i]), "");
                b = b.replaceFirst(String.valueOf(a1[i]), "");
            }
        }
        
        return a.length() + b.length();
    }
    
    
}
