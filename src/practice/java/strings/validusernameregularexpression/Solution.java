package practice.java.strings.validusernameregularexpression;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Strings > Valid Username Regular Expression
 *       Link: https://www.hackerrank.com/challenges/valid-username-checker/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class UsernameValidator {
  /*
   * Write regular expression here.
   */
  public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}

public class Solution {
  private static final Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
      int n = Integer.parseInt(scan.nextLine());
      while (n-- != 0) {
          String userName = scan.nextLine();

          if (userName.matches(UsernameValidator.regularExpression)) {
              System.out.println("Valid");
          } else {
              System.out.println("Invalid");
          }           
      }
  }
}

