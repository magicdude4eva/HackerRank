package practice.tutorials.crackingthecodinginterview.stacksbalancedbrackets;

import java.util.*;

/*
 *     Author: Gerd W. Naschenweng
 *     Github: https://github.com/magicdude4eva
 * HackerRank: https://www.hackerrank.com/MagicDude4Eva
 *    Twitter: https://twitter.com/gerdnaschenweng
 *    
 *       Task: Practice > Tutorials > Cracking the Coding Interview > Stacks: Balanced Brackets
 *       Link: https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
 * 
 * CTO, Java Expert, e-commerce guru - available for hire: https://www.naschenweng.info/cv
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            System.out.println(isBalanced(expression) == true ? "YES" : "NO");
        }

        scanner.close();
    }
    
    // We are using a simple map to store the open/closing rule
    private static final Map<Character, Character> bracketMap;
    static {
        bracketMap = new HashMap<Character, Character>();
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');
    }
    
    // Simple method to check: (1) is expression not null or too short
    // (2) we use a Deque to store them and check to see if they balance     
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
}
