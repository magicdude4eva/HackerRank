package practice.java.strings.javaanagrams;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Java Anagrams
 *       Link: https://www.hackerrank.com/challenges/java-anagrams/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {
  

  public static String sortString(String inputString) {
      char tempArray[] = inputString.toLowerCase().toCharArray();
      Arrays.sort(tempArray);
      return new String(tempArray);
  }

  static boolean isAnagram(String a, String b) {
      // Complete the function
      
      // quick check, if empty or not the same length, not an anagram
      if (a == null || b == null || a.length() != b.length()) {
          return false;
      }
      
      return sortString(a).equalsIgnoreCase(sortString(b));
  }

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
  