package practice.java.datastructures.javastack;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Java > Data Structures > Java Stack
 *       Link: https://www.hackerrank.com/challenges/java-stack/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

class Solution {
    
    private static final Map<Character, Character> bracketMap;
    static {
        bracketMap = new HashMap<Character, Character>();
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');
    }    

    private static boolean isBalanced (String aExpression) {
        if (aExpression == null || aExpression.length() % 2 != 0) {
            return false;    
        }
        
        ArrayDeque<Character> expressions = new ArrayDeque<>();
        
        for (int i = 0; i < aExpression.length(); i++) {
            Character ch = aExpression.charAt(i);
            
            if (bracketMap.containsKey(ch)) {
                expressions.push(ch);
            } else if (expressions.isEmpty() || ch != bracketMap.get(expressions.pop())) {
                return false;
            }
        }        

        return expressions.isEmpty();
    }
            
  public static void main(String []argh) {
    Scanner sc = new Scanner(System.in);
    
    while (sc.hasNext()) {
      String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input) == true ? "true" : "false");            
    }
        
        sc.close();   
  }
}
